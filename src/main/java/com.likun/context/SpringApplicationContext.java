package com.likun.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Thread Service 不能直接使用ApplicationContext，需通过ApplicationContextAware间接访问
 * 该类须在 ApplicationContext.xml 中声明 bean
 * @author Arlight
 */
public class SpringApplicationContext implements ApplicationContextAware {

	private static ApplicationContext appContext;

	// Private constructor prevents instantiation from other classes
    private SpringApplicationContext() {}

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		appContext = applicationContext;
	}

	public static Object getBean(String beanName) {
		return appContext.getBean(beanName);
	}

}