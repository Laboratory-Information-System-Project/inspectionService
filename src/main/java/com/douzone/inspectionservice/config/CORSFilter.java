package com.douzone.inspectionservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class CORSFilter implements Filter{

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {

        chain.doFilter(req, res);
        HttpServletResponse response = (HttpServletResponse) res;
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "X-Requested-With, Content-Type, "
                + "Authorization, Origin, Accept, Access-Control-Request-Method, Access-Control-Request-Headers");

        System.out.println("필터링이 진행중입니다..."); //Console창에서 거슬린다면 주석처리 하셔도 됩니다!



    }

    public void init(FilterConfig filterConfig) {}
    public void destory() {}
}