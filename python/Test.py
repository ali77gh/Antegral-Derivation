
from Antegral import Calculate
import Derivation

def func(input):
    return input*input

sum = Calculate(0,2,func)
print(sum)

sum = Derivation.Calculate(10,func)
print(sum)