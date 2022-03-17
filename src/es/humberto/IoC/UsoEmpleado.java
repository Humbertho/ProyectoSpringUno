package es.humberto.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creacion de objetos tipo Empleado
		//JefeEmpleado Empleado1 = new JefeEmpleado();
		/*Empleados Empleado1 = new JefeEmpleado();
		Empleados Empleado2 = new SecretarioEmpleado();
		Empleados Empleado3 = new DirectorEmpleado();
		
		//Uso de los objetos creados
		System.out.println(Empleado1.getTareas());
		System.out.println(Empleado2.getTareas());
		System.out.println(Empleado3.getTareas());*/
		
		//Segundo parte de inyeccion de dependencias
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		Empleados Juan = context.getBean("miEmpleado", Empleados.class);
		
		System.out.println(Juan.getTareas());
		
		System.out.println(Juan.getInforme());
		
		context.close();
	}

}
