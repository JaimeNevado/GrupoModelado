import java.util.Date;
public class Adoptante extends Socio {
    public Adoptante(Date registro,Refugio refugio) {
        super(registro,refugio);
    }
    
    public void adoptar(Animal a, Voluntario v) {
        v.tramitarAdopcion(a,this);
        
    }
}
