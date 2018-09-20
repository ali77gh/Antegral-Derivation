var mTol = 0.0000001;

exports.calcute = function (x, func) {

    var y1 = func(x - mTol);
    var y2 = func(x + mTol);

    return (y2 - y1) / (2 * mTol);
}