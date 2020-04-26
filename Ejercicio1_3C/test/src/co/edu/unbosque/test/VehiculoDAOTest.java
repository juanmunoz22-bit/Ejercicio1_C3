package co.edu.unbosque.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import co.edu.unbosque.model.Vehiculo;
import co.edu.unbosque.model.persistence.Archivo;
import co.edu.unbosque.model.persistence.VehiculoDAO;
import junit.framework.TestCase;

public class VehiculoDAOTest extends TestCase{

	VehiculoDAO vehiculo;
	Archivo archivo;
	File file = new File("dataTest/basedatosTest.dat");
	ArrayList<Vehiculo> vehiculos;
	Vehiculo v1;
	Vehiculo v2;
	Vehiculo v3;
	Vehiculo v4;
	
	private void setupEscenario() {
		file.delete();
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		archivo = new Archivo(file);	
		vehiculos=archivo.leerArchivo(file);
		vehiculo = new VehiculoDAO(archivo);


		v1 = new Vehiculo("marcaPrueba1", "modeloPrueba1", "1", "4", "5", "tipoPrueba1");
		v2 = new Vehiculo("marcaPrueba2", "modeloPrueba2", "2", "2", "4", "tipoPrueba2");
		v3 = new Vehiculo("marcaPrueba3", "modeloPrueba3", "3", "4", "4", "tipoPrueba3");
		v4 = new Vehiculo("marcaPrueba4", "modeloPrueba4", "2", "2", "2", "tipoPrueba4");
		
		vehiculos.add(v1);
		vehiculos.add(v2);

	}
	
	
	public void testVehiculoDAO() {
		setupEscenario();
		
		assertEquals("La cantidad de vehiculos debe ser 2",2,vehiculos.size());
	}
	
	public void testAgregarVehiculo() {
		setupEscenario();
		
		assertTrue("Se debió agregar el vehiculo", vehiculo.agregarVehiculo(v3.getMarca(), v3.getModelo(), v3.getPlaca(), v3.getPuertas(), v3.getCapacidad(), v3.getTipo(), vehiculos, file));
		assertFalse("No se debería agregar un vehiculo con una placa ya existente", vehiculo.agregarVehiculo(v4.getMarca(), v4.getModelo(), v4.getPlaca(), v4.getPuertas(), v4.getCapacidad(), v4.getTipo(), vehiculos, file));

	}

	public void testBuscarPlaca() {

		setupEscenario();
		
		assertNull("No debió encontrar un vehiculo coon placa inexistente", vehiculo.buscarVehiculo("55", vehiculos));
		assertNotNull("Debió encontrarse al usuario",vehiculo.buscarVehiculo(v1.getPlaca(), vehiculos));
	}
	
	public void testEliminarVehiculo() {
		setupEscenario();
		
		assertTrue("Se debio eliminar el vehiculo del concesionario", vehiculo.eliminarVehiculo(v1.getPlaca(), vehiculos, file));
		assertFalse("No se debio eliminar el vehiculo, no existe en el sistema", vehiculo.eliminarVehiculo("345", vehiculos, file));
		
	}
	
}
