def fibonacci(num):
    if num <= 1:
        return num
    else:
        return fibonacci(num - 1) + fibonacci(num - 2)


value = int(input("Enter a number: "))
if value <= 0:
    print("Please enter positive value")
else:
    print("Fibonacci's series: ")
    for i in range(value):
        print(fibonacci(i))
