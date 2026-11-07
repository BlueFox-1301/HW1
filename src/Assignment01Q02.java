public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;

        int arg = Integer.parseInt(args[0]);

        for (int i = 0; i < arg; i++) {

            double temp = 0;
            temp += (1.0 / ((i * 2) + 1));
            if (i % 2 == 1) {temp *= -1;}
            approxPi += temp;
        }

        approxPi *= 4;

        System.out.println(approxPi + " " + actualPi);
    }
}
