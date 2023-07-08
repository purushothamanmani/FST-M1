import pandas
from pandas import ExcelWriter

dataframe = pandas.read_excel("sample.xlsx")

print(dataframe)


print("==========================================================")

print("Number of rows and column: ", dataframe.shape)
print("===================================")
print("Emails: \n=========================\n", dataframe['Email'])
print("===================================")
print("Sorted data: \n==========================================================\n", dataframe.sort_values("FirstName"))
