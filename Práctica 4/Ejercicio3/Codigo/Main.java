import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        // Formato de fecha para facilitar la creación de fechas
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Crear oficinas de alquiler
        RentalOffice office1 = new RentalOffice("Calle Principal 123", 20);
        RentalOffice office2 = new RentalOffice("Avenida Secundaria 456", 15);

        // Crear modelos de coches
        Model sedanModel = new Model("Sedan", 50);
        Model suvModel = new Model("SUV", 80);

        // Crear coches y asociarlos con oficinas y modelos
        Car car1 = new Car("ABC123", sedanModel, office1);
        Car car2 = new Car("DEF456", sedanModel, office2);
        Car car3 = new Car("GHI789", suvModel, office1);

        // Agregar coches a las oficinas
        office1.getCars().add(car1);
        office1.getCars().add(car3);
        office2.getCars().add(car2);

        // Crear un cliente
        Customer customer = new Customer("12345678A", "Juan Perez");

        // Crear promociones
        PromotionStrategy noPromotion = new NoPromotion();
        PromotionStrategy amountPromotion = new AmountPromotion(30); // Descuento de 30
        PromotionStrategy percentagePromotion = new PercentagePromotion(20); // 20% de descuento

        // Crear alquileres
        Rental rental1 = new RentalOnSite(
            dateFormat.parse("2024-12-15"),
            dateFormat.parse("2024-12-18"),
            customer,
            car1,
            office1,
            "Sin comentarios",
			noPromotion
        );

        Rental rental2 = new WebRental(
            dateFormat.parse("2024-12-20"),
            dateFormat.parse("2024-12-25"),
            customer,
            car2,
            office1,
            office2,
			noPromotion
        );

        // Asignar promociones a los alquileres
        rental1.setPromotionStrategy(amountPromotion);
        rental2.setPromotionStrategy(percentagePromotion);

        // Agregar alquileres al cliente
        customer.addRental(rental1);
        customer.addRental(rental2);

        // Mostrar precios calculados
        System.out.println("Precio del alquiler 1 (con promoción de cantidad): " + rental1.getPrice() + " euros");
        System.out.println("Precio del alquiler 2 (con promoción de porcentaje): " + rental2.getPrice() + " euros");

        // Comprobar número de alquileres con diferentes oficinas
        int differentOfficeRentals = customer.numberOfRentalsWithDifferentOffices();
        System.out.println("Número de alquileres con recogida y entrega en diferentes oficinas: " + differentOfficeRentals);

        // Poner un coche fuera de servicio
        car1.takeOutOfService(dateFormat.parse("2024-12-31"));
        System.out.println("¿El coche 1 está fuera de servicio? " + car1.isOutOfService());
        System.out.println("Fecha de regreso al servicio del coche 1: " + car1.getBackToServiceDate());

        // Intentar ponerlo fuera de servicio nuevamente
        car1.takeOutOfService(dateFormat.parse("2025-01-15"));
    }
}