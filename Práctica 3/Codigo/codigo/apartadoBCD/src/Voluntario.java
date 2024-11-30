import java.util.Date;
import java.util.ArrayList;

public class Voluntario extends Rol {
    private ArrayList<Adopcion> tramites;
    Socio socio;
	
    public Voluntario(Date registro,Refugio refugio) {
        socio = new Socio(registro, refugio);
        socio.agregarRol(this);
        this.tramites = new ArrayList<>();
    }

    public void tramitarAdopcion(Animal a, Adoptante ad) {
        Adopcion adopcion = new Adopcion(new Date(), a, ad);
        tramites.add(adopcion);
        a.setEstado(EstadoAnimal.adoptado);
        ad.anadirAdopcion(adopcion);

        Refugio refugio = socio.getRefugio();
        
        if (refugio.getAnimalesRefugiados().remove(a)) {
            System.out.println("El animal ha sido adoptado y eliminado del refugio.");
        } else {
            System.out.println("El animal no está en la lista de animales refugiados.");
        }
    }

    public void registrar(Animal a) {
        socio.getRefugio().registrar(a);
    }
}
