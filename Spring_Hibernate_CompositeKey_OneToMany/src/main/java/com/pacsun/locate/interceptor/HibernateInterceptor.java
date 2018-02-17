package com.pacsun.locate.interceptor;

import org.hibernate.EmptyInterceptor;

public class HibernateInterceptor extends EmptyInterceptor {

	private static final long serialVersionUID = 7525650297347400850L;
	private String catalog;

	public HibernateInterceptor() {
	}

	@Override
	public String onPrepareStatement(String sql) {
		String prepedStatement = super.onPrepareStatement(sql);
		prepedStatement = prepedStatement.replaceAll("PSLCORDH", this.catalog + ".PSLCORDH")
				.replaceAll("PSLCORDD", this.catalog + ".PSLCORDD").replaceAll("PSLCSLR", this.catalog + ".PSLCSLR")
				.replaceAll("PSLCOSU", this.catalog + ".PSLCOSU").replaceAll("PSLCOUM", this.catalog + ".PSLCOUM");
		prepedStatement = prepedStatement + " WITH NC";
		return prepedStatement;
	}

	public String getCatalog() {
		return catalog;
	}

	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}

}