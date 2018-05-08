package com.etimeci.ssm.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.etimeci.ssm.entity.UserMessage;

public class SessionFilter implements Filter {

    private String notNeedLoginPages = "";
    protected FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;

        if (filterConfig.getInitParameter("notNeedLoginPages") != null) {
            notNeedLoginPages = filterConfig.getInitParameter("notNeedLoginPages");
        }
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String uri = request.getRequestURI();
        String requestedUri = uri.substring(request.getContextPath().length() + 1);

        if (requestedUri.endsWith(".css") || requestedUri.endsWith(".js") || requestedUri.endsWith(".png") || requestedUri.endsWith(".jpg")) {
            filterChain.doFilter(request, response);
            return;
        }

        String[] pages = notNeedLoginPages.split(",");

        boolean isAllow = false;

        for (String page : pages) {
            if (page.equals(requestedUri)) {
                isAllow = true;
                break;
            }

            if (requestedUri.endsWith(".css") || requestedUri.endsWith(".js") || requestedUri.endsWith(".png") || requestedUri.endsWith(".jpg")) {
                isAllow = true;
                break;
            }
        }

        if (isAllow) {
            filterChain.doFilter(request, response);
        } else {
            HttpSession session = request.getSession();
            UserMessage user = (UserMessage) session.getAttribute("user");

            if (user == null || "".equals(user.getUmPhone()) || user.getUmPhone() == null ) {
                if (request.getMethod().toLowerCase().equals("get")) {
                    response.sendRedirect(request.getContextPath() + "/goLogin?go=" + requestedUri);
                } else {
                    response.sendRedirect(request.getContextPath() + "/goLogin");
                }
            } else {
                filterChain.doFilter(request, response);
            }
        }
    }

    @Override
    public void destroy() {

    }
}
