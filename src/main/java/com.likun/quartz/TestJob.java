package com.likun.quartz;

import com.likun.dao.BookDao;
import com.likun.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by shuyun on 2016/6/21.
 */
public class TestJob {
    @Autowired
    BookDao bookDao;

    public TestJob(){
        System.out.println("TestJob  init...");
    }
    public void method1(){
        System.out.println("method1...");
        Book book = new Book("数据库1",12.2,new Date());
        bookDao.add(book);
        //int o = 9/0;
        Book book2 = new Book("数据库2",12.6,new Date());
        bookDao.add(book2);
    }
    public void method2(){
        System.out.println("method2...");
    }

}
