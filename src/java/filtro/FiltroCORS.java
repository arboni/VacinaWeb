package filtro;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(filterName = "FiltroCORS", urlPatterns = {"/*"})
public class FiltroCORS implements Filter {
    
    
    public FiltroCORS() {
    }    
    
   
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp,
            FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        
        System.out.println("Metodo "+ request.getMethod());

        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        if(request.getMethod().equals("OPTIONS")){
            response.setStatus(HttpServletResponse.SC_ACCEPTED);
        }
        chain.doFilter(req, resp);
        
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void destroy() {
    }




}
