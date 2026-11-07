public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");
        
        int numOdd = 0;
        int prev = 0;
        int now = 1;
        int temp = 0;

        for (int i = 1; i <= x; i++) {
            System.out.print(now);
            if (now % 2 == 1) {numOdd++;}
            temp = now;
            now += prev;
            prev = temp;
            if (i < x) 
                System.out.print(" "); // Make sure we don't print a trailing space
        }


        System.out.println();
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
