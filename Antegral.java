
public class Antegral {

    private IFunc mFunc;
    private boolean debug = true;
    private double mTol = 0.001;

    public Antegral(IFunc func) {
        mFunc = func;
    }

    public Antegral(IFunc func, double tol) {
        mFunc = func;
        mTol = tol;
    }

    public double calcute(double start, double end) {

        double p = start;

        return 5;
    }

    private void Log(double val) {
        System.out.println(val);
    }
}