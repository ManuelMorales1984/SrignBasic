package com.mts.login.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mts.domain.Jdbc;
import com.mts.login.vo.UserVO;

public class LoginDaoImpl extends Jdbc implements LoginDao {
   private String qryGetUsuario;

   
     
@Override
   public UserVO nombre(){
	UserVO result =  this.jdbcTemplate.queryForObject(qryGetUsuario,USER_MAPPER);
	return result;
	   
   }


private static final RowMapper<UserVO> USER_MAPPER = new RowMapper<UserVO>() {
	@Override
	public UserVO mapRow(ResultSet rs, int num) throws SQLException {
		UserVO result = new UserVO();

		result.setPass(rs.getString("PASSWORD"));
		result.setUser(rs.getString("NOMBRE"));
		return result;
	}
};


public String getQryGetUsuario() {
	return qryGetUsuario;
}

public void setQryGetUsuario(String qryGetUsuario) {
	this.qryGetUsuario = qryGetUsuario;
}
   
   
   

   
   
   
   
   
}
