# Q6. Write a program for creation, insertion, deletion operation in files, text files, csv files, excel files, etc.

def read_file(file):
  for line in file.readlines():
    print(line.rstrip('\n'))

def write_file(file):
  n = int(input('Enter no. of line you want to have in file : '))

  for i in range(n):
    file.write(input())
    if i != n-1 :
      file.write("\n")

def delete_line(file_name):
  file = open(file_name, 'r')
  lines = file.readlines()
  print(lines)
  file.close()
  n = int(input('Enter line no you want to delete (MAX : ' + str(len(lines)) + ':)'))
  if n > len(lines):
    print('Invalid Line no.')
    return
  
  file = open(file_name, 'w') 
  for i in range(len(lines)):
    if i+1 != n:
      if i + 2 == n and i + 2 == len(lines): # if we have to delete the last line
        file.write(lines[i].rstrip('\n'))
      else:
        file.write(lines[i])
  file.close()
  
### Main ###
# Creating new text file
file_name = 'file1.txt'
file = open(file_name, 'w') # opening a file in write mode

# Writing file
write_file(file)
file.close()

file = open(file_name, 'r+') # opening a file in read & write mode
# Read file
#print("File  contents are as : ", file.read())  # Method 1
# Method 2
print("\n\nFile  contents are as : ")
read_file(file)
file.close()

# Deleting a specific line from text file
#delete_line(file_name)
delete_line('file1.txt')
print("\n\nFile  contents are After Delete operation as : ")
file = open(file_name, 'r+') # opening a file in read & write mode
read_file(file)
file.close()
