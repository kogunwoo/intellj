package org.scoula.ex03;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sports")
public class SportsServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
//        doGet(request, response);


        // MIME 타입 설정
        response.setCharacterEncoding("UTF-8");

        // 자바 I/O
        String[] sports =request.getParameterValues("sports");
        String sex = request.getParameter("sex");

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // html 작성 및 출력
        out.print("<html><body>");
        for (String sport : sports) {
        out.print("좋아하는 운동"+sex+"<br>");
        }
        out.print("성별 : " +sex + "<br>");
        out.print("</body></html>");
    }
    }


