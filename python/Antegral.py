
def Calculate(start,end,func):
    p = start
    mTol = 0.00001
    sum = 0
    while p < end:
        p += mTol
        Log("p", p)
        sum += func(p)
        Log("sum", sum)
    sum *= mTol
    return sum

debug = 0
def Log(tag,val):
    if debug:
        print(tag + str(val))
