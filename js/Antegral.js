var mTol = 0.00001;

exports.calcute = function (start,end, func) {

    var p = start;
    

    var sum = 0;
    while (p < end) {
        p += mTol;
        Log("p", p);
        sum += func(p);
        Log("sum", sum);
    }
    sum *= mTol;
    return sum;
}
var debug = false;
function Log(val) {
    if (debug)
        console.log(val);
}