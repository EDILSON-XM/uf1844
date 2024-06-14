package clases;

import java.util.Objects;

//Clase creada en el paquete correcto
public  class Hora {

	// Variables miembro correctas
	//ATRIBUTOS
	protected int hora;
	protected int minutos;
	protected int segundos;
	
	// Constructor sin parámetros correcto, no es necesario poner 00
	// podrías haber puesto sólo 0
	//METODOS CONSTRUCTOR SIN PARAMETROS
	/**
	 * @param hora
	 * @param minutos
	 * @param segundos
	 */
	public Hora() {
		super();
		this.hora = 00;
		this.minutos = 00;
		this.segundos = 00;
	}

	//METODOS CONSTRUCTOR CON PARAMETROS
	
	
	// Constructor incorrecto, la hora no está bien validada, la condición debería ser
	// 		if (hora>0 && hora<=23 && minutos>0 && minutos<=59  && segundos>0 && segundos<=59 )
	//0.125,además sería más correcto llamar aquí a valida o a setHora

	/**
	 * @param hora
	 * @param minutos
	 * @param segundos
	 */
	public Hora(int hora, int minutos, int segundos) {
		
		
		if (hora>0 ||hora==23 && minutos>0 || minutos==59  && segundos>0||segundos==59 ) {
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
		}else {
			this.hora = 00;
			this.minutos = 00;
			this.segundos = 00;

		}
		
		
			
		
	}

	//Constructor de copia correcto
	//METODOS CONSTRUCTOR CON PARAMETROS
	/**
	 * @param hora
	 * @param minutos
	 * @param segundos
	 */
	public Hora(Hora copia) {
		super();
		this.hora = copia.hora;
		this.minutos = copia.minutos;
		this.segundos = copia.segundos;
	}
	//METODOS PRIVATE

	// Método con el mismo problema que el constructor, condición incorrecta
	/**
	 * @param hora
	 * @param minutos
	 * @param segundos
	 */
	public static boolean valida  (int hora, int minutos, int segundos) {
		
		if (hora>0 || hora==23 && minutos>0 || minutos==59  && segundos>0 || segundos==59 ) {
			
			return true;
		}else {
			return false;
		}
		
	}

	
  // Getters
	// getters correctos
	
	/**
	 * @return the hora
	 */
	public int getHora() {
		return hora;
	}

	/**
	 * @return the minutos
	 */
	public int getMinutos() {
		return minutos;
	}

	/**
	 * @return the segundos
	 */
	public int getSegundos() {
		return segundos;
	}

	
	/**
	// SETTERS
	 */
	/**
	 * @param hora the hora to set
	 */
	/**
	public void setHora(int hora) {
		this.hora = hora;
	}**/

	/**
	 * @param minutos the minutos to set
	 */
	/**public void setMinutos(int minutos) {
		this.minutos = minutos;
	}**/

	/**
	 * @param segundos the segundos to set
	 */
	/**public void setSegundos(int segundos) {
		this.segundos = segundos;
	}**/
	
	//Metodo SetHora
	// método con el mismo error que los demás
	public    void  setHora(int hora,int minutos,int segundos) {
if (hora>0 || hora==23 && minutos>0 || minutos==59  && segundos>0 || segundos==59 ) {
			
			this.hora=hora;
			this.minutos=minutos;
			this.segundos=segundos;
		}else {
			this.hora=12;
			this.minutos=20;
			this.segundos=58;
			
			
		}
		
	}
	

	//COMPROVAR HORA
	// esto no se pedía
	@Override
	public int hashCode() {
		return Objects.hash(hora, minutos, segundos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hora other = (Hora) obj;
		return hora == other.hora && minutos == other.minutos && segundos == other.segundos;
	}

	
	// toString correcto
	//METODO toString
	@Override
	public String toString() {
		return "Hora [hora=" + hora + ", minutos=" + minutos + ", segundos=" + segundos + "]";
	}
  
	
	//METODO  SEGUNDOS
	// método correcto
public int aSegundos() {
return  hora*3600+minutos*60+segundos;
		
		
		
		
		
		
	}
}
