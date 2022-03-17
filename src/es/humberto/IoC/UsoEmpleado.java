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
		
		//Inyeccion de dependencias
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		/*Empleados Juan = context.getBean("miEmpleado", Empleados.class);
		
		System.out.println(Juan.getTareas());
		
		System.out.println(Juan.getInforme());*/
		
		//Segunda parte de inyeccion de dependencias
		/*Empleados Maria = context.getBean("miSecretarioEmpleado", Empleados.class);
		
		System.out.println(Maria.getTareas());
		
		System.out.println(Maria.getInforme());
		
		context.close();*/
		
		//Tercera parte de inyeccion de dependencias
		/*SecretarioEmpleado Maria = context.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		System.out.println(Maria.getTareas());
		
		System.out.println(Maria.getInforme());
		
		System.out.println("Email: " + Maria.getEmail());
		
		System.out.println("Empresa: " + Maria.getNombreEmpresa());
		
		context.close();*/
		
		DirectorEmpleado Pancho = context.getBean("miEmpleado", DirectorEmpleado.class);
		
		System.out.println(Pancho.getTareas());
		
		System.out.println(Pancho.getInforme());
		
		System.out.println("Email: " + Pancho.getEmail());
		
		System.out.println("Empresa: " + Pancho.getNombreEmpresa());
		
		context.close();
	}

}
