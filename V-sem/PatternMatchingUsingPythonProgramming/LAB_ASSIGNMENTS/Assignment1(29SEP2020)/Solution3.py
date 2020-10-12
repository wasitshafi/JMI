#Q3.Write a program illustrating the functioning (creation, inserting, deletion, max, min etc) of list, Tuples and Dictionary.

# List : List is a collection which is ordered and changeable. Allows duplicate members.
print("LIST :")
list1 = ['hello', 'world', 'The', 'quick', 'brown']
list1.append('fox') # added at end of the list
list1.append('jumps')
list1.insert(2,'from python...!') # added at specific index
print('List : ', list1)
list1.remove('The')      # deleting element by value
list2 = list1.copy()     # copy list1 elements to list2
del list1[1]             # deleting element by index
print('List1 : ', list1)
print('List2 : ', list2)
print('list2[2:5] : ', list1[2:5])

print('list1 min value : ', min(list1)) # lexicographically smallest
print('list1 max value : ', max(list1))



# Tuples : A tuple is a collection which is ordered and unchangeable. In Python tuples are written with round brackets.
print("TUPLES :")
tuple1 = ('zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine')
print('tupel1', tuple1)
print('tupel1[2:5]', tuple1[2:5])
print("'four' in tuple1", 'four' in tuple1 )
print("'ten' in tuple1'", 'ten' in tuple1 )
print('max(tuple1) : ' , max(tuple1))
print('min(tuple1) : ' , min(tuple1))
print('len(tuple1) : ', len(tuple1))



# Dictionary : Dictionary is a collection which is unordered, changeable and indexed. No duplicate members.
print("\n\nDICTIONARY :")
dict1 = {1 : 'One', 2 : 'Two', 3 : 'Three', 4 : 'Four', 5 : 'Five', 6 : 'Six', 7 : 'Seven'}

for key, value in dict1.items():   # printing Dictionary
  print(key, ':', value)

print('dict1[1] : ', dict1[1])     # return value of key '1', if key is not found then it raises an error
print("1 in dict1 :", 1 in dict1)  # return true if dict1 contains key 1, else return false
print("20 in dict1 :", 20 in dict1)# return true if dict1 contains key 1, else return false

dict1.pop(2)       # removes element 
dict1[1] = 'ONE'   # if dict1 contains key, then it overwrites value else it insert as a new element
dict1[50] = 'fifty'
print("\nAfter inserting/deleting dict1 : ")
for key, value in dict1.items():  # printing Dictionary
  print(key, ':', value)