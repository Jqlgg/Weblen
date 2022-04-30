package request;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/RequestDemo1")
public class RequestDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//      1.获取请求方式
        String method = request.getMethod();
        System.out.println(method);

//      *获取虚拟目录 （/）
        String contextPath = request.getContextPath();
        System.out.println(contextPath);

//        获取servlet路径(/RequestDemo1)
        String servletPath = request.getServletPath();
        System.out.println(servletPath);

//        获取get 的请求参数name=zhangsan
        String queryString = request.getQueryString();
        System.out.println(queryString);

//       * 获取请求URI URL
        String requestURI = request.getRequestURI();
        StringBuffer requestURL = request.getRequestURL();
        System.out.println(requestURI);
        System.out.println(requestURL);

//        获取协议及版本 （http）
        String protocol = request.getProtocol();
        System.out.println(protocol);

//        获取客户ip地址
        String remoteAddr = request.getRemoteAddr();
        System.out.println(remoteAddr);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
