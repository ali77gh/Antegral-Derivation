
var antegral = require("./Antegral");

var sum = antegral.calcute(0, 2,
    function (x) {
        return 2 * x;
    }
);

console.log(sum);