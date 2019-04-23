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
			/*
			 * crear el archivo y la ruta para escribir 
			 */
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("C:\\Users\\jorge\\eclipse-workspace\\leer y escribir\\objeto.obj"));
			/*
			 *escribe  
			 */
			salida.writeObject(a1);
			//cierra
			salida.close();
			// crerar el archivo para leer 
			ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("C:\\Users\\jorge\\eclipse-workspace\\leer y escribir\\objeto.obj"));
			
			//lee
			alumno obj = (alumno) entrada.readObject();
			System.out.println("nombre " + a1.getNombre() + "apellido " + a1.getApellido());
			//cierre
			entrada.close();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void array1() {

		

		try {
			
			
			//crear archivo de escritura 
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("C:\\Users\\jorge\\eclipse-workspace\\leer y escribir\\array.obj"));
			
			//creo el array  de alumnos 
			alumno[] alumnos = new alumno[4];
			//creo el array de trings
			String[] nombre = { "dani", "pepe", "jose", "antonio", "luis" };
			//creo variable para guardar  los nombres 
			int aleatorio = 0;
			//for para escribir el array 
			for (int i = 0; i < alumnos.length; i++) {
			//meto de forma random entre los 4 nombres del string
				aleatorio = (int) (Math.random() * 4);
			//y aqui lo escribo en el array del alumno 
				alumnos[i] = new alumno(nombre[aleatorio], "lopez");

			}
			salida.writeObject(alumnos);
			salida.close();

			//creo el archivo leer 
			ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("C:\\Users\\jorge\\eclipse-workspace\\leer y escribir\\array.obj"));
			//aqui creo un array nuevo cast y lo leo  
			alumno[] alumnos3 = (alumno[]) entrada.readObject();

			entrada.close();
			
			//leo el array
			for (alumno alumno : alumnos3) {
				System.out.println(alumno.getNombre());
			}

		} catch (Exception e) {
			System.out.println("error");
		}
	}

	public static void file() {
		//creo un archivo 
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
		
			ObjectInputStream entrada1 = new ObjectInputStream(new FileInputStream("C:\\Users\\jorge\\eclipse-workspace\\leer y escribir\\alumno.obj"));
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
