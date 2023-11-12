package practicaCalificada02;

public class Paciente 
{
	private int DNI;
	
	private double peso;
	private double temperatura;
	
	private String nombre = new String();
	private String direccion = new String();
	
	private Medico medicoAsignado = new Medico();
	
	public Paciente(int dNI, double peso, double temperatura, String nombre, String direccion, Medico medicoAsignado) 
	{
		DNI = dNI;
		this.peso = peso;
		this.temperatura = temperatura;
		this.nombre = nombre;
		this.direccion = direccion;
		this.medicoAsignado = medicoAsignado;
	}
	
	public Paciente()
	{}

	public int getDNI() 
	{
		return DNI;
	}

	public void setDNI(int dNI) 
	{
		DNI = dNI;
	}

	public double getPeso() 
	{
		return peso;
	}

	public void setPeso(double peso) 
	{
		this.peso = peso;
	}

	public double getTemperatura() 
	{
		return temperatura;
	}

	public void setTemperatura(double temperatura) 
	{
		this.temperatura = temperatura;
	}

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public String getDireccion() 
	{
		return direccion;
	}

	public void setDireccion(String direccion) 
	{
		this.direccion = direccion;
	}

	public Medico getMedicoAsignado() 
	{
		return medicoAsignado;
	}

	public void setMedicoAsignado(Medico medicoAsignado) 
	{
		this.medicoAsignado = medicoAsignado;
	}
	
	public String getApellido()
	{
		String apellido = new String();
		String[] noSeComoNombrarEsto = new String[1];
		
		noSeComoNombrarEsto = this.nombre.split(" ");
		
		apellido = noSeComoNombrarEsto[1];
		
		return apellido;
	}

	@Override
	public String toString() 
	{
		return "Paciente [DNI = " + DNI + ", Peso = " + peso + ", Temperatura = " + temperatura + ", Nombre = " + nombre
				+ ", Direccion = " + direccion + ", Medico asignado = " + medicoAsignado + "]";
	}
}