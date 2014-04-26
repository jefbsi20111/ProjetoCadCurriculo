package filtros;

import java.io.IOException;

import models.User;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class Filtro implements Filter { 

	public void doFilter(ServletRequest req,
      ServletResponse res, FilterChain chain) throws IOException, ServletException{
	  HttpServletRequest request = (HttpServletRequest) req;  	
	  HttpSession s = request.getSession();
	  User user = (User) s.getAttribute("User");
	  if (user != null){
	
		String nome = user.getNome();
		String senha = user.getSenha();
		
		if((nome == "admin") && (senha == "abc123")){
			chain.doFilter(req, res );
		}
	
   	}
	
	else{
		request.getRequestDispatcher("/login");
	}

}

@Override
public void destroy() {
	// TODO Auto-generated method stub
	
}

@Override
public void init(FilterConfig arg0) throws ServletException {
	// TODO Auto-generated method stub
	
}

}