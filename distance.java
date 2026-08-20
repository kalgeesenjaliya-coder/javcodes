class Distance {
    int feet;
    int inch;

    
    Distance(int feet) {
        this.feet = feet;
        this.inch = 5;
    }

    
    Distance() {
        this(5);
    }

    
    Distance(Distance d) {
        this.feet = d.feet;
        this.inch = d.inch;
    }

    void display() {
        System.out.println("Feet = " + feet);
        System.out.println("Inch = " + inch);
    }

    public static void main(String[] args) {

        
        Distance d1 = new Distance();
        System.out.println("Default Constructor:");
        d1.display();

        Distance d2 = new Distance(10);
        System.out.println("\nOne-Argument Constructor:");
        d2.display();

       
        Distance d3 = new Distance(d2);
        System.out.println("\nCopy Constructor:");
        d3.display();
    }
}