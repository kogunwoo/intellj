package org.scoula.ex03.ex04.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cart_delete")
public class CartDeleteServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
        response.setContentType("text/html; charset=UTF-8");

        PrintWriter out = response.getWriter();
        out.print("<html><body>");
        out.print("장바구니 비웠음 !! ");
        //세션객체 얻기
        HttpSession session = request.getSession(false);
        if(session != null){
            session.invalidate();
        }else{
            out.print("세션없음" + "<br>");
        }
        out.print("<a href='session_product.jsp'>상태 선택 페이지</a><br>");
        out.print("</body></html>");
    }

}