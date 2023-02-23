public class ServiceStation {
    public void check(Car car) {
        service(car);
        car.checkEngine();
    }

    public void check(Bicycle bicycle) {
        service(bicycle);
    }

    public void check(Truck truck) {
        service(truck);
        truck.checkEngine();
        truck.checkTrailer();
    }
    private void service(Transport transport) {
        if (transport != null) {
            System.out.println("Обслуживаем " + transport.getModelName());
            for (int i = 0; i < transport.getWheelsCount(); i++) {
                transport.updateTyre();
            }
        }
    }
}
