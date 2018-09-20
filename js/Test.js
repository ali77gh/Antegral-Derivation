
var antegral = require("./Antegral");
var derivation = require("./Derivation");

var sum = antegral.calcute(0, 2,
    function (x) {
        return 2 * x;
    }
);

console.log(sum);

var an = derivation.calcute(10,(x)=>{
    return x*x;
});

console.log(an);