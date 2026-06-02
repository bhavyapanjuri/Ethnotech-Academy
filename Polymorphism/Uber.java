public class Uber {
    void calculateFare()
    {
        System.out.println("Calculating Fare:");
    }
    class Auto extends Uber
    {
        @Override
        void calculateFare()
        {
            double fare = 60.00;
            System.out.println("Auto Fare is: " + fare);
        }
    }
    class TaxiCar extends Uber
    {
        @Override
        void calculateFare()
        {
            double fare = 150.00;
            System.out.println("Taxi Car Fare is: " + fare);
        }
    }
    public static void main(String[] args)
    {
        Uber obj = new Uber();
        obj.calculateFare();
        Auto auto = obj.new Auto();
        auto.calculateFare();
        TaxiCar taxiCar = obj.new TaxiCar();
        taxiCar.calculateFare();
        }
}
