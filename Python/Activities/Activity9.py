numList1 = [4, 35, 80, 21, 10, 13]
numList2 = [11, 14, 24, 15, 17, 60]

result = []

print("List1 Values: ", numList1)
print("List2 Values: ", numList2)
for num in numList1:
    if num % 2 != 0:
        result.append(num)
for num in numList2:
    if num % 2 == 0:
        result.append(num)
print("Final result value: ", result)

