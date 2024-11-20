import java.util.ArrayList;
import java.util.Date;

public class Donante extends Rol {
    ArrayList<Donacion> donaciones;

    public Donante(Date registro, Refugio refugio) {
        super(registro, refugio);
        donaciones = new ArrayList<>();
    }
    /**
	 * 
	 * @param c
	 */
    public void donar(Float c) {
        Donacion d = new Donacion(c, new Date());
        donaciones.add(d);
        Refugio refugio = this.getRefugio();
        refugio.setLiquidez(refugio.getLiquidez() + d.getCantidad());
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null && this.getClass() == obj.getClass();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getClass());
    }
}
