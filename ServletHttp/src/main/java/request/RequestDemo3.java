package request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RequestDemo3")
public class RequestDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        // 获取请求头(user-agent)
//
//        String header = request.getHeader("user-agent");
//        if(header.contains("Chrome")){
//            System.out.println("谷歌");
//        }else if(header.contains("FireFox")){
//            System.out.println("火狐");
//        }
//
//        // 获取请求头数据(referer)
//        String referer = request.getHeader("referer");
//        System.out.println(referer);

//        String[] hobbies = request.getParameterValues("hobby");
//        for (String a :
//                hobbies) {
//            System.out.println(a);
//        }
        System.out.println("333");
        Object name = request.getAttribute("name");
        System.out.println(name);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
//        BufferedReader reader = request.getReader();
//        String line = null;
//        while ((line = reader.readLine())!=null){
//            System.out.println(line);
//        }
        this.doGet(request,response);
    }
}
