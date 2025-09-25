import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Representa un boleto emitido por el museo.
 * <p>
 * Cada boleto tiene un precio, un número único asignado automáticamente
 * en orden de creación y una fecha de emisión.
 */
public class BoletoMuseo {
    /** Precio del boleto. */
    private double precio;
    /** Número único del boleto. */
    private int numeroBoleto;
    /** Fecha en que se emitió el boleto (formato yyyy-MM-dd). */
    private String fechaEmision;
    /** Contador global de boletos emitidos. */
    private static int contador = 0;
    
    /**
     * Método constructor de la clase.
     * <p>
     * Crea un boleto con el precio indicado, asigna un número único
     * y establece la fecha de emisión con la fecha actual.
     *
     * @param  precio  el precio del boleto
     */
    public BoletoMuseo(double precio) {
        this.precio = precio;
        contador++;
        this.numeroBoleto = contador;
        this.fechaEmision = establecerFechaEmisionBoleto();
    }
    
    /**
     * Método privado, que obtiene la fecha actual en formato yyyy-MM-dd
     * para asignarla como fecha de emisión del boleto.
     *
     * @return la fecha de emisión como cadena
     */
    private String establecerFechaEmisionBoleto() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.now().format(f);
    }
    
    /**
     * Devuelve la cantidad total de boletos creados hasta el momento.
     *
     * @return el contador global de boletos
     */
    public static int getContador() {
        return contador;
    }
    
    /**
     * Devuelve el número único asignado a este boleto.
     *
     * @return el número del boleto
     */
    public int getNumeroBoleto() {
        return numeroBoleto;
    }
    
    /**
     * Devuelve el precio de este boleto.
     *
     * @return el precio del boleto
     */
    public double getPrecio() {
        return precio;
    }
    
    /**
     * Retorna una representación de tipo String del boleto,
     * incluyendo número, precio y fecha de emisión.
     *
     * @return una cadena con la información del boleto
     */
    public String toString() {
        String msg = "BoletoMuseo\n";
        msg += " Numero: " + numeroBoleto + "\n";
        msg += " Precio: " + precio + "\n";
        msg += " Fecha Emision: " + fechaEmision;
        return msg;
    }
}