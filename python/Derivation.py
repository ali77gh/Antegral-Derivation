
mTol = 0.0000001

def Calculate(x,func):
    y1 = func(x - mTol)
    y2 = func(x + mTol)
    return (y2 - y1) / (2 * mTol)