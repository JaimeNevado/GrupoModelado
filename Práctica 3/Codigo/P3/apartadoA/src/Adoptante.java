import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Adoptante extends Socio {
    private List<Adopcion> adopciones;
    public Adoptante(Date registro,Refugio refugio) {
        super(registro,refugio);
        adopciones = new ArrayList<>();
    }
    
    public void adoptar(Animal a, Voluntario v) {
        v.tramitarAdopcion(a,this);
    }

    public List<Adopcion> getAdopciones() {
        return adopciones;
    }

    public void setAdopciones(List<Adopcion> adopciones) {
        this.adopciones = adopciones;
    }

    protected void añadirAdopcion(Adopcion ad) {
        adopciones.add(ad);
    }
}
