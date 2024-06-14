package clases;

public class HoraMsg  extends  Hora{
	// variable miembro correcta
	private int msg;

	
	// incorrecto, aquí no hay que volver a repetir código, para algo tenemos la herencia
	// hay que llamar al super y asignar los milisegundos
	/**
	 * @param msg
	 */
	public HoraMsg() {
		super();
		
		if(hora>0 || hora==23 && minutos>0 || minutos==59  && segundos>0 || segundos==59 ) {
		this.msg = msg;}else {
			this.hora = 00;
			this.minutos = 00;
			this.segundos = 00;
		}
			
		
	}
	
	// No has creado el constructor con parámetros
	
	// No has creado el constructor de copia
	
	// getter correcto
//Metodos getters
	/**
	 * @return the msg
	 */
	public int getMsg() {
		return msg;
	}
	
	
	//Metodo toString


	// toString correcto
	@Override
	public String toString() {
		return "HoraMsg [msg=" + msg + ", hora=" + hora + ", minutos=" + minutos + ", segundos=" + segundos + "]";
	}
	

	

}
