let numbers = [3, 8, 2, 4];

		let newNumbers = new Array(numbers.length + 1);

		for(let count = 0; count < numbers.length; count++){
		newNumbers[count] = numbers[count];
		}

		newNumbers[newNumbers.length - 1] = 1;

		console.log(newNumbers);
