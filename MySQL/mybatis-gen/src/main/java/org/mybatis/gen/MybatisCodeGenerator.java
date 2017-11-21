package org.mybatis.gen;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class MybatisCodeGenerator {
    
	public static void main(String[] args) throws Exception{
	    
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		
		PropertyConfigurator.configure("src/main/resources/log4j.properties");
		File configFile = new File("src/main/java/org/mybatis/gen/generatorConfig.xml");
		
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);
	}
}
