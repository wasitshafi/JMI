import math
from multipledispatch import dispatch

@dispatch(int)
def area(radius):
  return math.pi * radius ** 2

@dispatch(int, int)
def area(length, width):
  return length * width

@dispatch(int, int, int)
def area(s1, s2, s3):
  s = (s1 + s2 + s3) / 2
  return math.sqrt(s * (s - s1) * (s - s2) * (s - s3))

print("Area of circle with radius 5 is : ", area(5))
print("Area of rectangle with length 5 & width 4 is : ", area(5, 4))
print("Area of triangle with sides 2, 3 & 4 is : ", area(2, 3 ,4))
