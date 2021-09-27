package proyecto.auto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lectorString = new Scanner(System.in);
		Scanner lectorInt = new Scanner(System.in);
		int opc;
		String escoger;		
		int posicion = 0;
		LocalDate diaHoy = LocalDate.now();
		LocalDate diaFin;
		Auto listaAutos[] = new Auto[50];

		do {
			System.out.println("*************************************");
			System.out.println("***  ALQUILER DE AUTOS METROCARD  ***");
			System.out.println("***          1. Clientes          ***");
			System.out.println("***          2. Empleado          ***");
			System.out.println("***          3. SALIR             ***");
			System.out.println("*************************************");
			opc = lectorInt.nextInt();
			switch (opc) {
				// inicio cliente
			case 1:
					System.out.println("a. Consultar autos");
					System.out.println("b. Reservar auto");
					escoger = lectorString.nextLine();
					switch (escoger) {
					// Cliente Consultar auto
					case "a":
						System.out.println("Ingrese Modelo y/o marca del auto: ");
						String consultarAuto = lectorString.nextLine();
						for (int i = 0; i < listaAutos.length; i++) {
							Auto Auto = listaAutos[i];
							boolean consultar = Auto.getModelo().contains(consultarAuto);
							boolean consultar2 = Auto.getMarca().contains(consultarAuto);
							if (consultar == true || consultar2 == true) {
								System.out.println("Placa: " + Auto.getPlaca() + " - Modelo: " + Auto.getModelo() + " - Marca: " + Auto.getMarca() + " - Año: " + Auto.getAnioDeFabricacion() + " - Fecha de entrega: " + Auto.getFechaReserva());
							}else {
								System.out.println("El auto no se ha encontrado");
							}
						}
						break;
						// Cliente Reservar auto
					case "b":

						System.out.println("Reservar autos ");
						System.out.println("Ingrese placa del auto: ");
						String busquedaPlaca = lectorString.nextLine();
						System.out.println("Ingrese la cedula: ");
						String cedulaReservar = lectorString.nextLine();
						for (int i =  posicion; posicion ==1; i++) {
							Auto clienteAuto = new Auto();
							clienteAuto.setCedulaCliente(cedulaReservar);
							clienteAuto.getCedulaCliente();
							listaAutos[i] = clienteAuto;
						}
						posicion = posicion + 1;
						for (int i = 0; i <= listaAutos.length; i++) {
							Auto auto = listaAutos[i];
							boolean encontrar = auto.getPlaca().contains(busquedaPlaca);
							if (encontrar == true) {
								boolean encontrar2 = auto.getEstado().equals("Disponible");
								if (encontrar2 == true) {
									auto.setEstado("Reservado");
									diaFin = diaHoy.plusDays(2);
									auto.setFechaReserva(diaFin);
									auto.getFechaReserva();
									listaAutos[i] = auto;
									System.out.println("Auto reservado");
									
								} else {
									System.out.println("El auto no esta disponible");
									
								}
								
							} else {
								System.out.println("El auto no ha sido encontrado");
								
							}
						}
						break;

					}
					 // Empleados
				case 2:
					System.out.println("a. Ingresar un auto");
					System.out.println("b. Alquilar un auto");
					System.out.println("c. Aplazar fecha de entrega");
					escoger = lectorString.nextLine();
					if (posicion >= 0 || posicion < 50) {
						switch (escoger) {
						case "a":
							System.out.println("Ingrese placa del auto: ");
							String placa = lectorString.nextLine();
							System.out.println("Ingrese modelo del auto: ");
							String modelo = lectorString.nextLine();
							System.out.println("Ingrese marca del auto: ");
							String marca = lectorString.nextLine();
							System.out.println("Ingrese año de fabricación: ");
							String anioFabricacion = lectorString.nextLine();
							System.out.println("Ingrese país de fabricación: ");
							String paisFabricacion = lectorString.nextLine();
							System.out.println("Ingrese cilindraje : ");
							int cilindraje = lectorInt.nextInt();
							System.out.println("Ingres avalúo del auto: ");
							int avaluo = lectorInt.nextInt();
							System.out.println("Que tipo de auto es: ");
							System.out.println("1. Automóvil");
							System.out.println("2.  Camioneta");
							String escoger2 = lectorString.nextLine();
							System.out.println(" ");
							if (escoger2.equals("1")) {
								System.out.println("Ingrese el número de puertas: ");
								int numeroPuertas = lectorInt.nextInt();
								for (int i = posicion ; posicion == i; i++) {
									Automovil automovil = new Automovil();
									automovil.setPlaca(placa);
									automovil.setModelo(modelo);
									automovil.setMarca(marca);
									automovil.setAnioDeFabricacion(anioFabricacion);
									automovil.setPaisFabricacion(paisFabricacion);
									automovil.setCilindraje(cilindraje);
									automovil.setAvaluo(avaluo);
									automovil.setNumeroPuertas(numeroPuertas);
									listaAutos[i] = automovil;
								}
								posicion = posicion + 1;

							} else if (escoger2.equals("II")) {
								System.out.println("Ingrese el peso que soporta: ");
								int pesoQueSoporta = lectorInt.nextInt();
								for (int i = posicion ; posicion == i; i++) {
									Camioneta camioneta = new Camioneta();
									camioneta.setPlaca(placa);
									camioneta.setModelo(modelo);
									camioneta.setMarca(marca);
									camioneta.setAnioDeFabricacion(anioFabricacion);
									camioneta.setPaisFabricacion(paisFabricacion);
									camioneta.setCilindraje(cilindraje);
									camioneta.setAvaluo(avaluo);
									camioneta.setPesoSoportado(escoger2);
									listaAutos[i] = camioneta;
								}
								posicion = posicion + 1;
								System.out.println("Datos del auto guardados con exito.");
								System.out.println(" ");

							} else if (!escoger2.equals("1") || !escoger2.equals("2")) {
								System.out.println("OPCIÓN INVALIDA");
								
							}
							break;

						case "b":
							System.out.println("Ingrese la placa del auto: ");
							String placaAuto = lectorString.nextLine();
							for (int i = 0; i <= listaAutos.length; i++) {
								Auto auto = listaAutos[i];
								boolean encontro = auto.getPlaca().contains(placaAuto);
								if (encontro == true) {
									boolean encontro2 = auto.getEstado().equals("Reservado");
									if (encontro2 == true) {
										System.out.println("Auto = Placa: " + auto.getPlaca() + " - Modelo: " + auto.getModelo() + " - Estado: " + auto.getEstado() + " - Fecha de Entrega: " + auto.getFechaReserva() + " - Reservado por: " + auto.getCedulaCliente());
										System.out.println(" ");
										System.out.println("¿Desea alquilarlo?");
										System.out.println("   I) Alquilar");
										System.out.println("  II) No Alquilar");
										String opcion3 = lectorString.nextLine();
										switch (opcion3) {
										case "1":
											auto.setEstado("Alquilado");
											diaFin = diaHoy.plusDays(2);
											auto.setFechaReserva(diaFin);
											System.out.println("El auto debe ser entregado el: " + auto.getFechaReserva());
											break;
											
										case "2":
											System.out.println("El auto no ha sido alquilado");
											break;
											
										default:
											System.out.println("OPCIÓN INVALIDA");
											break;
										}
										
									} else {
										System.out.println("El auto que solicitó no está reservado...");
										
									}
									
								} else {
									System.out.println("El auto que solicitó no está disponible...");
									
								}
								
							}
							break;

						case "c":
							System.out.println("Ingrese la placa del auto por favor: ");
							String placaBuscar = lectorString.nextLine();
							System.out.println("Ingrese la cédula del cliente por favor: ");
							String cedulaBuscar = lectorString.nextLine();
							System.out.println("Autos: ");
							for (int i = 0; i <= listaAutos.length; i++) {
								Auto auto = listaAutos[i];
								boolean encontro = auto.getPlaca().contains(placaBuscar);
								if (encontro == true) {
									boolean encontro2 = auto.getCedulaCliente().contains(cedulaBuscar);
									if (encontro2 == true) {
										System.out.println("Placa: " + auto.getPlaca() + " - Modelo: " + auto.getModelo() + " - Estado: " + auto.getEstado() + " - Fecha de Entrega: " + auto.getFechaReserva() + " - Alquilado a: " + auto.getCedulaCliente());
										System.out.println(" ");
										System.out.println("¿Desea aplazar la fecha de entrega?");
										System.out.println("   I) Aplazar");
										System.out.println("  II) No Aplazar");
										String opcion2 = lectorString.nextLine();
										switch (opcion2) {
										case "1":
											LocalDate diaActual = auto.getFechaReserva();
											LocalDate diaNuevo = diaActual.plusDays(2);
											auto.setFechaReserva(diaNuevo);
											auto.getFechaReserva();
											listaAutos[i] = auto;
											break;
											
										case "":
											System.out.println("Peticion denegada");
											break;
											
										}
										
									} else {
										System.out.println("Cedua no encontrada");
										
									}
									
								} else {
									System.out.println("Auto no encontrado");
									
								}
							}
							break;
							
							default:
								System.out.println("OPCIÓN INVALIDA");
								break;
						}
						
					}
					break;

				case 3: 
					System.out.println("Saliendo del Sistema");
					System.out.println("Gracias");
					break;
				}
			} while (opc != 3);

		}

	}