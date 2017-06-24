package com.mts.login.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mts.domain.CommonRequest;
import com.mts.domain.CommonResponse;
import com.mts.login.service.LoginServiceImpl;
import com.mts.login.vo.PantallasVO;
import com.mts.login.vo.RolesVO;
import com.mts.login.vo.UserVO;

import testSpringItc.HelloWord;

@Component
@Path("login")
public class LoginRest {
	

	@Autowired
	private LoginServiceImpl loginService;
	
	private static final Logger LOG = Logger.getLogger(LoginRest.class);
	
	@POST
	@Path("inicio")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public CommonResponse initCatalog(CommonRequest params){
		
		CommonResponse respuesta = new CommonResponse();
		UserVO valores = new UserVO();
		
		if (LOG.isDebugEnabled()){
			LOG.debug("MENSAJE CON LOG4J");
			LOG.debug(valores.getPass());
			LOG.debug(valores.getUser());
		}
		if(valores.getPass().equals(params.getKey()) && valores.getUser().equals(params.getId())){
			respuesta.setSuccess(true);
			respuesta.setMensaje("Acceso Permitido");
			
		}else{
			respuesta.setSuccess(false);
			respuesta.setErrorMensaje("Acceso Denegado");
		}		
		
		
		return respuesta;
		
	}
	
	
	@POST
	@Path("roles")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<RolesVO> roles(){
	
		return loginService.roles();
		
		
	}
	
	@POST
	@Path("pantallas")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<PantallasVO> pantallas(){
	
		return loginService.pantallas();
		
		
	}

	public LoginServiceImpl getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginServiceImpl loginService) {
		this.loginService = loginService;
	}
	
	


	
	
	
	

}
