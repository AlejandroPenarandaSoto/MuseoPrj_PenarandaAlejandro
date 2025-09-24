public class Persona {
    private String nombre;
    private String identificacion;
    private BoletoMuseo miBoleto;
    public Persona(String nombre, String ident) {
        this(nombre);
        identificacion = ident;
    }
    
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    public void setIdentificacion(String pIdentificacion) {
        identificacion = pIdentificacion;
    }
    
    public void asignarBoleto(BoletoMuseo pMiBoleto) {
        miBoleto = pMiBoleto;
    }
    
    public int consultarMiNumeroDeBoleto() {
        return miBoleto.getNumeroBoleto();
    }
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