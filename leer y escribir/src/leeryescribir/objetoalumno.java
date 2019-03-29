package leeryescribir;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.tools.Diagnostic;

public class objetoalumno {

	public static void obj1(alumno a1) {
		try {

			ObjectOutputStream salida = new ObjectOutputStream(
					new FileOutputStream("C:\\Users\\jorge\\eclipse-workspace\\leer y escribir\\objeto.obj"));
			salida.writeObject(a1);

			salida.close();

			ObjectInputStream entrada = new ObjectInputStream(
					new FileInputStream("C:\\Users\\jorge\\eclipse-workspace\\leer y escribir\\objeto.obj"));
			alumno obj = (alumno) entrada.readObject();

			System.out.println("nombre " + a1.getNombre() + "apellido " + a1.getApellido());

			entrada.close();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void array1() {

		// CREAR NUEVO ARCHIVO DE OBJETOS ALUMNOS.

		try {
			ObjectOutputStream salida = new ObjectOutputStream(
					new FileOutputStream("C:\\Users\\jorge\\eclipse-workspace\\leer y escribir\\array.obj"));
			alumno[] alumnos = new alumno[4];
			String[] nombre = { "dani", "pepe", "jose", "antonio", "luis" };
			int aleatorio = 0;

			for (int i = 0; i < alumnos.length; i++) {
				aleatorio = (int) (Math.random() * 4);
				alumnos[i] = new alumno(nombre[aleatorio], "lopez");

			}
			salida.writeObject(alumnos);
			salida.close();

			ObjectInputStream entrada = new ObjectInputStream(
					new FileInputStream("C:\\Users\\jorge\\eclipse-workspace\\leer y escribir\\array.obj"));

			alumno[] alumnos3 = (alumno[]) entrada.readObject();

			entrada.close();
			for (alumno alumno : alumnos3) {
				System.out.println(alumno.getNombre());
			}

		} catch (Exception e) {
			System.out.println("error");
		}
	}

	public static void file() {
		File com = new File("C:\\Users\\jorge\\eclipse-workspace\\leer y escribir\\array.obj");
		File bin = new File("bin");

		if (com.exists()) {
			System.out.println("este fichero existe");
			
			if (com.isDirectory()) {
				System.out.println("Es un directorio");
			} else {
				System.out.println("Es un fichero");
			}
			System.out.println(com.getAbsolutePath());

		} else {
			System.out.println("El fichero no existe");
		}

		String[] filles = bin.list();

		for (String rutas : filles) {
			System.out.println(rutas);
		}

		File directorio = new File("PruebaDirectorio");

		directorio.mkdir();

	}
	
	
	public static void  leer(alumno a1) {
		
		try {
		
			ObjectInputStream entrada1 = new ObjectInputStream(
					new FileInputStream("C:\\Users\\jorge\\eclipse-workspace\\leer y escribir\\alumno.obj"));
			alumno obj = (alumno) entrada1.readObject();

			System.out.println("nombre " + a1.getNombre() + "apellido " + a1.getApellido());

			entrada1.close();
		
		ObjectInputStream entrada = new ObjectInputStream(
				new FileInputStream("C:\\Users\\jorge\\eclipse-workspace\\leer y escribir\\arrayses.obj"));

		alumno[] alumnos3 = (alumno[]) entrada.readObject();

		entrada.close();
		
		for (alumno alumno : alumnos3) {
			System.out.println(alumno.getNombre());
		}

	} catch (Exception e) {
		System.out.println("error");
	}
	}
}
