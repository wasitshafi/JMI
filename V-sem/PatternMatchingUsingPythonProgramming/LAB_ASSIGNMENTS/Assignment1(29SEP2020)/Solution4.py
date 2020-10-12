# Q4. write a program using functions and procedures.

def func1(x, y): # function to return minimum 
  if x < y:
    return x
  else:
    return y
  
def proc1(n): # procedure to print 0 - n
  for i in range(n+1):
    print(i)
    
minimum = func1(10, 5)
print('minimum element : ', minimum)
proc1(minimum) 