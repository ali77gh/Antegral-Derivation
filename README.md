# Antegral
Antegral Calculator java 

# use
add IFunc.java , Antegral.java
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
# how it works
sum of millions of Rectangles
