import java.util.Date;
public class Adoptante extends Rol {
    public Adoptante(Date registro,Refugio refugio) {
        super(registro,refugio);
    }
    /**
	 * 
	 * @param a
	 */
    public void adoptar(Animal a, Voluntario v) {
        v.tramitarAdopcion(a,this);
        
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
