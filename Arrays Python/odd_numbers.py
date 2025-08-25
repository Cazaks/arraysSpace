def odd_numbers(values):
	odd_num_count = 0

	for index in range(len(values)):
		if values[index] % 2 != 0:
			odd_num_count+=1

	oddnumbers = [0] * odd_num_count
	count = 0
	
	for index in range(len(values)):
		if values[index] % 2 != 0:
			oddnumbers[count] = values[index]
			count+=1
	
	return oddnumbers

odd_input = [6, 3, 7, 8, 5, 9, 1, 4]
result = odd_numbers(odd_input)
print(result)