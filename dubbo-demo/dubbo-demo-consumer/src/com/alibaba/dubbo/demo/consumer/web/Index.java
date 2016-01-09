package com.alibaba.dubbo.demo.consumer.web;

import com.alibaba.dubbo.demo.provider.service.DemoService;
import com.github.jsplite.http.JspliteHttpRequest;
import com.github.jsplite.http.JspliteHttpResponse;
import com.github.jsplite.mvc.Controller;
import com.github.jsplite.mvc.ModelView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Index implements Controller {

    private ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-*.xml");

    @Override
    public void execute(JspliteHttpRequest request, JspliteHttpResponse response,
                        ModelView model) throws Exception {
        DemoService demoService = (DemoService) ctx.getBean("demoService");
        String value = demoService.sayHello("钩吻");
        request.setAttribute("hello", value);
    }

}
