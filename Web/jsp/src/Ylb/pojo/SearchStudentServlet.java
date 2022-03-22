package Ylb.pojo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        1、获取请求的参数：张
//        2、发sql语句到数据库去查询 学生信息
        List<student_message> student_messages = new ArrayList<student_message>();
        for (int i = 0; i < 10; i++) {
            int t = i + 1;
            student_messages.add(new student_message(t, "name" + t, 18 + t, "phone" + t));
        }
//        3、把查询到的学生信息，保存 到request域中
        req.setAttribute("stuList",student_messages);
//        4、请求转发到show_student.jsp页面中
        req.getRequestDispatcher("/test/show_student.jsp").forward(req,resp);
    }
}
