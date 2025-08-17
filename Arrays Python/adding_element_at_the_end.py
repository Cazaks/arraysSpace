values = [7, 11, 4, 9]
new_values = [0] * (len(values) + 1)

for index in range (len(values)):
	new_values[index] = values[index]

new_values[len(new_values) - 1] = 6

print(new_values)
