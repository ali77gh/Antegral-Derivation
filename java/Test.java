
public class Test {

    public static void main(String[] args) {

        // Antegral antegral = new Antegral(new IFunc() {
        //     @Override
        //     public double func(double input) {
        //         return input * 2;
        //     }
        // });

        // System.out.println(antegral.calcute(0, 2));

        Derivation derivation = new Derivation(new IFunc() {
            @Override
            public double func(double input) {
                return input * input;
            }
        });

        System.out.println(derivation.calcute(10));
    }
}