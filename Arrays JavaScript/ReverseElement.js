let numbers = [9, 8, 7, 6, 5, 4, 3, 2, 1, 0];
let reverse = new Array (numbers.length);
		
for(let index = 0; index < numbers.length; index++){
reverse[index] = numbers[numbers.length - 1 - index];	
	}

console.log(reverse);		
