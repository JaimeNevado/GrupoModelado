import java.util.*;

public class Socio {
    private Date registro;
    private Refugio refugio;
    private List<Rol> roles = new ArrayList<>();

    public Socio(Date registro, Refugio refugio) {
        this.setRegistro(registro);
        this.setRefugio(refugio);
    }

    public void agregarRol(Rol rol) {
        if (!roles.contains(rol)) {
            roles.add(rol);
        }
    }
    

    public List<Rol> getRoles() {
        return roles;
    }

    public Date getRegistro() {
        return registro;
    }

    public void setRegistro(Date registro) {
        this.registro = registro;
    }

    public Refugio getRefugio() {
        return refugio;
    }

    public void setRefugio(Refugio refugio) {
        this.refugio = refugio;
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
