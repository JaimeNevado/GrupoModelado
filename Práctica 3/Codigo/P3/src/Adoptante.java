import java.util.Date;
public class Adoptante extends Socio {
    public Adoptante(Date registro,Refugio refugio) {
        super(registro,refugio);
    }
    /**
	 * 
	 * @param a
	 */
    public void adoptar(Animal a, Voluntario v) {

        a.setEstado(EstadoAnimal.adoptado);

        Refugio refugio = this.getRefugio();
        //no se si hace falta un if else o solo un
        //refugio.getAnimalesRefugiados().remove(a)
        if (refugio.getAnimalesRefugiados().remove(a)) {
            System.out.println("El animal " + a.getNombre() + " ha sido adoptado y eliminado del refugio.");
        } else {
            System.out.println("El animal " + a.getNombre() + " no está en la lista de animales refugiados.");
        }

        v.tramitarAdopcion(a,this);
        
    }
}
