# Q2. Write a programs to illustrate decision making statements i.e. displaying division of students based on their marks, prime number, leap year, searcing, arranging values.
def get_division(p):
   if p >= 75:
     return "Distiction"
   elif p >=60:
     return "1 Division"
   elif p >=50:
     return "2 Division"
   elif p >=40:
     return "3 Division"
   else:
     return "4 Division(Fail)"

def isPrime(n):
  if n < 2:
    return False;
  else:
    i = 2
    while i * i <= n:
      if n % i == 0:
        return False
      i += 1
    return True
  
def isLeapYear(year):
  return True if ((year % 4 == 0 and year % 100 != 0) or (year % 400 == 0)) else False

def searchKey(arr, key):
  length = len(arr)
  for i in range(length):
    if arr[i] == key:
      return i
  return -1;

def mySort(arr): # Using Bubble Sort Algorithm
  n = len(arr)
  for i in range(n - 1):
    for j in range(n - i - 1):
      if arr[j] > arr[j + 1]:
        temp = arr[j]
        arr[j] = arr[j + 1]
        arr[j +1] = temp
# Division Of Marks
print("STUDENT MARKS DIVISION")
marksObtained = int(input('Enter marks obtained : '))
maxMarks = int(input('Enter max. marks : '));
percentage = (marksObtained / maxMarks) * 100
print('Division : ', get_division(percentage))

# Prime Numbers
print("\nPRIME NUMBERS")
n = int(input('Enter Value of n...'))
if isPrime(n):
  print(n , 'is Prime Number')
else:
  print(n, 'is not a Prime Number')

# Leap Year
print("\nLEAP YEAR")
year = int(input('Enter a Year...'))
if isLeapYear(year):
  print(year , 'is Leap Year')
else:
  print(year, 'is not a Leap Year')

# Searching
print("\nSEARCING ELEMENT")
n = int(input('Enter no. elements...'))
arr = [None] * n
for i in range(n):
  arr[i] = int(input('arr[' + str(i) +']:'))
key = int(input('Enter key Element to search...'))
index = searchKey(arr, key)
if index == -1:
  print('Key Element(', key, ') not found in array.')
else:
  print('Key Element(', key, ') found in at index ', index, 'array.')

# Arranging
print("\nARRANGING ELEMENTS")
print("Array before sorting : ", arr)
mySort(arr) # soring in non-decreasing order
print("Array after sorting  : ", arr)