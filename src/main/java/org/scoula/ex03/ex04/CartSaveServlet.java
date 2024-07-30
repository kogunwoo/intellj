package org.scoula.ex03.ex04;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/cart_save")
public class CartSaveServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");

        PrintWriter out = response.getWriter();

        //입력 파라미터 얻기
        String product = request.getParameter("product");

        //세션객체 얻기
        HttpSession session = request.getSession();
        ArrayList<String> list =(ArrayList<String>) session.getAttribute("product");


        if(list == null) {
            list = new ArrayList<>();
            session.setAttribute("product", list);
        }
        list.add(product);
        out.print("<html><body>");
        out.print("Product 추가!<br>");
        out.print("<a href='session_product.jsp'>상품 성택 페이지 </a><br>");
        out.print("<a href='cart_view'>장바구니 보기</a>");
        out.print("</body></html>");
    }
}