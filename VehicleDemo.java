class Vehicle {

   
    private int numberOfTyres;
    private String engine_No;
    private String ;
    private String RTOName;

    
    private static int count = 0;

    
    Vehicle(int numberOfTyres, String engine_No, String bodyColor) {
        this.numberOfTyres = numberOfTyres;
        this.engine_No = engine_No;
        this.bodyColor = bodyColor;
        count++;
    }

    
    {
        RTOName = "Ahmedabad";
        System.out.println("Till now the objects created are " + (count + 1));
    }

    
    public void setRTOName(String RTOName) {
        this.RTOName = RTOName;
    }

    
    public String getRTOName() {
        return RTOName;
    }

    
    @Override
    public String toString() {
        return "Number of Tyres = " + numberOfTyres +
               "\nEngine No = " + engine_No +
               "\nBody Color = " + bodyColor +
               "\nRTO Name = " + RTOName +
               "\nTotal Objects Created = " + count;
    }
}

public class VehicleDemo {

    public static void main(String[] args) {

        
        Vehicle v1 = new Vehicle(4, "ENG101", "White");
        Vehicle v2 = new Vehicle(4, "ENG102", "Black");
        Vehicle v3 = new Vehicle(2, "ENG103", "Red");

        
        v1.setRTOName("Gandhinagar");
        v2.setRTOName("Rajkot");

        
        System.out.println("\nVehicle 1:");
        System.out.println(v1.toString());

        System.out.println("\nVehicle 2:");
        System.out.println(v2.toString());

        System.out.println("\nVehicle 3:");
        System.out.println(v3.toString());
    }
}
//hello everyone. I am kalgee senjaliya from computer department.