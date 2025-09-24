import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


/**
 * Representa la venta de boletos realizada en un día específico.
 * <p>
 * La clase almacena la fecha de la venta, los boletos vendidos,
 * permite calcular el total de ventas del día y darle formato a la fecha.
 */
public class VentaDelDia {
    /** Fecha en que se registró la venta (formato yyyy-MM-dd). */
    private String fechaDeLaVenta;
    /** Lista de boletos vendidos durante el día. */
    private List<BoletoMuseo> boletosVendidos;
    
    /**
     * Método constructor de la clase.
     * <p>
     * Crea una nueva venta del día con la fecha actual
     * y una lista vacía de boletos vendidos.
     */
    public VentaDelDia() {
        fechaDeLaVenta = establecerFechaDeLaVenta();
        boletosVendidos = new ArrayList<>();
    }
    
    /**
     * Registra un boleto vendido en la lista de la venta
     * del día.
     *
     * @param boleto el boleto vendido que se va a registrar
     */
    public void registrarVentaBoleto(BoletoMuseo boleto) {
        boletosVendidos.add(boleto);
    }
    
    /**
     * Calcula el monto total de la venta del día sumando los precios
     * de todos los boletos registrados.
     *
     * @return  total  el total de la venta del día
     */
    public double calcularTotalVentaDelDia() {
        double total = 0.0;
        for (BoletoMuseo b : boletosVendidos) {
            total += b.getPrecio();
        }
        return total;
    }
    
    /**
     * Establece la fecha de la venta con el formato yyyy-MM-dd.
     *
     * @return la fecha actual como cadena en formato yyyy-MM-dd
     */
    private String establecerFechaDeLaVenta() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.now().format(f);
    }
    
    /**
     * Retorna una representación de tipo String de la venta del día, 
     * incluyendo fecha, cantidad de boletos, detalle de cada boleto y total.
     *
     * @return  msg  una cadena con la información de la venta del día
     */
    public String toString() {
        String msg = "VentaDelDia\n";
        msg += " Fecha: " + fechaDeLaVenta + "\n";
        msg += " Cantidad de boletos: " + boletosVendidos.size() + "\n";
        msg += " Detalle:\n";
        for (BoletoMuseo b : boletosVendidos) {
            msg += " - Boleto #" + b.getNumeroBoleto() + " | " + b.getPrecio() + "\n";
        }
        msg += " Total: " + calcularTotalVentaDelDia();
        return msg;
    }
} 