package com.likun.service;

import com.likun.dao.BookDao;
import com.likun.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by shuyun on 2016/6/17.
 */
@Service

public class BookService {
    @Autowired
    BookDao bookDao;
    @Transactional
    public void add(){
        Book book = new Book("数据库1",12.2,new Date());
        bookDao.add(book);
        //int o = 9/0;
        Book book2 = new Book("数据库2",12.6,new Date());
        bookDao.add(book2);
    }
}
