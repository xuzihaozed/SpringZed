package com.xu.test;

import org.apache.commons.logging.Log;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.xu.pojos.Dog;
import com.xu.pojos.Person;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "com/xu/xml/beans.xml" });
		//ClassPathResource resource2 = new ClassPathResource("com/xu/xml/beans.xml");
		//Resource resource = new FileSystemResource("src/com/xu/xml/beans.xml");
		BeanFactory factory2 = (BeanFactory) context;
		//BeanFactory factory = new XmlBeanFactory(resource2);
		Dog object2 = (Dog) factory2.getBean("D");
		//Person object = (Person) factory.getBean("A");
		//object.setName("xu");
		//object2.setName("xu");
		
		//System.out.println(object.getName());
		//System.out.println(object2);

	}
}
