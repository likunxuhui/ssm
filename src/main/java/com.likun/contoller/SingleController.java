package com.likun.contoller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by likun(li.k@ikcrm.com) on 2017/8/15.
 */
@Controller
@RequestMapping("/single")
public class SingleController {
    private String message;
    @ResponseBody
    @RequestMapping(value = "/a",produces = MediaType.APPLICATION_JSON_VALUE)
    public String init(HttpServletResponse res, HttpServletRequest req) {
        message = req.getParameter("message");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return message;
    }

    @RequestMapping(value = "/b",  produces = MediaType.APPLICATION_JSON_VALUE)
    public String init2(Model model, HttpServletResponse res, HttpServletRequest req) {
        message = req.getParameter("message");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return message;
    }
}
