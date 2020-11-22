file_name = 'test.txt'
file = open(file_name, 'r') # Opening a file
print(file.readlines())
file.close()                # Closing a file
