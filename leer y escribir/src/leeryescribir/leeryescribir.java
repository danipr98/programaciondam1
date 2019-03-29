package leeryescribir;
import java.io.*;
public class leeryescribir {
	
	/*public static void creaimagen(int datos_copia[]) {
		try {
			FileOutputStream arch_escribir=new FileOutputStream("C:\\Users\\jorge\\eclipse-workspace\\leer y escribir\\descarga_copia.jpg");
			for (int j = 0; j < datos_copia.length; j++) {
					
				arch_escribir.write(datos_copia[j]);
					
			}
			arch_escribir.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());		
		}
		
	}*/

	public static void main(String[] args) {
	FileWriter javapepe1 =null;
	
	String javapepe ="C:\\Users\\jorge\\Desktop\\javapepe.txt";
	int a=0;
	int e=0;
	int i=0;
	int o=0;
	int u=0;
	int contador=0;
	int datos_entrada[]=new int[5636];

	try {
		javapepe1=new FileWriter(javapepe,true);
		
		String linea="esto es una prueba de javapepe";
		
		for (int i1 = 0; i1 < linea.length(); i1++) {
			javapepe1.write(linea.charAt(i1));
		}
		javapepe1.close();
		
		FileReader javapepe2=null;
		javapepe2=new FileReader(javapepe);
		int caract=javapepe2.read();
		
		
		while (caract != -1) {
			if (caract =='a'){
				a++;
			}else if (caract =='e') {
				e++;
			}else if (caract =='i') {
				i++;
			}else if (caract =='o') {
				o++;
			}else if(caract =='u') {
				u++;
			}
			System.out.print((char)caract);
			caract=javapepe2.read();
			
		}
		
		
		System.out.println();
		System.out.println("hay tantas a "+a+" hay tantas e "+e+" hay tantas i "+i+" hay tantas o"+o+" hay tantas u "+u);
		
		javapepe2.close();
		
		
		FileInputStream  arch_lectura=new FileInputStream("C:\\Users\\jorge\\eclipse-workspace\\leer y escribir\\descarga.jpg");
		FileOutputStream arch_escribir=new FileOutputStream("C:\\Users\\jorge\\eclipse-workspace\\leer y escribir\\descarga_copia.jpg");
		BufferedInputStream arch_lecturab=new BufferedInputStream(arch_lectura);
		BufferedOutputStream arch_escribirb=new BufferedOutputStream(arch_escribir);
		int caract1=0; 
		
		
		while ((caract1=arch_lecturab.read()) != -1) {
			
			arch_escribirb.write(caract1);
			arch_escribirb.flush();
		}
			/*boolean final_arch=false;
			
			while (!final_arch) {
				
				//int bentrada=arch_lectura.read();
				
				if (bentrada!=-1) {
					datos_entrada[contador]=bentrada;
					}else {
					final_arch=true;
				}
				System.out.println(datos_entrada[contador]);
				contador++;
			}*/
		
			arch_lectura.close();
			arch_escribir.close();
			
		
			
			
	}catch (IOException e1) {
		System.out.println(e1.getMessage());
	}

	
	}

}
