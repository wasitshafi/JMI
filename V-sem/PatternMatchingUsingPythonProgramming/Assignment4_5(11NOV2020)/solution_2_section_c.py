import math

def area(x = None, y = None, z = None):
  if x != None and y != None and z != None:
    s = (x + y + z) / 2
    return math.sqrt(s * (s - x) * (s - y) * (s - z))
  elif x != None and y != None:
    return x * y
  elif x != None:
    return math.pi * x**2

print("Area of circle with radius 5 is : ", area(5))
print("Area of rectangle with length 5 & width 4 is : ", area(5, 4))
print("Area of triangle with sides 2, 3 & 4 is : ", area(2, 3 ,4))
