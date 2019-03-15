package com.wx.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Demo")
public class Demo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置格式
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST");
        response.setHeader("Access-Control-Allow-Headers","x-requested-with,content-type");
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
// 获取客户端cookie
//        request.setCharacterEncoding("utf-8");
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            System.out.println(cookies);
            for (Cookie c : cookies) {
                System.out.println(c.getName() + "--->" + c.getValue());
            }
        }

// 创建Cookie
        Cookie cookie = new Cookie("java", "myJavaData");
// 有效期,秒为单位
        System.out.println(cookie);
        System.out.println(cookies);
        cookie.setMaxAge(3600);
// 设置cookie
        response.addCookie(cookie);
        response.getWriter().print("cookie创建成功");


        //实现具体操作
        String account = request.getParameter("account");
        String pwd = request.getParameter("pwd");
        System.out.println(account+":"+pwd);




        if ("ddd".equals(account)&&"123".equals(pwd)){
            response.setHeader("Access-Control-Allow-Origin", "*");
//            response.setHeader("Cache-Control","no-cache");
            response.addHeader("Access-Control-Allow-Credentials", "true");
            response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
            response.addHeader("Access-Control-Allow-Headers", "Content-Type");
//
            response.getWriter().write("login success，wellcome "+account);

        }else {
            response.getWriter().write("login fail");
            response.sendError(400, "ERROR Incorrect username or password" );
            request.setAttribute("loginInfo", "用户名或密码错误");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doPost(request,response);
    }
}
