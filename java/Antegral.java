
public class Antegral {

    private IFunc mFunc;
    private boolean debug = false;
    private double mTol = 0.00001;

    public Antegral(IFunc func) {
        mFunc = func;
    }

    public Antegral(IFunc func, double tol) {
        mFunc = func;
        mTol = tol;
    }

    public double calcute(double start, double end) {

        double p = start;

        double sum = 0;
        while (p < end) {
            p += mTol;
            Log("p",p);
            sum += mFunc.func(p);
            Log("sum",sum);
        }
        sum *= mTol;
        return sum;
    }

    private void Log(String tag,double val) {
        if (debug)
            System.out.println(tag+": "+String.valueOf(val) );
    }
}