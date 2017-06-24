package com.mts.login.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.mts.domain.Jdbc;
import com.mts.login.vo.PantallasVO;
import com.mts.login.vo.RolesVO;
import com.mts.login.vo.UserVO;

public class LoginDaoImpl extends Jdbc implements LoginDao {
	
	
	
   private String qryRoles;
   private String qryPantalllas;

   
     
@Override
   public List<RolesVO> roles(){
	List<RolesVO> result =  this.jdbcTemplate.query(qryRoles,ROLES_MAPPER);
	return result;
	   
   }



@Override
public List<PantallasVO> pantallas(){
	List<PantallasVO> result =  this.jdbcTemplate.query(qryPantalllas,PANTALLAS_MAPPER);
	return result;
	   
}


private static final RowMapper<PantallasVO> PANTALLAS_MAPPER = new RowMapper<PantallasVO>() {
	@Override
	public PantallasVO mapRow(ResultSet rs, int num) throws SQLException {
		PantallasVO result = new PantallasVO();

		result.setDsUrl(rs.getString("DS_URL"));
		result.setMenu(rs.getString("MENU"));
		result.setPantalla(rs.getString("PANTALLA"));
		result.setPantallaId(rs.getString("PANTALLAID"));
		return result;
	}
};








private static final RowMapper<RolesVO> ROLES_MAPPER = new RowMapper<RolesVO>() {
	@Override
	public RolesVO mapRow(ResultSet rs, int num) throws SQLException {
		RolesVO result = new RolesVO();

		result.setRolId(rs.getString("ROLID"));
		result.setDsRol(rs.getString("ROL"));
		return result;
	}
};



public String getQryRoles() {
	return qryRoles;
}



public void setQryRoles(String qryRoles) {
	this.qryRoles = qryRoles;
}



public String getQryPantalllas() {
	return qryPantalllas;
}



public void setQryPantalllas(String qryPantalllas) {
	this.qryPantalllas = qryPantalllas;
}





   
   

   
   
   
   
   
}
