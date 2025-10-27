table = [
[1, 2, 3, 4],
[5, 6, 7, 8],
[9, 10, 11, 12]
]

# Pick an element
# print(table[0][0]) # 1
# Pick an entire row
# print(table[0]) # [1, 2, 3, 4]

for row in table:
    for value in row:
        print(value, end=" ")
    print()

