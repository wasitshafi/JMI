from math import sqrt
from random import uniform

NUM = 5
ITERATIONS = 100000
EPS = .0000000001 # Epsilon
count = 0

for i in range(ITERATIONS):
    if (uniform(0 + EPS, NUM - EPS) ** 2) <= NUM: # 0 < uniform(0 + EPS, NUM - EPS) < NUM
        count += 1
    
estimation = ITERATIONS / count
sqrt_num = sqrt(NUM)

print('Estimation of sqrt(', NUM, ') is   : ', estimation, sep = '')
print('Actual Value of sqrt(', NUM, ') is : ', sqrt_num, sep = '')
print('Error :', sqrt_num - estimation)