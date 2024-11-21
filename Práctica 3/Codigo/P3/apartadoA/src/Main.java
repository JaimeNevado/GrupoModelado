import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Refugio refMalaga = new Refugio((float)1000);
        Donante hugo = new Donante(new Date(), refMalaga);

        hugo.donar((float) 100);

        if (refMalaga.getLiquidez() == 1100) {
            System.out.println("La donación se ha hecho correctamente");
        }

        Animal[] animales = new Animal[3];

        for (int i = 0; i < 3; i++) {
            animales[i] = new Animal(new Date(), EstadoAnimal.disponible);
            refMalaga.registrar(animales[i]);
        }

        System.out.println("Hay " + refMalaga.getAnimalesRefugiados().size() + " animales en el refugio");

        Adoptante sergio = new Adoptante(new Date(), refMalaga);
        Voluntario jose = new Voluntario(new Date(), refMalaga);

        sergio.adoptar(animales[1], jose);

        System.out.println("Sergio ha adoptado " + sergio.getAdopciones().size() + " animal/es");
        System.out.println("Hay " + refMalaga.getAnimalesRefugiados().size() + " animales en el refugio");

    }
}
