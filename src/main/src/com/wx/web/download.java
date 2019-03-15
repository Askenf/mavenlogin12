package com.wx.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet(name = "download")
public class download extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        InputStream is = null;
        String zipFileName = "test2.zip";
        String zipFilePath = "D:\\";
        File file = new File(zipFilePath + zipFileName);
        try {
            is = new FileInputStream(file);
            response.reset();
            response.setContentType("application/x-msdownload");
            response.setHeader("Content-Length", String.valueOf(file.length()));
            response.setHeader(
                    "Content-disposition",
                    "attachment; filename="
                            + new String(zipFileName.getBytes("GBK"),
                            "ISO8859-1"));
            bis = new BufferedInputStream(is);
            bos = new BufferedOutputStream(response.getOutputStream());
            byte[] buff = new byte[2048];
            int bytesRead;
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                bos.write(buff, 0, bytesRead);
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.setContentType("text/html");
            response.getWriter().print("download failed");
        } finally {
            try {
                if (is != null)
                    is.close();
                if (bis != null)
                    bis.close();
                if (bos != null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
