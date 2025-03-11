import pandas as pd

X = [2, 3, 4, 5]
y = [8, 3, 7, 8]

df = pd.DataFrame(X, y)

i = df.iloc[2]

print(i)