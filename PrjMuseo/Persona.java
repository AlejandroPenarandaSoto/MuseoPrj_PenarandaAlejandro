/**
 * Representa a una persona que puede comprar un boleto para el museo.
 * <p>
 * La clase almacena el nombre, la identificación y el boleto asignado
 * (si lo tiene).
 */
public class Persona {
    /** Nombre de la persona. */
    private String nombre;
    /** Identificación única de la persona. */
    private String identificacion;
    /** Boleto asignado a la persona, puede ser null si no tiene. */
    private BoletoMuseo miBoleto;
    
    /**
     * Método constructor que inicializa la persona con nombre
     * e identificación.
     *
     * @param nombre el nombre de la persona
     * @param ident la identificación de la persona
     */
    public Persona(String nombre, String ident) {
        this(nombre);
        identificacion = ident;
    }
    
    /**
     * Método constructor que inicializa la persona solo con nombre.
     *
     * @param nombre el nombre de la persona
     */
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Asigna una identificación a la persona.
     *
     * @param pIdentificacion la identificación que se va a asignar
     */
    public void setIdentificacion(String pIdentificacion) {
        identificacion = pIdentificacion;
    }
    
    /**
     * Asigna un boleto a la persona.
     *
     * @param pMiBoleto el boleto que se va a asignar
     */
    public void asignarBoleto(BoletoMuseo pMiBoleto) {
        miBoleto = pMiBoleto;
    }
    
     /**
     * Consulta el número del boleto asignado a la persona.
     *
     * @return el número del boleto asignado
     */
    public int consultarMiNumeroDeBoleto() {
        return miBoleto.getNumeroBoleto();
    }
    
     /**
     * Retorna una representación en cadena de la persona,
     * incluyendo nombre, identificación y el boleto asignado
     * (si lo tiene).
     *
     * @return una cadena con la información de la persona
     */
    public String toString() {
        String msg = "Persona\n";
        msg += " Nombre: " + nombre + "\n";
        msg += " Identificacion: " + identificacion + "\n";
        if (miBoleto != null) {
            msg += " Boleto asignado: #" + miBoleto.getNumeroBoleto() + "\n";
        } else {
            msg += " Boleto asignado: (ninguno)\n";
        }
        return msg;
    }
}