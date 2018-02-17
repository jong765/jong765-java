package com.pacsun.junit;

import java.io.IOException;
import java.util.ArrayList;

import javax.naming.ConfigurationException;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SpringJUnit4ClassRunner.class)
// NOTE #1
@ContextConfiguration(loader = AnnotationConfigContextLoader.class)
// NOTE #2
public class TestClass {

	@Inject
	AffinityGroupService _affinityService;

	@Inject
	AccountManager _acctMgr;

	@Inject
	AffinityGroupProcessor _processor;

	@Inject
	AffinityGroupDao _groupDao;

	@Inject
	UserVmDao _vmDao;

	@Inject
	AffinityGroupVMMapDao _affinityGroupVMMapDao;

	@Inject
	AffinityGroupDao _affinityGroupDao;

	@Inject
	EventUtils _eventUtils;

	@Inject
	AccountDao _accountDao;

	@Inject
	EventDao _eventDao;

	private static long domainId = 5L;

	@BeforeClass
	public static void setUp() throws ConfigurationException {
	}

	@Before
	public void testSetUp() {
		ComponentContext.initComponentsLifeCycle(); // NOTE #3
		AccountVO acct = new AccountVO(200L);
		acct.setType(Account.ACCOUNT_TYPE_NORMAL);
		acct.setAccountName("user");
		acct.setDomainId(domainId);

		UserContext.registerContext(1, acct, null, true);

		when(_acctMgr.finalizeOwner((Account) anyObject(), anyString(), anyLong(), anyLong()))
				.thenReturn(acct);
		when(_processor.getType()).thenReturn("mock");
		when(_accountDao.findByIdIncludingRemoved(0L)).thenReturn(acct);

		AffinityGroupVO group = new AffinityGroupVO("group1", "mock", "mock group", domainId, 200L);
		Mockito.when(_affinityGroupDao.persist(Mockito.any(AffinityGroupVO.class))).thenReturn(
				group);
		Mockito.when(_affinityGroupDao.findById(Mockito.anyLong())).thenReturn(group);
		Mockito.when(_affinityGroupDao.findByAccountAndName(Mockito.anyLong(), Mockito.anyString()))
				.thenReturn(group);
		Mockito.when(_affinityGroupDao.lockRow(Mockito.anyLong(), anyBoolean())).thenReturn(group);
		Mockito.when(_affinityGroupDao.expunge(Mockito.anyLong())).thenReturn(true);
		Mockito.when(_eventDao.persist(Mockito.any(EventVO.class))).thenReturn(new EventVO());
	}

	@Test
	public void createAffinityGroupTest() {
		when(_groupDao.isNameInUse(anyLong(), anyLong(), eq("group1"))).thenReturn(false);
		AffinityGroup group = _affinityService.createAffinityGroup("user", domainId, "group1",
				"mock", "affinity group one");
		assertNotNull("Affinity group 'group1' of type 'mock' failed to create ", group);

	}

	@Test(expected = InvalidParameterValueException.class)
	public void invalidAffinityTypeTest() {
		AffinityGroup group = _affinityService.createAffinityGroup("user", domainId, "group1",
				"invalid", "affinity group one");

	}

	@Test(expected = InvalidParameterValueException.class)
	public void uniqueAffinityNameTest() {
		when(_groupDao.isNameInUse(anyLong(), anyLong(), eq("group1"))).thenReturn(true);
		AffinityGroup group2 = _affinityService.createAffinityGroup("user", domainId, "group1",
				"mock", "affinity group two");
	}

	@Test(expected = InvalidParameterValueException.class)
	public void deleteAffinityGroupInvalidIdTest() throws ResourceInUseException {
		when(_groupDao.findById(20L)).thenReturn(null);
		_affinityService.deleteAffinityGroup(20L, "user", domainId, "group1");
	}

	@Test(expected = InvalidParameterValueException.class)
	public void deleteAffinityGroupInvalidIdName() throws ResourceInUseException {
		when(_groupDao.findByAccountAndName(200L, "group1")).thenReturn(null);
		_affinityService.deleteAffinityGroup(null, "user", domainId, "group1");
	}

	@Test(expected = InvalidParameterValueException.class)
	public void deleteAffinityGroupNullIdName() throws ResourceInUseException {
		_affinityService.deleteAffinityGroup(null, "user", domainId, null);
	}

	@Test(expected = ResourceInUseException.class)
	public void deleteAffinityGroupInUse() throws ResourceInUseException {
		List<AffinityGroupVMMapVO> affinityGroupVmMap = new ArrayList<AffinityGroupVMMapVO>();
		AffinityGroupVMMapVO mapVO = new AffinityGroupVMMapVO(20L, 10L);
		affinityGroupVmMap.add(mapVO);
		when(_affinityGroupVMMapDao.listByAffinityGroup(20L)).thenReturn(affinityGroupVmMap);

		AffinityGroupVO groupVO = new AffinityGroupVO();
		when(_groupDao.findById(20L)).thenReturn(groupVO);
		when(_groupDao.lockRow(20L, true)).thenReturn(groupVO);

		_affinityService.deleteAffinityGroup(20L, "user", domainId, null);
	}

	@Test(expected = InvalidParameterValueException.class)
	public void updateAffinityGroupVMRunning() throws ResourceInUseException {

		UserVmVO vm = new UserVmVO(10L, "test", "test", 101L, HypervisorType.Any, 21L, false,
				false, domainId, 200L, 5L, "", "test", 1L);
		vm.setState(VirtualMachine.State.Running);
		when(_vmDao.findById(10L)).thenReturn(vm);

		List<Long> affinityGroupIds = new ArrayList<Long>();
		affinityGroupIds.add(20L);

		_affinityService.updateVMAffinityGroups(10L, affinityGroupIds);
	}

	@Configuration
	@ComponentScan(basePackageClasses = { AffinityGroupServiceImpl.class, EventUtils.class }, includeFilters = { @Filter(value = TestConfiguration.Library.class, type = FilterType.CUSTOM) }, useDefaultFilters = false)
	public static class TestConfiguration extends SpringUtils.CloudStackTestConfiguration { // NOTE
																							// #4

		@Bean
		public AccountDao accountDao() {
			return Mockito.mock(AccountDao.class);
		}

		@Bean
		public AccountService accountService() {
			return Mockito.mock(AccountService.class);
		}

		@Bean
		public AffinityGroupProcessor affinityGroupProcessor() {
			return Mockito.mock(AffinityGroupProcessor.class);
		}

		@Bean
		public AffinityGroupDao affinityGroupDao() {
			return Mockito.mock(AffinityGroupDao.class);
		}

		@Bean
		public AffinityGroupVMMapDao affinityGroupVMMapDao() {
			return Mockito.mock(AffinityGroupVMMapDao.class);
		}

		@Bean
		public AccountManager accountManager() {
			return Mockito.mock(AccountManager.class);
		}

		@Bean
		public EventDao eventDao() {
			return Mockito.mock(EventDao.class);
		}

		@Bean
		public UserVmDao userVMDao() {
			return Mockito.mock(UserVmDao.class);
		}

		public static class Library implements TypeFilter {

			@Override
			public boolean match(MetadataReader mdr, MetadataReaderFactory arg1) throws IOException {
				ComponentScan cs = TestConfiguration.class.getAnnotation(ComponentScan.class);
				return SpringUtils.includedInBasePackageClasses(mdr.getClassMetadata()
						.getClassName(), cs);
			}
		}
	}
}