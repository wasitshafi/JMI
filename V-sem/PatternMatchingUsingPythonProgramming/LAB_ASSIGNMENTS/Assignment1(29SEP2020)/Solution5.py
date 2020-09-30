# Q5. Write a program to implement OOPs concepts in python i.e. inheritance etc.

class Person:
  def __init__(self, name, age, address): # constructor
    self.name = name
    self.age = age
    self.address = address
  
  def set_data(self, name, age, address):
    self.name = name
    self.age = age
    self.address = address
 
  def get_data(self):
    print('Name : ', self.name)
    print('Age  : ', self.age)
    print('Address : ', self.address)
  
  def get_name(self):
    return self.name
  
  def get_age(self):
    return self.age
  
  def get_address(self):
    return self.address
  
class Student(Person):
  def __init__(self, name, age, address, rollno, course, marksObtained, maximumMarks): # constructor
    super().__init__(name, age, address)
    self.rollno = rollno
    self.course = course
    self.marksObtained = marksObtained
    self.maximumMarks = maximumMarks
  
  def set_data(self, rollno, course, marksObtained, maximumMarks):
    self.rollno = rollno
    self.course = course
    self.marksObtained = marksObtained
    self.maximumMarks = maximumMarks
 
  def get_data(self):
    print('Name : ', super().get_name())
    print('Age  : ', super().get_age())
    print('Address : ', super().get_address()) 
    print('Rollno : ', self.rollno)
    print('Course : ', self.course)
    print('Marks Obtained : ', self.marksObtained)
    print('Maximum Marks : ', self.maximumMarks)
    print('Percentage : ', '{:.2f}'.format(self.get_percentage()), '%')
    
  def get_rollno(self):
    return self.rollno
  
  def get_course(self):
    return self.course
  
  def get_marksObtained(self):
    return self.marksObtained

  def maximumMarks(self):
    return self.maximumMarks
  
  def get_percentage(self):
    return marksObtained / maximumMarks * 100

print('PERSON DETAILS : ')
name = input('Enter Name of Person : ')
age = int(input('Enter Age of ' + name + ' : '))
address = input('Enter Address of ' + name +' : ')
p1 = Person(name, age, address) # Object of Person Class

print('\nSTUDENT DETAILS : ')
name = input('Enter Name of Student: ')
age = int(input('Enter Age of Student : '))
address = input('Enter Address of Student: ')
rollno = input('Enter Rollno of Student : ')
course = input('Enter Course of Student : ')
marksObtained = float(input('Enter Marks Obtained of Student : '))
maximumMarks = float(input('Enter Maximum Marks of Student  : '))
s1 = Student(name, age, address, rollno, course, marksObtained, maximumMarks)

# Printing Person Details
print("\n\nPerson Details are as :")
p1.get_data();

#Printing Student Detatils
print("\n\nStudent Details are as :")
s1.get_data();