/**
 * 
 */
package com.zone.david.projectspringweb.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.zone.david.projectspringweb.services.SpringService;

/**
 * @author david ZoNe Clase de prueba unitaria con Spring JUnit4 NOTA: No tiene
 *         soporte SpringTest para JUnit5
 *
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-test.xml" })
public class SpringJUnit4Test {

	@Autowired
	private SpringService springServiceImpl;

	@Test
	public void test() {
		assertNotNull(this.springServiceImpl);
		System.out.println(this.springServiceImpl.mostrarNombreEmpleado());
	}

}
