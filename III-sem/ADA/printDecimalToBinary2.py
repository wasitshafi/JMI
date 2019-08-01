num = int(input("Enter positive integer (n >= 0) : "))
numCopy = num
rem = 0
binary = 0
base = 1

totalAdditions = 0
totalMultiplications = 0
totalDivisions = 0
totalModulus = 0

while(num):
 rem = num % 2
 binary = binary + rem * base
 base = base * 10  
 num = num // 2    # integer division
 
 totalAdditions += 1
 totalMultiplications += 2
 totalDivisions += 1
 totalModulus += 1

print("\nBinary equavillent of ", numCopy, " is : ", binary)
print("")
print("Total Multiplication Operations : ", totalMultiplications)
print("Total Additions Operations : ", totalAdditions)
print("Total Divisions Operations : ", totalDivisions)
print("Total Modulus Operations : ", totalModulus)

