package practicaCalificada02;

public class Medico 
{
	private int nColegiatura;
	
	private String nombre = new String();
	private String especialidad = new String();
	
	public Medico(int nColegiatura, String nombre, String especialidad) 
	{
		this.nColegiatura = nColegiatura;
		this.nombre = nombre;
		this.especialidad = especialidad;
	}
	
	public Medico()
	{}

	public int getnColegiatura() 
	{
		return nColegiatura;
	}

	public void setnColegiatura(int nColegiatura) 
	{
		this.nColegiatura = nColegiatura;
	}

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public String getEspecialidad() 
	{
		return especialidad;
	}

	public void setEspecialidad(String especialidad) 
	{
		this.especialidad = especialidad;
	}

	@Override
	public String toString() 
	{
		return "Medico [Numero de colegiatura = " + nColegiatura + ", Nombre = " + nombre + ", Especialidad = " + especialidad + "]";
	}
}