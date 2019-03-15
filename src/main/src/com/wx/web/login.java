package com.wx.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;


@WebServlet(name = "login")
public class login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String queryString = request.getQueryString();
        System.out.println(queryString);


        BufferedReader br = null;
            StringBuilder sb = new StringBuilder("");
            try
            {
                br = request.getReader();
                String str;

                while ((str = br.readLine()) != null)
                {
                    sb.append(str);
                }
                System.out.println(sb);
                String[] split = sb.toString().split("\"");
                System.out.println(split[3]);
                String url = "https://api.weixin.qq.com/sns/jscode2session";
                String param = HttpRequest.sendGet(url, "param", split[3]);
                System.out.println(param);
                br.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            finally
            {
                if (null != br)
                {
                    try
                    {
                        br.close();
                    }
                    catch (IOException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);
    }
}
