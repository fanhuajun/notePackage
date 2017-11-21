package org.mybatis.gen;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.api.dom.java.InnerEnum;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultCommentGenerator implements CommentGenerator {
	protected static final Logger logger = LoggerFactory
			.getLogger(DefaultCommentGenerator.class);

	@Override
	public void addClassComment(InnerClass innerClass,
			IntrospectedTable introspectedTable) {

	}

	@Override
	public void addClassComment(InnerClass innerClass,
			IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {
	}

	@Override
	public void addComment(XmlElement xmlElement) {

	}

	@Override
	public void addConfigurationProperties(Properties properties) {

	}

	@Override
	public void addEnumComment(InnerEnum innerEnum,
			IntrospectedTable introspectedTable) {

	}

	@Override
	public void addFieldComment(Field field, IntrospectedTable introspectedTable) {

	}

	@Override
	public void addFieldComment(Field field,
			IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn) {
	    field.addJavaDocLine("//" + introspectedColumn.getRemarks());
	}

	@Override
	public void addGeneralMethodComment(Method method,
			IntrospectedTable introspectedTable) {

	}

	@Override
	public void addGetterComment(Method method,
			IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn) {

	}

	@Override
	public void addJavaFileComment(CompilationUnit compilationUnit) {

	    System.out.println(compilationUnit.getType().getShortName());
	    compilationUnit.addFileCommentLine("/*\n"
	            + " * @(#) " + compilationUnit.getType().getShortName() + ".java " + formatNow() + "\n"
	            + " *\n"
	            + " * Copyright (c), 2016 深圳市万睿智能科技有限公司（Shenzhen Wan Rui Intelligent Technology Co., Ltd.），\n"
	            + " * \n"
	            + " * 著作权人保留一切权利，任何使用需经授权。\n"
	            + "*/");
	}

	private String formatNow(){
	    return new SimpleDateFormat("yyyy年MM月dd日").format(new Date());
	}
	
	@Override
	public void addRootComment(XmlElement rootElement) {

	}

	@Override
	public void addSetterComment(Method method,
			IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn) {

	}
}
