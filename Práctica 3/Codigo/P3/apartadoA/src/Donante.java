import java.util.ArrayList;
import java.util.Date;

public class Donante extends Socio {
    ArrayList<Donacion> donaciones;

    public Donante(Date registro, Refugio refugio) {
        super(registro, refugio);
        donaciones = new ArrayList<>();
    }
    
    public void donar(Float c) {
        Donacion d = new Donacion(c, new Date());
        donaciones.add(d);
        Refugio refugio = this.getRefugio();
        refugio.setLiquidez(refugio.getLiquidez() + d.getCantidad());
    }
}
