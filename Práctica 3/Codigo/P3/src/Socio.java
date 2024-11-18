import java.util.Date;

public class Socio {
    private Date registro;

    public Socio() {
        this.registro = new Date();
    }

    public Date getRegistro() {
        return registro;
    }

    public void setRegistro(Date registro) {
        this.registro = registro;
    }
}
