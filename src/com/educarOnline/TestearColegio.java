package com.educarOnline;


public class TestearColegio {

	public static void main(String[] args) {
		
		// ............................................................................
		//Se crean 10 objetos de la clase Alumnos.
		Alumnos a1= new Alumnos("AAAAAAAAAA", "AAAAAAAAAA", "VENEZOLANA");
		Alumnos a2= new Alumnos("BBBBBBBBBB", "BBBBBBBBBB", "VENEZOLANA");
		Alumnos a3= new Alumnos("CCCCCCCCCC", "CCCCCCCCCC", "ARGENTINA");
		Alumnos a4= new Alumnos("DDDDDDDDDD", "DDDDDDDDDD", "COLOMBIANA");
		Alumnos a5= new Alumnos("EEEEEEEEEE", "EEEEEEEEEE", "VENEZOLANA");
		Alumnos a6= new Alumnos("FFFFFFFFFF", "FFFFFFFFFF", "COLOMBIANA");
		Alumnos a7= new Alumnos("GGGGGGGGGG", "GGGGGGGGGG", "PERUANA");
		Alumnos a8= new Alumnos("HHHHHHHHHH", "HHHHHHHHHH", "ARGENTINA");
		Alumnos a9= new Alumnos("IIIIIIIIII", "IIIIIIIIII", "CHILENA");
		Alumnos a10= new Alumnos("JJJJJJJJJJ", "JJJJJJJJJJ", "VENEZOLANA");
		
		
		
		// ............................................................................
		//Se agregan los 10 alumnos al registros.
		Alumnos.agregarAlumno(a1);
		Alumnos.agregarAlumno(a2);
		Alumnos.agregarAlumno(a3);
		Alumnos.agregarAlumno(a4);
		Alumnos.agregarAlumno(a5);
		Alumnos.agregarAlumno(a6);
		Alumnos.agregarAlumno(a7);
		Alumnos.agregarAlumno(a8);
		Alumnos.agregarAlumno(a9);
		Alumnos.agregarAlumno(a10);
		
		// ............................................................................
		//Se trata de agregar un alumno al registro sin ningún tipo información.
		Alumnos a11= new Alumnos();
		Alumnos.agregarAlumno(a11);
		
		// ............................................................................
		//Se le agrega la nacionalidad al alumno
		a11.setNacionalidad("Ecuatoriana");
		Alumnos.agregarAlumno(a11);
		
		// ............................................................................
		//Se muestra todos los alumnos en el registro.
		Alumnos.mostrarTodosAlumnos();
		System.out.println();
		
		//Se muestra la distintas nacionalidades y el número de alumnos que existe por nacionalidad.
		Alumnos.muestraNacionalidades();
		System.out.println();
		
		//Muestra la nacionalidad y el número de alumno de esa nacionalidad.
		Alumnos.muestraNacionalidad("Venezolana");
		System.out.println();
		Alumnos.muestraNacionalidad("Paraguaya");
		
		//Se muestra el número de nacionalidades diferentes que existe en el colegio.
		Alumnos.cuentaNacionalidades();
		
		//Se eliminan todos los registros de alumnos del colegio.
		Alumnos.borrarRegistros();
		
		//Se muestra todos los alumnos en el registro.
		System.out.println();
		Alumnos.mostrarTodosAlumnos();
		

	}

}
