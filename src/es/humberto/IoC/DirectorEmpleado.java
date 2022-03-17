package es.humberto.IoC;

public class DirectorEmpleado implements Empleados {
	
	//Creacion de campo de tipo creacionInforme (interfaz)
	private CreacionInformes informeNuevo;
	private String email;
	private String nombreEmpresa;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	//creacion de constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informenuevo)
	{
		this.informeNuevo = informenuevo;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Director: " + informeNuevo.getInforme();
	}

}
