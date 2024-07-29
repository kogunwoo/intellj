package org.scoula.ex03;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServelt extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//     request.setCharacterEncoding("UTF-8");
//        doGet(request, response);
       //요청해서 파라미터 얻기
        String userid = request.getParameter("userid");
        String password = request.getParameter("passwd");
        // MIME 타입 설정
        response.setContentType("text/html;charset=UTF-8");

        // 자바 I/O
        PrintWriter out = response.getWriter();

        // html 작성 및 출력
        out.print("<html><body>");
        out.print("아이디값: " + userid+"<br>");
        out.print("비밀번호값:" + password+"<br>");
        out.print("</body></html>");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //request.setCharacterEncoding("UTF-8");
        doGet(request, response);
    }
    }


