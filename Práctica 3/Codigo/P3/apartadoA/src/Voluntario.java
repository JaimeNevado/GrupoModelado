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
        a.setEstado(EstadoAnimal.adoptado);

        Refugio refugio = this.getRefugio();
        //no se si hace falta un if else o solo un
        //refugio.getAnimalesRefugiados().remove(a)
        
        if (refugio.getAnimalesRefugiados().remove(a)) {
            System.out.println("El animal " + a.getNombre() + " ha sido adoptado y eliminado del refugio.");
        } else {
            System.out.println("El animal " + a.getNombre() + " no está en la lista de animales refugiados.");
        }
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
