def calculate_sum(num):
    sum = 0
    for number in num:
        sum += number
    return sum


numList = [10, 20, 63, 37]
result = calculate_sum(numList)
print("Sum of list value: " + str(result))
