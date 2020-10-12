# Q7. write a program to perform some data analytics using machine learning packages, i.e. pandas, preprocessing regression, classification, clustering, datasets, etc.
# Linear Regression
import pandas as pd
from sklearn import linear_model

FILE_NAME = 'homeprice.csv' 
df = pd.read_csv(FILE_NAME)

print('df : ', df)
model = linear_model.LinearRegression()
model.fit(df[['area']], df['price'])
print('model coef : ', model.coef_) 
print('model intercept : ', model.intercept_)
print('Predicting price for home with area 33000 sq.ft : ', model.predict([[33000]]))