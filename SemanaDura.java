package enumeracion;

import java.util.*;

public class SemanaDura {
	enum DiasSemana {
		LUNES('L'), MARTES('M'), MIERCOLES('X'), JUEVES('J'), VIERNES('V');

		// Propiedades
		private char letra;

		// Constructor
		private DiasSemana(char letra) {
			this.letra = letra;

		}

		public char getLetra() {
			return this.letra;
		}
	}

	public static void main(String[] args) {
		
			Scanner entrada = new Scanner(System.in);
			System.out.println("Escribe alguno de los siguientes dias: LUNES,MARTES,MIERCOLES,JUEVES,VIERNES");
			String entrada_datos = entrada.next().toUpperCase();
			DiasSemana mis_dias = Enum.valueOf(DiasSemana.class, entrada_datos);
			
			System.out.println("Mi dia " + mis_dias);
			System.out.println("LETRA " + mis_dias.getLetra() );
		
		
	}
}
