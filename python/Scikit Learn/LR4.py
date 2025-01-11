import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
from sklearn.linear_model import LinearRegression
from sklearn import linear_model

price =np.array([23, 45, 78, 33, 12, 14]).reshape(-1, 1)
area = np.array([1, 6, 7, 4, 8, 2]).reshape(-1, 1)

X_train = price[:-4]
X_test = price[-4:]
y_train = area[:-4]
y_test = area[-4:]


model = linear_model.LinearRegression()

model.fit(X_train, y_train)
X_predict = model.predict(X_test)

print(model.coef_)
print(model.intercept_)

plt.scatter(X_test, y_test)
plt.plot(X_test, X_predict)
plt.show()