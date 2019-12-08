package com.educarOnline;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.JOptionPane;

public class Alumnos {

	// ............................................................................
	// Variables de instancia de la clase.
	private String nombre;
	private String apellido;
	private String nacionalidad;

	private static List<Alumnos> alumnos = new ArrayList<Alumnos>();
	private static Set<String> nacionalidades = new HashSet<String>();

	// ............................................................................
	// Constructores.
	public Alumnos(String nombre, String apellido, String nacionalidad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacionalidad = nacionalidad;
	}

	public Alumnos() {

	}

	// ............................................................................
	// Métodos setter y getters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public static Set<String> getNacionalidades() {
		return nacionalidades;
	}

	public static void setNacionalidades(Set<String> nacionalidades) {
		Alumnos.nacionalidades = nacionalidades;
	}

	public static List<Alumnos> getAlumnos() {
		return alumnos;
	}

	public static void setAlumnos(List<Alumnos> alumnos) {
		Alumnos.alumnos = alumnos;
	}

	// ............................................................................
	/**
	 * Método que agrega un nuevo alumno al registro.
	 */

	public static void agregarAlumno(Alumnos alumno) {

		if (alumno.nombre == null && alumno.apellido == null && alumno.nacionalidad == null) {

			String mensaje = "El alumno no tiene la información suficiente para agregarse al registro de alumnos.";
			JOptionPane.showMessageDialog(null, mensaje);
		} else {
			alumnos.add(alumno);
		}
	}
	// ............................................................................

	/**
	 * Método que muestra todos los registros de alumnos del colegio.
	 */
	public static void mostrarTodosAlumnos() {

		if (alumnos.size() != 0) {
			int n = 1;
			for (Alumnos alumnos : alumnos) {

				System.out.printf("%d: %s %S.%n", n, alumnos.toString(),alumnos.getNacionalidad());
				n++;
			}
		} else {
			System.out.println("No hay registros del alumnos en el colegio.");
		}

	}

	//Sobreescritura del metodo toString() de la clase Object
	@Override
	public String toString() {
		String informacion = " El alumno " + nombre + " " + apellido + " " + "es de " + "nacionalidad ";
		return informacion;

	}
	// ............................................................................
	/**
	 * Método que muestra las distintas nacionalidades y el número de alumnos
	 * que existen por nacionalidad.
	 */

	public static void muestraNacionalidades() {

		if (alumnos.size() != 0) {
			for (Alumnos alumno : alumnos) {

				nacionalidades.add(alumno.getNacionalidad());
			}

			System.out.println("Nacionalidad" + "     " + "Número de alumnos");
			System.out.println("----------------------------------------");
			for (String nacionalidad : nacionalidades) {

				int numeroAlumnosNacionalidad = 0;
				for (Alumnos alumnos2 : alumnos) {

					if (nacionalidad.equalsIgnoreCase(alumnos2.getNacionalidad())) {

						numeroAlumnosNacionalidad++;

					}
				}

				System.out.printf("%-23S%d%n", nacionalidad, numeroAlumnosNacionalidad);

			}
		} else {

			System.out.println("No hay registros del alumnos en el colegio.");
		}

	}

	// ............................................................................
	/**
	 * Método que muestra la nacionalidad y el número de alumnos de esa nacionalidad.
	 * @param nacionalidad
	 */
	public static void muestraNacionalidad(String nacionalidad) {

		int num = 0;

		for (Alumnos alumnos : alumnos) {

			if (nacionalidad.equalsIgnoreCase(alumnos.getNacionalidad())) {
				num++;
			}
		}

		if (num == 0) {

			System.out.printf("No se encontraron registros para la nacionalidad %S.%n",nacionalidad);
		} else {
			System.out.println("Nacionalidad" + "     " + "Número de alumnos");
			System.out.println("----------------------------------------");
			System.out.printf("%-25S%d%n", nacionalidad, num);

		}
	}

	// ............................................................................
	/**
	 * Método que cuenta el número de nacionalidades diferentes que existen en el colegio.
	 */
	
	public static void cuentaNacionalidades() {

		System.out.printf("El número de nacionalidades diferentes que tiene el colegio es: %d.%n",nacionalidades.size());
	}

	// ............................................................................
	/**
	 * Método que elimina los alumnos del registros.
	 */
	public static void borrarRegistros() {

		alumnos.clear();
	}

}
