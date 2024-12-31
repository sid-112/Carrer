import pandas as pd
import numpy as np
from sklearn import datasets, linear_model
import matplotlib.pyplot as plt


df = pd.read_csv(r'C:\Edu\coding\python\Scikit Learn\Book1.csv')
print(df.head())

X = df.marks  # Assuming "marks" is the feature variable
y = df.iq  # Assuming "iq" is the target variable

# Split data into training and testing sets (assuming rows represent data points)
X_train = X[:-5]  # No need to reshape for Series
X_test = X[-5:]  # No need to reshape for Series
y_train = y[:-5]
y_test = y[-5:]

model = linear_model.LinearRegression()

model.fit(X_train.to_numpy().reshape(-1, 1), y_train)  # Convert X_train to numpy array
y_predict = model.predict(X_test.to_numpy().reshape(-1, 1))  # Convert X_test to numpy array

plt.scatter(X_test, y_test)
plt.plot(X_test, y_predict)

plt.xlabel('marks')
plt.ylabel('iq')
plt.show()