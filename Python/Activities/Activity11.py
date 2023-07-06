fruit_shop = {"apple": 200, "banana": 100, "custard apple": 250, "red banana": 300}
fruit_Name = input("Enter fruit name: ").lower()

if fruit_Name in fruit_shop:
    print(fruit_Name, "Fruit is available in fruit shop")
else:
    print(fruit_Name, "Fruit is not available in fruit shop")
