import java.util.Date;

public class Adopcion {
    private Date fecha;
    private Animal animal;
    private Adoptante adoptante;

    public Adopcion(Date fecha, Animal animal, Adoptante adoptante) {
        this.setFecha(fecha);
        this.setAnimal(animal);
        this.setAdoptante(adoptante);
        this.animal.setAdopcion(this);
    }
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Adoptante getAdoptante() {
        return adoptante;
    }

    public void setAdoptante(Adoptante adoptante) {
        this.adoptante = adoptante;
    }
}
