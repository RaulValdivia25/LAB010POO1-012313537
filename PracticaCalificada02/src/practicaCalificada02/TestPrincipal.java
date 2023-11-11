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
		
		Hospital hospital = new Hospital();
		/*------------------------------------*/
		
		System.out.println("BIENVENIDO!");
		System.out.println("QUE DESEA HACER HOY?");
		
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
						boolean salirIngresarDNI = false;
						boolean salirIngresarPeso = false;
						boolean salirIngresarTemperatura = false;
						
						salirRespuestaYN = false;
						
						int DNI = 0;
						
						String nombre = new String();
						String direccion = new String();
						
						double peso = 0;
						double temperatura = 0;
						
						/*-------------------------------*/
						
						System.out.println("--Registrar paciente--");
						do
						{
							do
							{
									System.out.println("Ingrese el DNI del paciente: ");
								
								try
								{
									DNI = entradaInt.nextInt();
									salirIngresarDNI = true;
								}
								
								catch(InputMismatchException ex)
								{
									System.out.println("ERROR. INGRESE CARACTERES VALIDOS");
									entradaInt.reset();
								}
							}
							while(salirIngresarDNI == false);
							
							do
							{
									System.out.println("Ingrese el peso del paciente: ");
								
								try
								{
									peso = entradaInt.nextDouble();
									salirIngresarPeso = true;
								}
								
								catch(InputMismatchException ex)
								{
									System.out.println("ERROR. INGRESE CARACTERES VALIDOS");
								}
							}
							while(salirIngresarPeso == false);
							
							do
							{
									System.out.println("Ingrese la temperatura del paciente: ");
								
								try
								{
									temperatura = entradaInt.nextDouble();
									salirIngresarTemperatura = true;
								}
								
								catch(InputMismatchException ex)
								{
									System.out.println("ERROR. INGRESE CARACTERES VALIDOS");
								}
							}
							while(salirIngresarTemperatura == false);
							
							System.out.println("Ingrese el nombre del paciente: ");
							nombre = entradaString.next();
							
							System.out.println("Ingrese la direccion del paciente: ");
							direccion = entradaString.next();
							
							do
							{
								System.out.println("ESTOS DATOS SON CORRECTOS? (Y/N)");
								try
								{
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
								
								catch(InputMismatchException ex)
								{
									System.out.println("CARACTER INVALIDO");
								}	
							}
							while(salirRespuestaYN == false);
						}
						while(salirIngresoDatos == false);
						
						Paciente nuevoPaciente = new Paciente(DNI, peso, temperatura, nombre, direccion, null);
						hospital.agregarPaciente(nuevoPaciente);
						
						System.out.println("Paciente agregado exitosamente.");
						break;
				}
				
					case 2:
					{
						System.out.println("--Remover paciente--");
						hospital.mostrarPacientes();
					}
					
					case 3:
					{
						
					}
					
					case 4:
					{
						
					}
					
					case 5:
					{
						
					}
					
					case 6:
					{
						
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
