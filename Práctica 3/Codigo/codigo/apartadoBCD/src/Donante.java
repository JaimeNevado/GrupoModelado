import java.util.ArrayList;
import java.util.Date;

public class Donante extends Rol {
    ArrayList<Donacion> donaciones;
    protected Socio socio;

    public Donante(Date registro, Refugio refugio) {
        socio = new Socio(registro, refugio);
        socio.agregarRol(this);
        donaciones = new ArrayList<>();
    }
    /**
	 * 
	 * @param c
	 */
    public void donar(Float c) {
        Donacion d = new Donacion(c, new Date());
        donaciones.add(d);
        Refugio refugio = socio.getRefugio();
        refugio.setLiquidez(refugio.getLiquidez() + d.getCantidad());
    }

}
