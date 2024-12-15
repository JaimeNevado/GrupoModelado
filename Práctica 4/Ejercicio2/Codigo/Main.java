import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear oficinas de alquiler
        RentalOffice office1 = new RentalOffice("Calle 1, Ciudad", 50);
        RentalOffice office2 = new RentalOffice("Calle 2, Ciudad", 30);

        // Crear modelo de coche
        Model sedanModel = new Model("Sedan", 40);

        // Crear coches del mismo modelo
        Car car1 = new Car("1234ABC", sedanModel, office1);
        Car car2 = new Car("5678DEF", sedanModel, office1);
        Car car3 = new Car("9101GHI", sedanModel, office2);

        // Añadir coches a las oficinas y al modelo
        office1.getCars().add(car1);
        office1.getCars().add(car2);
        office2.getCars().add(car3);

        sedanModel.getCars().add(car1);
        sedanModel.getCars().add(car2);
        sedanModel.getCars().add(car3);

        // Fecha de fin de servicio
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 7); // Fuera de servicio por una semana
        Date backToServiceDate = calendar.getTime();

        // Probar funcionalidad: Poner car1 fuera de servicio
        System.out.println("Poniendo el coche '1234ABC' fuera de servicio...");
        car1.takeOutOfService(backToServiceDate);

        // Verificar estado de car1
        System.out.println("¿Coche '1234ABC' está fuera de servicio? " + car1.isOutOfService());
        System.out.println("Fecha prevista para volver a servicio: " + car1.getBackToServiceDate());

        // Buscar y verificar coche sustituto
        Car substitute = findSubstituteCar(car1);
        if (substitute != null) {
            System.out.println("Coche sustituto encontrado: " + substitute.getLicensePlate());
        } else {
            System.out.println("No se encontró un coche sustituto.");
        }

        // Intentar poner car1 fuera de servicio nuevamente (sin efecto)
        System.out.println("Intentando poner el coche '1234ABC' fuera de servicio nuevamente...");
        car1.takeOutOfService(backToServiceDate);
    }

    // Método para encontrar un coche sustituto
    private static Car findSubstituteCar(Car carOutOfService) {
        RentalOffice office = carOutOfService.getRentalOffice();
        Model model = carOutOfService.getModel();
        List<Car> cars = office.getCars();

        for (Car car : cars) {
            if (!car.isOutOfService() && car.getModel().equals(model)) {
                return car;
            }
        }
        return null; // No se encontró sustituto
    }
}