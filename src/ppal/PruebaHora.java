package ppal;

import clases.Hora;
import clases.HoraMsg;

/** 
 * Clase que comprueba que la clase Hora funciona correctamente 
 * @author David
 *
 */
public class PruebaHora {

	public static void main(String[] args) {
		
		System.out.println("============================================================");
		System.out.println("=                 Probando la clase Hora                   =");
		System.out.println("============================================================");
		
		System.out.println("Creando un hora con el contructor sin parámetros");
		Hora hora = new Hora();
		
		System.out.println("La hora creada es "+hora);
		
		
		
		System.out.println("============================================================");
		System.out.println("=  Probando Constructor con parámetros - Hora incorrecta   =");
		System.out.println("============================================================");
		System.out.println("Creando hora 27:68:38...");
		hora = new Hora(27,68,38);
		System.out.println("La hora creada es "+ hora+ " (debe salir 00:00:00)");
		
		
		
		System.out.println("============================================================");
		System.out.println("=   Probando Constructor con parámetros - Hora correcta    =");
		System.out.println("============================================================");
		System.out.println("Creando hora 12:25:38...");
		hora = new Hora(12,25,38);
		System.out.println("La hora creada es "+ hora);
		
		
		
		System.out.println("============================================================");
		System.out.println("=    Probando Constructor de copia - Copiando 12:25:38     =");
		System.out.println("============================================================");
		Hora hora2 = new Hora(hora);
		System.out.println("La hora creada es "+hora2);
		
		
		
		System.out.println("============================================================");
		System.out.println("=                      Probando getters...                 =");
		System.out.println("============================================================");
		System.out.println("El objeto mostrado con getters es hora="+hora.getHora()+", minutos="+hora.getMinutos()+", segundos="+hora.getSegundos());
		
	
		
		System.out.println("============================================================");
		System.out.println("=        Comprobando setHora - hora2 a 20:08:75            =");
		System.out.println("============================================================");
		hora2.setHora(20,8,75);
		System.out.println("La fecha cambiada debe ser la medianoche: " + hora2);
		hora2.setHora(20, 18, 59);
		System.out.println("La fecha ahora debe ser 20:18:59: "+hora2);
		
		
		
		System.out.println("============================================================");
		System.out.println("=            Comprobando método aSegundos                  =");
		System.out.println("============================================================");
		System.out.println("Las 20:18:59 deben devolver 73.062 segundos para ser correcto: "+hora2.aSegundos());
		
		
		
		System.out.println("============================================================");
		System.out.println("=            Comprobando método HoraMsg                    =");
		System.out.println("============================================================");
		System.out.println("Creando un HoraMsg con el contructor sin parámetros");
		HoraMsg horaMsg1 = new HoraMsg();
		
		
		System.out.println("La hora creada es "+horaMsg1);
		
		
		/**
		System.out.println("Creando hora 09:31:22:97...");
		horaMsg1 = new HoraMsg(12,25,38,97);
		System.out.println("La hora creada es "+ hora);
		
		/**
		System.out.println("fin de pruebas...");
		**/
	}

}
