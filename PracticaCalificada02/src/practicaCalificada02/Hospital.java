package practicaCalificada02;

import java.util.ArrayList;

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
	
	@Override
	public String toString() 
	{
		return "Hospital [medicos del hospital=" + medicosHospital + ", Pacientes del hospital=" + pacientesHospital + "]";
	}
}
