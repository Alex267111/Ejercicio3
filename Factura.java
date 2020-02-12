/**
 * Clase definida como elemento basico a la hora de crear facturas para el programa
 *
 * @author Alexander Correa, Fernando Correa y Paul 
 */

public class Factura{
  public int num; 
  public float base; 
  public float tipoIva; 
  public Estados estado;
  /**
   * Constructor de la clase factura.
   * 
   * @param num 
   * @param base 
   * @param tipoIva El tipo del iva aplicado a la factura
   * @param estado Estado en el que se encuentra la factura (enum)
   */
  
  public static void main(String[] args) {
    
  }

  public void cambiarEstado(Estado estado) {
  }

  /**
   * Devuelve un float que indica la cantidad total de la factura
   * 
   * @return float que indica el precio total de la factura
  **/
  public float getTotal() {
  }
  
  /**
   * Devuelve un float que indica la cantidad de IVA aplicado a la factura
   * 
   * @return float que indica el IVA de la factura
  **/ 
  public float getCantidadIva() {
  }
}
