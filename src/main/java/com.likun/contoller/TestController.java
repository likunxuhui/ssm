package com.likun.contoller;

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
public class TestController {

    @Autowired
    BookService bookService;
	
	@ResponseBody
	@RequestMapping(value = "/init",produces = MediaType.APPLICATION_JSON_VALUE)
    public String init(Model model,@RequestParam(value="code",required = true,defaultValue = "123")String test,  HttpServletResponse res, HttpServletRequest req) {
        System.out.println(test);
       return "index";
    }

    @RequestMapping(value = "/init2",  produces = MediaType.APPLICATION_JSON_VALUE)
    public String init2(Model model, HttpServletResponse res, HttpServletRequest req) {

        bookService.add();

        return "index";
    }

}
