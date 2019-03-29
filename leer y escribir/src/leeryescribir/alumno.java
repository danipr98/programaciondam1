package leeryescribir;

import java.io.Serializable;

/**
	 * @author Danipr98
	 * @version 1.10.1
	 */

	public class alumno  implements Serializable{
		protected String nombre;
		protected String apellido;
		private static int numalumno=0;
		protected static int notaMedia=0;
		/**
		 * Getter
		 * @return nombre:nombre 
		 */
		
		public String getNombre() {
			return nombre;
		}
		/**
		 * metodo que incrementar
		 * @param notamedia
		 * 
		 */
		
		public void incrementar() {
			notaMedia++;
			
		}
		/**
		 * este metod llama al metodo incrementar de dos maneras
		 * @return notamedia
		 */
		public int resultado() {
			incrementar();
			this.incrementar();
			return notaMedia;
		}
		/**
		 * Getter
		 * @return notamedia
		 */
		public int getnotamedia() {
			return notaMedia;
		}
		
		/**
		 * Setter
		 * @param nombre
		 * 
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		/**
		 * Getter
		 * @return apellido
		 */
		public String getApellido() {
			return apellido;
		}
		/**
		 * Setter
		 * @param apellido
		 */
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		/**Getter
		 * @return numalumno.
		 * 
		 */
		public int getnumalumno() {
			return numalumno;
		}
		/**
		 * contructor que recibe un objeto 
		 * @param c2
		 * 
		 */
		public alumno (alumno c2) {
			this.nombre=c2.getNombre();
			this.apellido=c2.getApellido();
			numalumno++;
		}
		/**
		 * contructor que no recibe parametros
		 * 
		 */
		public alumno() {
			this.nombre="";
			this.apellido="";
			numalumno++;
		}
		/**
		 * constructor que recibe dos parametros
		 * @param nombrea
		 * @param apellidoa
		 */
		public alumno(String nombrea, String apellidoa) {
			this.nombre=nombrea;
			this.apellido=apellidoa;
			numalumno++;
		
		}
		
	}

