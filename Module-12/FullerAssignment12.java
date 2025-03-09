/*
Brett Fuller
CSD-402 Assignment 12.2
3/6/25
*/
//This assignment shows the concept of overloading methods. We write 4 methods of the
//same nameeach taking different numbers of inputs all returning a double.
class FullerAssignment12 {
    //Method that Will return the standard service charge originally I had the cost of the service
    // charge visible to the full class but decided to move it inside of this method and call it from
    // the other functions.  Mostly because I was curious if it would work and it did!
    public static double yearlyService(){
        double standardServiceCharge = 29.99;
        return standardServiceCharge;
    }
    //Method that Will return the standard service charge with an added oil change fee.
    public static double yearlyService(double oilChange){
        double svc = yearlyService();
        return svc + oilChange;
    }
    //Medthod that Will return the standard service charge with an added oil change fee and a tire rotation charge.
    public static double yearlyService(double oilChange, double tireRotation){
        double svc = yearlyService();
        return svc + oilChange + tireRotation;
    }
    //Method that Will return the standard service charge with an added oil change fee, a tire rotation charge, along
    // with a coupon amount that will be deducted from the total cost.
    public static double yearlyService(double oilChange, double tireRotation, double coupon){
        double svc = yearlyService();
        return svc + oilChange + tireRotation - coupon;
    }
    //Main method will test each of these methods two times.
    public static void main(String[] args) {
        System.out.printf("\nStandard Annual Service: $%.2f\n", yearlyService());
        System.out.printf("Annual Service and Car Oil Change: $%.2f\n", yearlyService(49.99));
        System.out.printf("Annual Service, Car Oil Change, and Tire Rotation: $%.2f\n", yearlyService(49.99, 25.99));
        System.out.printf("Annual Service, Car Oil Change, and Tire Rotation with $25 Coupon: $%.2f\n\n", yearlyService(49.99, 25.99, 25.0));

        System.out.printf("Standard Annual Service: $%.2f\n", yearlyService());
        System.out.printf("Annual Service and Truck Oil Change: $%.2f\n", yearlyService(69.99));
        System.out.printf("Annual Service, Truck Oil Change, and 5 wheel Tire Rotation: $%.2f\n", yearlyService(69.99, 32.99));
        System.out.printf("Annual Service, Truck Oil Change, and 5 wheel Tire Rotation with $50 Coupon: $%.2f\n\n", yearlyService(69.99, 32.99, 50.00));
    }
}
