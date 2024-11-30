import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Adoptante extends Rol {
    Socio socio;
    List<Adopcion> adopciones;

    public Adoptante(Date registro, Refugio refugio) {
        socio = new Socio(registro, refugio);
        socio.agregarRol(this);
        adopciones = new ArrayList<>();
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public List<Adopcion> getAdopciones() {
        return adopciones;
    }

    public void anadirAdopcion(Adopcion ad) {
        adopciones.add(ad);
    }

    public void setAdopciones(List<Adopcion> adopciones) {
        this.adopciones = adopciones;
    }
    /**
	 * 
	 * @param a
	 */
    public void adoptar(Animal a, Voluntario v) {
        v.tramitarAdopcion(a,this);
        
    }

}
