def calculate_sum(n):
    if n:
        return n + calculate_sum(n - 1)
    else:
        return 0


result = calculate_sum(6)
print(result)
