package com.wx.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

@WebServlet(name = "download")
public class download extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        download download = new download();
        String zipFilePath = "https://github.com/Askenf/regist/raw/master/test2.zip";
//        getFile getFile = new getFile();
        try {
            String urlNameString = zipFilePath;
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段

            // 遍历所有的响应头字段

        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流



//        BufferedInputStream bis = null;
//        BufferedOutputStream bos = null;
//        InputStream is = null;
//        String zipFileName = "test2.zip";
//
//        File file = new File(zipFilePath);
//        try {
//            is = new FileInputStream(file);
//            response.reset();
//            response.setContentType("application/x-msdownload");
//            response.setHeader("Content-Length", String.valueOf(file.length()));
//            response.setHeader(
//                    "Content-disposition",
//                    "attachment; filename="
//                            + new String(zipFileName.getBytes("GBK"),
//                            "ISO8859-1"));
//            bis = new BufferedInputStream(is);
//            bos = new BufferedOutputStream(response.getOutputStream());
//            byte[] buff = new byte[2048];
//            int bytesRead;
//            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
//                bos.write(buff, 0, bytesRead);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            response.setContentType("text/html");
//            response.getWriter().print("download failed");
//        } finally {
//            try {
//                if (is != null)
//                    is.close();
//                if (bis != null)
//                    bis.close();
//                if (bos != null)
//                    bos.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
