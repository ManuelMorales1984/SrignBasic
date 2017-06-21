package com.mts.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mts.login.dao.LoginDao;
import com.mts.login.vo.UserVO;

@Service
public class LoginServiceImpl implements LoginService {
	
	
	@Autowired
	private LoginDao loginDao;
	
	
	
	@Override
	  public UserVO nombre(){
		return loginDao.nombre();
	   }
	
	
	
	
	
	

	public LoginDao getLoginDao() {
		return loginDao;
	}

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}
	
	
	
	

}
