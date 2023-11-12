package practicaCalificada02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Hospital 
{
	private ArrayList<Medico> medicosHospital = new ArrayList<Medico>();
	private ArrayList<Paciente> pacientesHospital = new ArrayList<Paciente>();
	
	public Hospital(ArrayList<Medico> medicosHospital, ArrayList<Paciente> pacientesHospital) 
	{
		this.medicosHospital = medicosHospital;
		this.pacientesHospital = pacientesHospital;
	}

	public Hospital()
	{}
	
	public ArrayList<Medico> getMedicosHospital() 
	{
		return medicosHospital;
	}

	public void setMedicosHospital(ArrayList<Medico> medicosHospital) 
	{
		this.medicosHospital = medicosHospital;
	}

	public ArrayList<Paciente> getPacientesHospital() 
	{
		return pacientesHospital;
	}

	public void setPacientesHospital(ArrayList<Paciente> pacientesHospital) 
	{
		this.pacientesHospital = pacientesHospital;
	}

	public void agregarPaciente (Paciente paciente)
	{
		this.pacientesHospital.add(paciente);
	}
	
	public void removerPacientePorPosicion (int posicion)
	{
		this.pacientesHospital.remove(posicion);
	}
	
	public void mostrarPacientes()
	{
		for(int contador = 0; contador < this.pacientesHospital.size(); contador++)
		{
			System.out.println("Paciente " + contador + ": " +  this.pacientesHospital.get(contador).toString());
		}
	}
	
	public Paciente getPaciente(int posicion)
	{
		return this.pacientesHospital.get(posicion);
		
	}
	
	public double pesoMaximo()
	{
		ArrayList<Double> pesosPaciente = new ArrayList<Double>();
		
		for(Paciente paciente : this.pacientesHospital)
		{
			pesosPaciente.add(paciente.getPeso());
		}
		
		double pesoMaximo = Collections.max(pesosPaciente);
		
		return pesoMaximo;
	}
	
	public double pesoMinimo()
	{
		ArrayList<Double> pesosPaciente = new ArrayList<Double>();
		
		for(Paciente paciente : this.pacientesHospital)
		{
			pesosPaciente.add(paciente.getPeso());
		}
		
		double pesoMinimo = Collections.min(pesosPaciente);
		
		return pesoMinimo;
	}
	
	public double PesoModa()
	{
		double pesoModa = 0;
		
		ArrayList<Integer> repeticiones = new ArrayList<Integer>();
		
		
		for(int contador1 = 0; contador1 < this.pacientesHospital.size(); contador1++)
		{
			for(int contador2 = 0; contador2 < this.pacientesHospital.size(); contador2++)
			{
				//if()
				{
					
				}
			}
		}
		return 0;
	}
	
	public void mostrarPacientesApellido()
	{
		ArrayList<String> apellidosPacientes = new ArrayList<String>();
		
		ArrayList<Paciente> pacientesOrdenadosApellido = new ArrayList<Paciente>();
		
		for(Paciente paciente : this.pacientesHospital)
		{
			apellidosPacientes.add(paciente.getApellido());
		}
		
		Collections.sort(apellidosPacientes);
		
		for(int contador1 = 0; contador1 < this.pacientesHospital.size(); contador1++)
		{
			for(int contador2 = 0; contador2 < this.pacientesHospital.size(); contador2++)
			{
				if(apellidosPacientes.get(contador1).equals(this.pacientesHospital.get(contador2).getApellido()))
				{
					pacientesOrdenadosApellido.add(this.pacientesHospital.get(contador2));
				}
			}
		}
		
		for(int contador = 0; contador < pacientesOrdenadosApellido.size(); contador++)
		{
			System.out.println("Paciente " + contador + ": " +  pacientesOrdenadosApellido.get(contador).toString());
		}
	}
	
	public Paciente buscarPacienteDNI(int DNI)
	{
		ArrayList<Paciente> coincidencias = new ArrayList<Paciente>();
		
		Paciente pacienteBuscado = new Paciente();
		
		Scanner entradaYN = new Scanner(System.in);
		String respuestaYN = new String();
		boolean salirYN = false;
		
		for(Paciente paciente : this.pacientesHospital)
		{
			if(DNI == paciente.getDNI())
			{
				coincidencias.add(paciente);
			}
		}
		
		for(Paciente paciente : coincidencias)
		{
			do
			{
				System.out.println(paciente.toString());
				System.out.println("Es este su paciente?");
				respuestaYN = entradaYN.next();
				
				if(respuestaYN.equals("Y") || respuestaYN.equals("y"))
				{
					pacienteBuscado = paciente;
					salirYN = true;
				}
				
				else if(respuestaYN.equals("N") || respuestaYN.equals("n"))
				{
					System.out.println("Mostrando al siguiente paciente.");
					salirYN = true;
				}
				
				else
				{
					System.out.println("ERROR. RESPUESTA INVALIDA");
				}
			}
			while(salirYN == false);
			
			if(pacienteBuscado != null)
			{
				break;
			}
		}
		
		entradaYN.close();
		
		return pacienteBuscado;
	}
	
	public Paciente buscarPacienteNombre(String nombre)
	{
		ArrayList<Paciente> coincidencias = new ArrayList<Paciente>();
		
		Paciente pacienteBuscado = new Paciente();
		
		Scanner entradaYN = new Scanner(System.in);
		String respuestaYN = new String();
		boolean salirYN = false;
		
		for(Paciente paciente : this.pacientesHospital)
		{
			if(nombre.equalsIgnoreCase(paciente.getNombre()))
			{
				coincidencias.add(paciente);
			}
		}
		
		for(Paciente paciente : coincidencias)
		{
			do
			{
				System.out.println(paciente.toString());
				System.out.println("Es este su paciente?");
				respuestaYN = entradaYN.next();
				
				if(respuestaYN.equals("Y") || respuestaYN.equals("y"))
				{
					pacienteBuscado = paciente;
					salirYN = true;
				}
				
				else if(respuestaYN.equals("N") || respuestaYN.equals("n"))
				{
					System.out.println("Mostrando al siguiente paciente.");
					salirYN = true;
				}
				
				else
				{
					System.out.println("ERROR. RESPUESTA INVALIDA");
				}
			}
			while(salirYN == false);
			
			if(pacienteBuscado != null)
			{
				break;
			}
		}
		
		entradaYN.close();
		
		return pacienteBuscado;
	}

	public void quienAtendioEstePaciente(Paciente paciente)
	{
		System.out.println("El paciente fue atendido por: " + paciente.getMedicoAsignado().toString());
	}
	
	@Override
	public String toString() 
	{
		return "Hospital [medicos del hospital=" + medicosHospital + ", Pacientes del hospital=" + pacientesHospital + "]";
	}
}
