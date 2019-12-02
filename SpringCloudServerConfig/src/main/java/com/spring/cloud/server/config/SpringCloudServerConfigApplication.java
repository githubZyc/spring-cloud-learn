package com.spring.cloud.server.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudServerConfigApplication {

	public static void main(String[] args) {
//		Properties properties = System.getProperties();
//		Enumeration<?> enumeration = properties.propertyNames();
//		while (enumeration.hasMoreElements()){
//			String key        = (String)enumeration.nextElement();
//			String property = properties.getProperty(key);
//			System.out.printf("propertyName: %s \t propertyValue: %s \n",key,property);
//		}
//		//用户目录
//		String userDir = System.getProperty("user.dir");
//		System.out.printf("user.dir %s",userDir);

		SpringApplication.run(SpringCloudServerConfigApplication.class, args);
	}


}
