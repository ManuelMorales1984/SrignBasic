package com.mts.login.dao;

import java.util.List;

import com.mts.login.vo.PantallasVO;
import com.mts.login.vo.RolesVO;

public interface LoginDao {


	List<PantallasVO> pantallas();
	List<RolesVO> roles();

}
