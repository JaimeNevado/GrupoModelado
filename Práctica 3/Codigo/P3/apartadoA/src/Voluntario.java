import java.util.Date;
import java.util.ArrayList;

public class Voluntario extends Socio {
    private ArrayList<Adopcion> tramites;
    
    public Voluntario(Date registro,Refugio refugio) {
        super(registro,refugio);
        this.tramites = new ArrayList<>();
    }

    public void tramitarAdopcion(Animal a, Adoptante ad) {
        Adopcion adopcion = new Adopcion(new Date(), a, ad);
        tramites.add(adopcion);
        a.setEstado(EstadoAnimal.adoptado);
        ad.añadirAdopcion(adopcion);

        Refugio refugio = this.getRefugio();

        if (refugio.getAnimalesRefugiados().remove(a)) {
            System.out.println("El animal ha sido adoptado y eliminado del refugio.");
        } else {
            System.out.println("El animal no está en la lista de animales refugiados.");
        }
    }

    public void registrar(Animal a) {
        super.getRefugio().registrar(a);
    }
}
