package com.mts.login.service;

import java.util.List;

import com.mts.login.vo.PantallasVO;
import com.mts.login.vo.RolesVO;

public interface LoginService {

	List<PantallasVO> pantallas();
	List<RolesVO> roles();


}
