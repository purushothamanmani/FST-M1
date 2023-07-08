import pandas

data = {
    "Usernames": ["Admin", "Ramu", "Venki", "Anbu"],
    "Passwords": ["Password", "Charun*@#765", "Somu12($%", "aNb@#%98"]
}

dataFrame = pandas.DataFrame(data)
print(dataFrame)
dataFrame.to_csv("Activit17.csv", index=False)
