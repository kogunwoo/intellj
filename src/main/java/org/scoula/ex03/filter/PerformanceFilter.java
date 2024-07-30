package org.scoula.ex03.filter;

import com.sun.org.apache.xerces.internal.util.HTTPInputSource;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(urlPatterns = {"/*"})
public class PerformanceFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        long start = System.currentTimeMillis();
        filterChain.doFilter(servletRequest, servletResponse);
        long end = System.currentTimeMillis();

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        System.out.println(request.getRequestURI()+ "실행시간: " + (end - start));
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }

}
