# Antegral
Antegral Calculator 

# use
java
~~~java
Antegral antegral = new Antegral(new IFunc() {

            @Override
            public double func(double input) {
                // defind  function here
                return 4 * input;
            }
        });

antegral.calcute(0, 2); // this will return Area
~~~
python
~~~python 
from Antegral import Calculate
# put your function here
def func(input):
    return input*2

sum = Calculate(0,2,func)
print(sum)
~~~
js
~~~javascript
var antegral = require("./Antegral");

var sum = antegral.calcute(0, 2,
    function (x) {
        return 2 * x;//put your function here
    }
);

console.log(sum);
~~~
# how it works
sum of millions of Rectangles
