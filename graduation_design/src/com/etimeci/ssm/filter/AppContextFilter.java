
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

import com.etimeci.ssm.common.AppContext;
import com.etimeci.ssm.entity.UserMessage;

//import com.augmentum.AppContext;
//import com.augmentum.model.User;

public class AppContextFilter implements Filter {

    public AppContextFilter() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String uri = request.getRequestURL().toString();
        String requestedUri = uri.substring(request.getContextPath().length() + 1);
        AppContext.setContextPath(request.getContextPath());

        if (requestedUri.endsWith(".css") || requestedUri.endsWith(".js") || requestedUri.endsWith(".png") || requestedUri.endsWith(".jpg")) {
            filterChain.doFilter(request, response);
            return;
        }

        AppContext appContext = AppContext.getAppContext();
        appContext.addObject("APP_CONTEXT_REQUEST", request);
        appContext.addObject("APP_CONTEXT_RESPONSE", response);
        servletResponse.setContentType("text/html;charset=utf-8");
        HttpSession session = request.getSession();
        UserMessage user = (UserMessage) session.getAttribute("USER");
        appContext.addObject("APP_CONTEXT_USER", user);
        appContext.addObject("APP_CONTEXT_SESSION", session);

        try {
            filterChain.doFilter(request, response);
        } catch (IOException e) {
            throw e;
        } catch (ServletException e) {
            e.printStackTrace();
            throw e;
        } catch ( RuntimeException e) {
            e.printStackTrace();
            throw e;
        } finally {
            appContext.clear();
        }
    }

    @Override
    public void init(FilterConfig fConfig) throws ServletException {

    }
}