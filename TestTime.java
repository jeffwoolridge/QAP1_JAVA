public class TestTime {
    public static void main(String[] args) {
        // Create two Time objects using constructor 
        Time t1 = new Time(0, 0, 0);
        Time t2 = new Time(0, 0, 0);

        // Set their times using set methods
        t1.setTime(21, 10, 15);
        t2.setTime(10, 20, 25);

        // Display initial times
        System.out.println(" \n");
        System.out.println("Before change:");

        // Display t1
        System.out.println("t1 = " + t1.toString());

        // Display t2
        System.out.println("t2 = " + t2.toString());

        // Call methods 
        t1.nextSecond();
        t2.previousSecond();

        // Display times after change
        System.out.println("\nAfter change:");
        System.out.println("t1 = " + t1.toString());
        System.out.println("t2 = "  + t2.toString());
        System.out.println(" \n");
    }
}
