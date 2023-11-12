package practicaCalificada02;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class TestPrincipal 
{
	public static void main(String[] args) 
	{
		int opcion;
		
		Scanner entradaInt =  new Scanner(System.in);
		Scanner entradaString = new Scanner(System.in);
		Scanner entradaDouble = new Scanner(System.in);
		Scanner entradaYN = new Scanner(System.in);
		
		String respuestaYN = new String();
		
		boolean salirMenu = false;
		boolean salirRespuestaYN;
		
		/*------------------------------------*/
		Hospital hospital = new Hospital();
		
		Medico medico1 = new Medico(3, "Valeria Sanchez", "Pediatria");
		Medico medico2 = new Medico(4, "Alejandro Morales","Cardiologia");
		Medico medico3 = new Medico(5, "Carolina Vargas",  "Ginecologia");
		Medico medico4 = new Medico(4, "Javier Martinez", "Cirugia Ortopedica");
		Medico medico5 = new Medico(6, "Isabel Rodriguez", "Dermatologia");
		Medico medico6 = new Medico(5, "Roberto Herrera", "Medicina Interna");
		Medico medico7 = new Medico(4, "Gabriela Torres",  "Psiquiatria");
		Medico medico8 = new Medico(6, "Sergio Mendoza",  "Oncologia");
		Medico medico9 = new Medico(8, "Lucia Gomez", "Endocrinologia");
		Medico medico10 = new Medico(3, "Martin Ramirez", "Neumologia");
		
		ArrayList<Medico> medicosHospital = new ArrayList<Medico>();
		
		medicosHospital.add(medico1);
		medicosHospital.add(medico2);
		medicosHospital.add(medico3);
		medicosHospital.add(medico4);
		medicosHospital.add(medico5);
		medicosHospital.add(medico6);
		medicosHospital.add(medico7);
		medicosHospital.add(medico8);
		medicosHospital.add(medico9);
		medicosHospital.add(medico10);
		
		Paciente paciente1 = new Paciente(94978573, 74.2, 36.8, "Carlos Parra", "Calle Primavera, 123, Ciudad Sol", medico1);
		Paciente paciente2 = new Paciente(61927738, 68.4, 37.3, "Emilia Gisbert", "Avenida del Bosque, 456, Pueblo Nuevo", medico2);
		Paciente paciente3 = new Paciente(29580569, 76.6, 35.7, "Jan Catalan", "Carrera Estrella, 789, Villa Aurora", medico3);
		Paciente paciente4 = new Paciente(44980101, 61.6, 36.4, "Hortensia Rubio", "Camino del Rio, 210, Barrio Sereno", medico4);
		Paciente paciente5 = new Paciente(34126020, 66.5, 35.1, "Marcelina Gamero", "Plaza del Sol, 567, Colina Residencial", medico5);
		
		ArrayList<Paciente> pacientesHospital = new ArrayList<Paciente>();
		
		pacientesHospital.add(paciente1);
		pacientesHospital.add(paciente2);
		pacientesHospital.add(paciente3);
		pacientesHospital.add(paciente4);
		pacientesHospital.add(paciente5);
		
		hospital.setMedicosHospital(medicosHospital);
		hospital.setPacientesHospital(pacientesHospital);
		
		/*-----------------------------------*/
		
		System.out.println("BIENVENIDO!");
		System.out.println("Que desea hacer hoy?");
		
		do
		{
			System.out.println(" 1 ---> Registrar paciente");
			System.out.println(" 2 ---> Eliminar paciente");
			System.out.println(" 3 ---> Modificar paciente");
			System.out.println(" 4 ---> Peso moda");
			System.out.println(" 5 ---> Pacientes con el peso moda");
			System.out.println(" 6 ---> Peso maximo y Peso minimo");
			System.out.println(" 7 ---> Lista de pacientes por peso");
			System.out.println(" 8 ---> Lista de pacientes por apellido");
			System.out.println(" 9 ---> Doctor asignado del paciente");
			System.out.println(" 10 ---> Buscar doctores por especialidad");
			
			
			try
			{
				opcion = entradaInt.nextInt();
				
				switch (opcion)
				{
					case 1:
					{
						boolean salirIngresoDatos = false;
						
						salirRespuestaYN = false;
						
						int nDNI = 0;
						
						String nNombre = new String();
						String nDireccion = new String();
						
						double nPeso = 0;
						double nTemperatura = 0;
						
						/*-------------------------------*/
						
						System.out.println("--Registrar paciente--");
						do
						{
							System.out.println("Ingrese el DNI del paciente: ");
							nDNI = entradaInt.nextInt();
							
							System.out.println("Ingrese el peso del paciente: ");
							nPeso = entradaInt.nextDouble();

							System.out.println("Ingrese la temperatura del paciente: ");
							nTemperatura = entradaInt.nextDouble();

							System.out.println("Ingrese el nombre del paciente: ");
							nNombre = entradaString.next();
							
							System.out.println("Ingrese la direccion del paciente: ");
							nDireccion = entradaString.next();
							
							do
							{
								System.out.println("ESTOS DATOS SON CORRECTOS? (Y/N)");
									
								respuestaYN = entradaYN.next();
									
								if(respuestaYN.equals("Y") || respuestaYN.equals("y"))
								{
									salirIngresoDatos = true;
									salirRespuestaYN = true;
								}
								
								else if(respuestaYN.equals("N") || respuestaYN.equals("n"))
								{										
									System.out.println("Ingrese los datos nuevamente");
									salirRespuestaYN = true;
								}
								
								else
								{
									System.out.println("RESPUESTA INVALIDA");
								}
							}
							while(salirRespuestaYN == false);
						}
						while(salirIngresoDatos == false);
						
						Paciente nuevoPaciente = new Paciente(nDNI, nPeso, nTemperatura, nNombre, nDireccion, null);
						hospital.agregarPaciente(nuevoPaciente);
						
						System.out.println("Paciente agregado exitosamente.");
						
						break;
				}
				
					case 2:
					{
						int posicionRemover;
						
						salirRespuestaYN = false;
						boolean salirOpcion2 = false;
						
						/*-----------------------*/
						
						System.out.println("--Remover paciente--");
						hospital.mostrarPacientes();
						
						do
						{
							System.out.println("Que paciente va a remover?");
							posicionRemover = entradaInt.nextInt();
						
							do
							{
								System.out.println("ESTA SEGURO? (Y/N)");

								respuestaYN = entradaYN.next();
								
								if(respuestaYN.equals("Y") || respuestaYN.equals("y"))
								{
									salirOpcion2 = true;
									salirRespuestaYN = true;
								}
								
								else if(respuestaYN.equals("N") || respuestaYN.equals("n"))
								{
									System.out.println("Ingrese el dato nuevamente");
									salirRespuestaYN = true;
								}
								
								else
								{
									System.out.println("RESPUESTA INVALIDA");
								}
							}
							while(salirRespuestaYN == false);
						}
						while(salirOpcion2 == false);
						
						hospital.removerPacientePorPosicion(posicionRemover);
						
						System.out.println("Paciente removido");
						
						break;
					}
					
					case 3:
					{
						int pacienteModificar;
						int opcionModificar;
						int mDNI;
						
						double mPeso;
						double mTemperatura;
						
						String mNombre = new String();
						String mDireccion = new String();
						
						boolean salirMenuModificar = false;
						
						/*---------------------------------*/
						
						System.out.println("--Modificar paciente--");
						hospital.mostrarPacientes();

						System.out.println("Que paciente desea modificar?");
						pacienteModificar = entradaInt.nextInt();
						
						
						System.out.println("Que va a modificar?");
						System.out.println("1 ---> DNI");
						System.out.println("2 ---> Peso");
						System.out.println("3 ---> Temperatura");
						System.out.println("4 ---> Nombre");
						System.out.println("5 ---> Direccion");
						do
						{
							opcionModificar = entradaInt.nextInt();
							
							switch (opcionModificar)
							{
								case 1:
								{
									System.out.println("Ingrese el nuevo DNI: ");
									mDNI = entradaInt.nextInt();
									
									hospital.getPaciente(pacienteModificar).setDNI(mDNI);
									
									salirMenuModificar = true;
									
									break;
								}
								
								case 2:
								{
									System.out.println("Ingrese el nuevo peso: ");
									mPeso = entradaDouble.nextDouble();
									
									hospital.getPaciente(pacienteModificar).setPeso(mPeso);
									
									salirMenuModificar = true;
									
									break;
								}
								
								case 3:
								{
									System.out.println("Ingrese la nueva temperatura: ");
									mTemperatura = entradaDouble.nextDouble();
									
									hospital.getPaciente(pacienteModificar).setTemperatura(mTemperatura);
									
									salirMenuModificar = true;
									
									break;
								}
								
								case 4:
								{
									System.out.println("Ingrese el nuevo nombre: ");
									mNombre = entradaString.next();
									
									hospital.getPaciente(pacienteModificar).setNombre(mNombre);
									
									salirMenuModificar = true;
									
									break;
								}
								
								case 5:
								{
									System.out.println("Ingrese la nueva direccion: ");
									mDireccion = entradaString.next();
									
									hospital.getPaciente(pacienteModificar).setDireccion(mDireccion);
									
									salirMenuModificar = true;
									
									break;
								}
								
								default:
								{
									System.out.println("ERROR. RESPUESTA INVALIDA");
									break;
								}
							}
						}
						while(salirMenuModificar == false);
						
						System.out.println("Paciente modificado correctamente");
						
						break;
					}
					
					case 4:
					{
						
					}
					
					case 5:
					{
						
					}
					
					case 6:
					{
						double pesoMaximo = 0;
						double pesoMinimo = 0;
						
						/*--------------------*/
						
						System.out.println("--Peso moda--");
						
						pesoMaximo = hospital.pesoMaximo();
						pesoMinimo = hospital.pesoMinimo();
						
						System.out.println("El peso maximo es : " + pesoMaximo);
						System.out.println("El peso minimo es : " + pesoMinimo);
						
						break;
					}
					
					case 7:
					{
						
					}
					
					case 8:
					{
						
					}
					
					case 9:
					{
						
					}
					
					case 10:
					{
						
					}
				}
			}
			
			catch(InputMismatchException ex)
			{
				System.out.println("ERROR. CARACTER INVALIDO");
			}
		}
		while(salirMenu == false);
	}
}
