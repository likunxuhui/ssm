package com.likun.app;

import com.likun.config.CacheConfig;
import com.likun.service.BookService;
import com.likun.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import redis.clients.jedis.Jedis;

/**
 * 取安琪OMS数据
 * @author Arlight
 *
 */
public class App {
    public Logger log = LoggerFactory.getLogger(getClass());

    @SuppressWarnings("resource")
    public void init() {
        //初始化Spring环境
       // new ClassPathXmlApplicationContext("classpath:spring/mvc-config.xml");
    }
    public static void main(String[] args) {
        //应用初始化
       // App app = new App();
       // app.init();
//        QuartzJob.work();
       // ApplicationContext context = new ClassPathXmlApplicationContext("classpath:quartz/quartz-config.xml");
        //context.getBean("startQuertz");

        ApplicationContext context = new ClassPathXmlApplicationContext("spring/mvc-config.xml");

//        BookService service = (BookService)context.getBean("bookService");
//        service.add();


//            TestService service = (TestService)context.getBean("testService");
//            service.add();

        Jedis jedis = new Jedis(CacheConfig.getHost(),(CacheConfig.getPort()));
        jedis.set("name","xuhui");
        System.out.println(jedis.get("name"));
        jedis.append("name","xuhui");
        System.out.println(jedis.get("name"));
        jedis.del("name");  //删除某个键
        System.out.println(jedis.get("name"));
        jedis.mset("name","xuhui","age","23","birthday","1991年");
        System.out.println(jedis.mget("name","age"));
    }
}
