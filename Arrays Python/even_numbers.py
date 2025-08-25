def even_numbers(numbers):
	
	even_count = 0
	for index in range(len(numbers)):
		if numbers[index] % 2 == 0:
			even_count+=1

	even_numbers = [0] * even_count
	index_counting = 0

	for count in range(len(numbers)):
		if numbers[count] % 2 == 0:
			even_numbers[index_counting] = numbers[count]
			index_counting+=1

	return even_numbers
even = [2, 7, 3, 8, 9, 6, 5, 4]
reult = even_numbers(even)
print(reult)