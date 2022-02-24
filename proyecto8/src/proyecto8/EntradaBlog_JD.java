package proyecto8;


	/**Clase para manejar las entradas de un blog.
	 * La clase se cre� el 21/3/1999 por Ana L�pez.
	 * @version Esta es la versi�n 2.3
	 */

	//Modificar.
	public class EntradaBlog_JD {
		//separador es el ccar�cter que separa ENTRADA DE del
		//nombre del autor
		
		public static char separador=':';
		private int id;
		private String texto;
		private String autor;
		
		public EntradaBlog_JD(int i, String string, String string2) {
			// TODO Auto-generated constructor stub
		}
		/**
		 * Constructor de la clase. recibe el n�mero de entrada, el nombre del autor
		 * de la entrada y el texto que contiene la entrada. Si el n�mero de entrada
		 * es negativo, lanza una excepci�n.
		 * 
		 * @param id
		 * @author Javier Detlefsen
		 * @version	24/02/2022
		 * @return ID
		 * @param autor
		 * @param texto
		 * @throws IllegalArgumentException
		 */


		public void EntradaBlog(int id,String autor,String texto)throws IllegalArgumentException{
			if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
			this.id=id;
			this.autor=autor;
			this.texto=texto;
		}
		@Override
		public String toString(){
			String cad="";
			cad+="\nENTRADA DE"+separador+autor;
			cad+="\n "+texto;
			return cad;
		}
		/**
		 * Devuelve el n�mero de la entrada
		 * @author Javier Detlefsen
		 * @version	24/02/2022
		 * @return ID
		 */
		
		public int getId(){
			return this.id;
		}
		
		/**
		 * devuelve el texto completo de la entrada
		 * @author Javier Detlefsen
		 * @version	24/02/2022
		 * @return Texto
		 */
		
		public String getTexto(){
			return this.texto;
		}
		

		/**
		 * devuelve el nombre del autor de la entrada en may�sculas
		 * @author Javier Detlefsen
		 * @version	24/02/2022
		 * @return Autor
		 */
		
		
		public String getAutor(){
			return this.autor.toUpperCase();
		}
		
		/**
		 * devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
		 * @author Javier Detlefsen
		 * @version	24/02/2022
		 * @return Autor
		 */
		
		public String devuelveAutor(){
			return this.autor;
		}
		
		/**
		 * No tiene porqu� tener argumentos.
		 * @author Javier Detlefsen
		 * @version	24/02/2022
		 * @return Autor
		 */
		
		
		public static void main(String[] args) {
	                
			EntradaBlog_JD e1=new EntradaBlog_JD (-3,"ana","�ltimas noticias, est� disponible BixBy 2.0");
			System.out.println(e1);
		}
	}

