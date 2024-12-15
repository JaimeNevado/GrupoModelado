import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Crear oficinas
        RentalOffice office1 = new RentalOffice("123 Main St", 50);
        RentalOffice office2 = new RentalOffice("456 Elm St", 50);

        // Crear modelos
        Model model1 = new Model("Toyota Corolla", 40);

        // Crear coches
        Car car1 = new Car("ABC123", model1, office1);
        Car car2 = new Car("XYZ789", model1, office2);
        office1.getCars().add(car1);
        office2.getCars().add(car2);
        model1.getCars().add(car1);
        model1.getCars().add(car2);

        // Crear cliente
        Customer customer1 = new Customer("12345678A", "John Doe");
		Customer customer2 = new Customer("31212518B", "Paco Leon");

        // Crear alquileres
        Calendar calendar = Calendar.getInstance();
        calendar.set(2024, Calendar.DECEMBER, 1); // Fecha inicio
        Date startDate1 = calendar.getTime();
        calendar.set(2024, Calendar.DECEMBER, 5); // Fecha final
        Date endDate1 = calendar.getTime();

        WebRental rental1 = new WebRental(startDate1, endDate1, customer1, car1, office1, office2);
        rental1.setDeliveryTime(12); // Hora de entrega
        customer1.addRental(rental1);

        calendar.set(2024, Calendar.DECEMBER, 10); // Fecha inicio
        Date startDate2 = calendar.getTime();
        calendar.set(2024, Calendar.DECEMBER, 15); // Fecha final
        Date endDate2 = calendar.getTime();

		// Añadimos las mismas oficinas de recogida y entrega
        WebRental rental2 = new WebRental(startDate2, endDate2, customer1, car2, office2, office2);
        rental2.setDeliveryTime(10); // Hora de entrega
        customer1.addRental(rental2);

        // Calcular número de alquileres con oficinas diferentes
        int rentalsWithDifferentOffices = customer1.numberOfRentalsWithDifferentOffices();

        // Mostrar resultado
        System.out.println("El cliente " + customer1.getName() + " tiene " + rentalsWithDifferentOffices + " alquiler(es) con oficinas diferentes.");
    }
}