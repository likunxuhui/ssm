package com.likun.servlet;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by likun(li.k@ikcrm.com) on 2017/8/15.
 */
public class SingleServlet extends HttpServlet {
    public SingleServlet(){
        System.out.println("SingleServlet 初始化。。。");
    }

    String message;
    private static final long serialVersionUID = 787553024399133588L;
    public void service(HttpServletRequest request,HttpServletResponse response) throws IOException{
        message =request.getParameter("message");
        PrintWriter pw = response.getWriter();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pw.write("<div><strong>Hello World</strong>!</div>"+message);
        pw.close();
    }
}
