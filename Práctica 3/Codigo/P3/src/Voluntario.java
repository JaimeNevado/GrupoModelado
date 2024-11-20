import java.util.Date;
import java.util.ArrayList;

public class Voluntario extends Socio {
    private ArrayList<Adopcion> adopciones;
	/**
	 * 
	 * @param a
	 * @param ad
	 */
    public Voluntario(Date registro,Refugio refugio) {
        super(registro,refugio);
        this.adopciones = new ArrayList<Adopcion>();
    }

    public void tramitarAdopcion(Animal a, Adoptante ad) {
        Adopcion adopcion = new Adopcion(new Date(), a, ad);
        adopciones.add(adopcion);   
    }

	/**
	 * 
	 * @param a
	 * @param r
	 */

    public void registrar(Animal a, Refugio r) {
        r.registrar(a);
    }
}
