from math import pi
from random import uniform

count = 0
ITERATIONS = 1000000

for i in range(ITERATIONS): 
	x = uniform(-1, 1) 
	y = uniform(-1, 1)
	if (x ** 2 + y ** 2) <= 1:
		count += 1

estimation = 4 * count / ITERATIONS
print("Estimation value of PI is : ", estimation)
print("Actaual value of PI is    : ", pi)
print("Error : ", pi - estimation)
