/**
 * 
 */
package enumeracion;

/**
 * Crear un Enumerado de Cargos de empleado:
 *CARGO: DIRECTOR - 20
 *GERENTE - 10
 *TECNICO - 3
 *COMERCIAL - 5
 *método:
 *getPorcentaje(): int
 * @author Catalin
 *
 */

       enum CARGO{
    	   DIRECTOR(20),GERENTE(10),TECNICO(3),COMERCIAL(5);
    	   //Propiedades
    	   private int porcentaje;
    	   
    	   private CARGO(int numero) {
    		   this.porcentaje=numero;
    	   }
    	   
    	   //Metodos
    	   public int getPorcentaje() {
    		   return this.porcentaje;
    	   }
    	  
}

