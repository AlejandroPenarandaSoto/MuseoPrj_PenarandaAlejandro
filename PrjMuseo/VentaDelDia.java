import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
public class VentaDelDia {
    private String fechaDeLaVenta;
    private List<BoletoMuseo> boletosVendidos;
    
    public VentaDelDia() {
        fechaDeLaVenta = establecerFechaDeLaVenta();
        boletosVendidos = new ArrayList<>();
    }
    
    public void registrarVentaBoleto(BoletoMuseo boleto) {
        boletosVendidos.add(boleto);
    }
    
    public double calcularTotalVentaDelDia() {
    double total = 0.0;
    for (BoletoMuseo b : boletosVendidos) {
        total += b.getPrecio();
    }
    return total;
    }
    private String establecerFechaDeLaVenta() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.now().format(f);
    }
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