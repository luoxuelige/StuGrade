package util;

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


public class AccessController implements Filter {

  /*防止未经验证的用户进入
   * 拦截除登入页面外的所有jsp请求（即只允许从登入页面进入项目）*/


    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        
        
        HttpServletRequest request=(HttpServletRequest)servletRequest;
       //造型，使其拥有某些功能。如父类动物造型成子类人类，这时就拥有了人类的特性
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        String currentURL=request.getRequestURI();
       //得到了类似/test/test.jsp的字符串
        String targetURL=currentURL.substring(currentURL.indexOf("/",1));
        //indexOf返回索引，substring根据索引返回截取的字符串
        HttpSession session=request.getSession(false);//flase意味着没有session就返回null，而true是没有session就创建一个新session
        if(!"/index.jsp".equals(targetURL)){
             if(session==null||session.getAttribute("name")==null){
               //getContextPath()得到的是当前项目的根目录
                response.sendRedirect(request.getContextPath()+"/index.jsp");
                return;
            }
        }

        filterChain.doFilter(request, response);
        
    }

   
    public void init(FilterConfig filterConfig) throws ServletException {
        
        
    }
    public void destroy() {
        
        
    }
}
