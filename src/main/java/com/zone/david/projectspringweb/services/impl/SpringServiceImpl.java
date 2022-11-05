/**
 * 
 */
package com.zone.david.projectspringweb.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zone.david.projectspringweb.dao.EmpleadoDAO;
import com.zone.david.projectspringweb.services.SpringService;

/**
 * @author david ZoNe
 *
 */

@Service
public class SpringServiceImpl implements SpringService {
	
	@Autowired
	private EmpleadoDAO empleadoDAOImpl;

	@Override
	public String mostrarNombreEmpresa() {
		
		return "Anotaciones con Spring y JSF";
	}

	@Override
	public String mostrarNombreEmpleado() {
		// TODO Auto-generated method stub
		return this.empleadoDAOImpl.consultarNombreEmpleado();
	}

}
