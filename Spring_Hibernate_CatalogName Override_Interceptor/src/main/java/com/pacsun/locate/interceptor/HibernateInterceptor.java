package com.pacsun.locate.interceptor;

import org.hibernate.EmptyInterceptor;

public class HibernateInterceptor extends EmptyInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7525650297347400850L;
	private String catalog;

	public HibernateInterceptor() {
	}

	@Override
	public String onPrepareStatement(String sql) {

		String prepedStatement = super.onPrepareStatement(sql);

		prepedStatement = prepedStatement.replaceAll("OPCUS111.JKLCORDH", this.catalog + ".JKLCORDH");

		return prepedStatement;

	}

	public String getCatalog() {
		return catalog;
	}

	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}

}