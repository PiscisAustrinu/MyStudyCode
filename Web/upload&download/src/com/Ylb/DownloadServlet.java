package com.Ylb;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

public class DownloadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //        1、获取要下载的文件名
        String download_filename = "logo.gif";
//        2、读取要下载的文件内容(servletContext对象可获取)
        ServletContext servletContext = getServletContext();

//        4、通过响应头告诉客户回传数据类型
        //获取要下载的文件类型
        String mineType = servletContext.getMimeType("/file/"+download_filename);
        System.out.println("下载的文件类型："+mineType);
        resp.setContentType(mineType);
//        5、通过响应头告诉客户回传的数据用于下载
        //URLEncoder,把中文转换为%xx%xx编码
        resp.setHeader("Content-Disposition","attachment;filename = 文件名"+ URLEncoder.encode("中国.gif","UTF-8"));
//        3、把下载的文件内容回传给客户端
        //获取响应的输入流
        InputStream resourceAsStream = servletContext.getResourceAsStream("/file/"+download_filename);
        //获取响应的输出流
        OutputStream outputStream = resp.getOutputStream();
        //读取输入流中全部的数据，复制给输出流
        IOUtils.copy(resourceAsStream,outputStream);
    }
}
