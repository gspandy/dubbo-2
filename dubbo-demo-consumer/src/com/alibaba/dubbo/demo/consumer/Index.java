package com.alibaba.dubbo.demo.consumer;

import com.alibaba.dubbo.demo.provider.service.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Index {

    private static ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-*.xml");

    public static void execute(HttpServletRequest request,
                        HttpServletResponse response) throws Exception {
        DemoService demoService = (DemoService)ctx.getBean("demoService");
        String value = demoService.sayHello("钩吻");
        request.setAttribute("hello", value);
    }

}
