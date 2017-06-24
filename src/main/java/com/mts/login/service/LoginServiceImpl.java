package com.mts.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mts.login.dao.LoginDao;
import com.mts.login.vo.PantallasVO;
import com.mts.login.vo.RolesVO;
import com.mts.login.vo.UserVO;

@Service
public class LoginServiceImpl implements LoginService {
	
	
	@Autowired
	private LoginDao loginDao;
	
	
	@Override
	  public List<RolesVO> roles(){
		return loginDao.roles();
	   }
	
	
	@Override
	  public List<PantallasVO> pantallas(){
		return loginDao.pantallas();
	   }
	
	
	
	

	public LoginDao getLoginDao() {
		return loginDao;
	}

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}
	
	
	
	

}
