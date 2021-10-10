public class Compute {

    public static void compute(String toCompute) {

        try {
            String computed = "";
            int number;

            number = Integer.parseInt(toCompute);

            computed = addIfDivisible(computed, number);

            computed = AddIfContains(toCompute, computed);

            if (computed.isEmpty())
                System.out.println(toCompute);
            else
                System.out.println(computed);

        } catch (NumberFormatException ex) {
            System.out.println("Format incorrect : Veuillez saisir un nombre ");
        }
    }

    private static String AddIfContains(String toCompute, String computed) {
        for (int i = 0; i < toCompute.length() ; i++ ) {
            if (toCompute.charAt(i) == '3')
                computed += "Toto";
            if (toCompute.charAt(i) == '5')
                computed += "Tutu";
            if (toCompute.charAt(i) == '7')
                computed += "Titi";
            if (toCompute.charAt(i) == '0')
                computed += "*";
        }
        return computed;
    }

    private static String addIfDivisible(String computed, int number) {
        if (number % 3 == 0)
            computed += "Toto";
        if (number % 5 == 0)
            computed += "Tutu";
        if (number % 7 == 0)
            computed += "Titi";
        return computed;
    }


    public static void main(String []args){
        compute("1");
        compute("2");
        compute("3");
        compute("4");
        compute("5");
        compute("6");
        compute("7");
        compute("8");
        compute("9");
        compute("10");
        compute("13");
        compute("15");
        compute("21");
        compute("33");
        compute("51");
        compute("53");
        compute("303");
        compute("105");
        compute("10101");

    }
}
