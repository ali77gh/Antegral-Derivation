
public class Test {

    public static void main(String[] args) {

        Antegral antegral = new Antegral(new IFunc() {
            @Override
            public double func(double input) {
                return 4 * input;
            }
        });

        System.out.println(antegral.calcute(0, 2));

    }
}