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

  /*��ֹδ����֤���û�����
   * ���س�����ҳ���������jsp���󣨼�ֻ����ӵ���ҳ�������Ŀ��*/


    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        
        
        HttpServletRequest request=(HttpServletRequest)servletRequest;
       //���ͣ�ʹ��ӵ��ĳЩ���ܡ��縸�ද�����ͳ��������࣬��ʱ��ӵ�������������
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        String currentURL=request.getRequestURI();
       //�õ�������/test/test.jsp���ַ���
        String targetURL=currentURL.substring(currentURL.indexOf("/",1));
        //indexOf����������substring�����������ؽ�ȡ���ַ���
        HttpSession session=request.getSession(false);//flase��ζ��û��session�ͷ���null����true��û��session�ʹ���һ����session
        if(!"/index.jsp".equals(targetURL)){
             if(session==null||session.getAttribute("name")==null){
               //getContextPath()�õ����ǵ�ǰ��Ŀ�ĸ�Ŀ¼
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
