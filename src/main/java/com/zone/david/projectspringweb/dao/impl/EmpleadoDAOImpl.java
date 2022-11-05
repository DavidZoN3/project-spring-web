/**
 * 
 */
package com.zone.david.projectspringweb.dao.impl;

import org.springframework.stereotype.Repository;

import com.zone.david.projectspringweb.dao.EmpleadoDAO;

/**
 * @author david ZoNe
 *
 */
@Repository
public class EmpleadoDAOImpl implements EmpleadoDAO {

	@Override
	public String consultarNombreEmpleado() {
		// TODO Auto-generated method stub
		return "David Serrano Cortés";
	}

}
