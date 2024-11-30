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

    public Donante getRolDonante() {
        for (Rol rol : roles) {
            if (rol instanceof Donante) {
                return (Donante) rol;
            }
        }
        return null;
    }

    public Adoptante getRolAdoptante() {
        for (Rol rol : roles) {
            if (rol instanceof Adoptante) {
                return (Adoptante) rol;
            }
        }
        return null;
    }

    public Voluntario getRolVoluntario() {
        for (Rol rol : roles) {
            if (rol instanceof Voluntario) {
                return (Voluntario) rol;
            }
        }
        return null;
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

}
