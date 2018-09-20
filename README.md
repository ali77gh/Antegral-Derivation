# Antegral
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
python3
~~~python 
import Antegral 
# put your function here
def func(input):
    return input*2

sum = Antegral.Calculate(0,2,func)
~~~
js
~~~javascript
var antegral = require("./Antegral");

var sum = antegral.calcute(0, 2,
    function (x) {
        return 2 * x;//put your function here
    }
);
~~~


# Derivation
java
~~~java
Derivation derivation = new Derivation(new IFunc() {
       @Override
       public double func(double input) {
           return input * input;
       }
});

derivation.calcute(10);
~~~
python3
~~~python 
import Derivation
# put your function here
def func(input):
    return input*2

sum = Derivation.Calculate(10,func)
~~~
js
~~~javascript
var derivation = require("./Derivation");

var an = derivation.calcute(10,(x)=>{
    //your function here
    return x*x;
});
~~~

# Test
function : 2x ,
start : 0 ,
end : 2 <br> <b>
python: 0.162s <br>
javascript: 0.457s <br>
java: 0.095s <br> </b>
right answer : 4
program answer : 4.00002
