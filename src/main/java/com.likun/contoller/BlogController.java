package com.likun.contoller;

import com.likun.dao.BlogMapper;
import com.likun.dao.BookDao;
import com.likun.entity.Book;
import com.likun.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 *
 */
@Controller
@RequestMapping(value = "/blog")
public class BlogController {

    @Autowired
    BlogMapper blogMapper;

    @ResponseBody
    @RequestMapping(value = "/ass",produces = MediaType.APPLICATION_JSON_VALUE)
    public Object init() {

        return blogMapper.selectBlogVO();
    }

    @ResponseBody
    @RequestMapping(value = "/col",  produces = MediaType.APPLICATION_JSON_VALUE)
    public String init2(Model model, HttpServletResponse res, HttpServletRequest req) {



        return "index";
    }

    @ResponseBody
    @RequestMapping(value = "/full",  produces = MediaType.APPLICATION_JSON_VALUE)
    public Object init3() {



        return blogMapper.selectFullBlogVO();
    }


}
