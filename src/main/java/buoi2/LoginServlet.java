package buoi2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//value = {"/login", "/ket-qua-login"}: Đây là một mảng các URL patterns mà servlet này sẽ xử lý
//Khi người dùng truy cập vào 1 trong số các URL này, thì LoginServlet sẽ đc gọi đến
@WebServlet(name = "login-servlet",value = {"/login", "/ket-qua-login"})
public class LoginServlet extends HttpServlet {
    //GET: lấy và hiển thị
    //POST: xử lý
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String school = "FPT Polytechnic";
        req.setAttribute("school", school);
        req.getRequestDispatcher("/buoi2/login.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //b1: lấy dữ liệu từ jsp về servlet => getParameter
        //lưu ý: lấy qua "name"
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        //b2: set thuộc tính
        req.setAttribute("username",username);
        req.setAttribute("password",password);

        //b3: chuyển sang trang kết quả
        req.getRequestDispatcher("/buoi2/ket-qua-login.jsp").forward(req,resp);
    }
}
