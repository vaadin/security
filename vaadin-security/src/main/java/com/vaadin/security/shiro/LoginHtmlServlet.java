package com.vaadin.security.shiro;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(asyncSupported = true, urlPatterns = "/login.html")
public class LoginHtmlServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        serveLoginHtml(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        serveLoginHtml(req, resp);
    }

    private void serveLoginHtml(HttpServletRequest request,
            HttpServletResponse response) throws IOException {
        InputStream loginHtml = request.getServletContext()
                .getResourceAsStream("/login.html");
        response.setCharacterEncoding("utf-8");
        org.apache.commons.io.IOUtils.copy(loginHtml,
                response.getOutputStream());

    }
}
