import csv
import pandas as pd
# Q6. Write a program for creation, insertion, deletion operation in files, text files, csv files, excel files, etc.

def write_file(file_name): 
  file =  open(file_name, 'w', newline='')
  data_list = [["EID", "Name", "Salary"],
            [101, "Rahul", "20,000"],
            [102, "Akashay", "35,000"],
            [103, "Priya", "10,000"],
            [104, "Rashmi", "75,000"],
            [105, "Sunjay", "36,000"],
            [106, "Gurmeet", "15,000"]]

  writer = csv.writer(file, delimiter=',')
  writer.writerows(data_list)
  file.close()
  
def read_file(file_name):
  with open(file_name, 'r') as file:
    reader = csv.reader(file,'EID')
    for row in reader:
        print(row)
  file.close()
  
def delete_file(file_name):
  data = pd.read_csv(file_name, index_col=0)
  data.drop([103], axis = 0, inplace = True)
  print(data)
  
file_name = 'data1.csv'
# Writing file
#write_file(file_name)

# Reading file
#read_file(file_name)

# Deleting
delete_file(file_name)
#read_file(file_name)
