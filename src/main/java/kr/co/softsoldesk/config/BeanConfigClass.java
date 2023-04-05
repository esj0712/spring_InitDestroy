package kr.co.softsoldesk.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import kr.co.softsoldesk.beans.TestBean1;

@Configuration //필수!!
public class BeanConfigClass {
	
	@Bean(initMethod = "init", destroyMethod = "destroy")
	@Lazy
	public TestBean1 java1() {
		return new TestBean1();
	}
	
}
