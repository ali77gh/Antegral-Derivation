
public class Derivation {

    private IFunc mFunc;
    private double mTol = 0.0000001;

    public Derivation(IFunc func) {
        mFunc = func;
    }

    public Derivation(IFunc func, double tol) {
        mFunc = func;
        mTol = tol;
    }

    public double calcute(double x) {

        double y1 = mFunc.func(x - mTol);
        double y2 = mFunc.func(x + mTol);

        return (y2 - y1) / (2*mTol);
    }
}