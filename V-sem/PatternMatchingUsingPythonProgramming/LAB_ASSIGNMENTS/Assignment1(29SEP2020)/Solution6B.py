import pandas as pd
# Q6. Write a program for creation, insertion, deletion operation in files, text files, csv files, excel files, etc.

def write_file(file_name): 
  data = {
    'EID'   : [101, 102, 103, 104, 105, 106],
    'Name'  : ['Rahul', 'Akashay', 'Priya' ,'Rashmi', 'Sunjay', 'Gurmeet'],
    'Salary': [20000, 35000, 10000, 75000, 36000, 15000]
  }
  df = pd.DataFrame(data)
  df.to_csv(file_name, index=False)

def read_file(file_name):
  df = pd.read_csv(file_name)
  print(df)
  
def delete_file(file_name):
  data = pd.read_csv(file_name)
  data.drop([2], inplace = True) # deleting row
  data.drop([1], inplace = True) # deleting row
  data.drop(['Salary'], axis=1, inplace = True) # deleting col  
  data.to_csv(file_name, index = False)



file_name = 'data1.csv'
# Writing file
write_file(file_name)

# Reading file
print ("\n\nFile Before Delete operation")
read_file(file_name)

# Deleting
delete_file(file_name)
print ("\n\nFile After Delete operation")
read_file(file_name)