import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Refugio refMalaga = new Refugio((float)1000);
        Socio hugo = new Socio(new Date(), refMalaga);
        Donante donanteMalaga = new Donante(new Date(), refMalaga);
        Adoptante adoptanteMalaga = new Adoptante(new Date(), refMalaga);
        Voluntario voluntarioMalaga = new Voluntario(new Date(), refMalaga);
        hugo.agregarRol(donanteMalaga);

        if (hugo.getRolDonante() != null) {
            hugo.getRolDonante().donar((float)1000);
        } else {
            System.out.println("No tiene rol donante");
        }

        if (refMalaga.getLiquidez() == 1100) {
            System.out.println("La donación se ha hecho correctamente");
        }

        Animal[] animales = new Animal[3];

        for (int i = 0; i < 3; i++) {
            animales[i] = new Animal(new Date(), EstadoAnimal.disponible);
            refMalaga.registrar(animales[i]);
        }

        System.out.println("Hay " + refMalaga.getAnimalesRefugiados().size() + " animales en el refugio");

        hugo.agregarRol(adoptanteMalaga);
        Socio jose = new Socio(new Date(), refMalaga);
        jose.agregarRol(voluntarioMalaga);

        if (hugo.getRolAdoptante() != null && jose.getRolVoluntario() != null) {
            hugo.getRolAdoptante().adoptar(animales[1], jose.getRolVoluntario());
            System.out.println("Hugo ha adoptado " + hugo.getRolAdoptante().getAdopciones().size() + " animal/es");
            System.out.println("Hay " + refMalaga.getAnimalesRefugiados().size() + " animales en el refugio");
        } else {
            System.out.println("No tiene roles correctos");
        }

    }
}
