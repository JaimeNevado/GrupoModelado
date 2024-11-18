import java.util.Date;

public class Animal {
    private Date fechaNacimiento;
    private EstadoAnimal estado;

    public Animal(Date nacimiento, EstadoAnimal estado) {
        this.fechaNacimiento = nacimiento;
        this.estado = estado;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public EstadoAnimal getEstado() {
        return estado;
    }

    public void setEstado(EstadoAnimal estado) {
        this.estado = estado;
    }
}
