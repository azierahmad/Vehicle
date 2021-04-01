class VehicleTest{
    public static void main(String[] args) {
        Vehicle bike = new Vehicle();
        Vehicle car = new Vehicle();
        bike.setNumberOfWheels(4);
        bike.setColor("white");

        int bikeWheels = bike.getNumberOfWheels();
        String bikeColor = bike.getColor();

        car.setNumberOfWheels(10);
        car.setColor("red");

        int carWheels = car.getNumberOfWheels();
        String carColor = car.getColor();

        System.out.println("Bike Object of Wheels: "+ bikeWheels+ ", Color: "+ bikeColor);
        System.out.println("Car Object of Wheels: "+ carWheels+ ", Color: "+ carColor);

    }
}