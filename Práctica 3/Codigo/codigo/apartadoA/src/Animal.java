import java.util.Date;

public class Animal {
    private Date nacimiento;
    private EstadoAnimal estado;
    private Adopcion adopcion;

    public Animal(Date nacimiento, EstadoAnimal estado) {
        this.setNacimiento(nacimiento);
        this.setEstado(estado);
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public EstadoAnimal getEstado() {
        return estado;
    }

    public void setEstado(EstadoAnimal estado) {
        this.estado = estado;
    }

    public void setAdopcion(Adopcion adopcion) {
        this.adopcion = adopcion;
    }

    public Adopcion getAdopcion() {
        return adopcion;
    }
}
