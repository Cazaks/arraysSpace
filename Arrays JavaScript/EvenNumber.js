		function evenNumber(arrays){
		let evenCount = 0;
		for(let index = 0; index < arrays.length; index++){
			if(arrays[index] % 2 === 0){
				evenCount++;
			}
		}
		
		let evenNumbers = new Array(evenCount);
		let count = 0;

		for(let index = 0; index < arrays.length; index++){
			if(arrays[index] % 2 === 0){
				evenNumbers[count] = arrays[index];
				count++;
			}
		}

		return evenNumbers;
	};
	
		let outPut = [4, 7, 8, 5, 6, 9, 4, 2, 1, 10, 3];
		let result = evenNumber(outPut)
		console.log("The even numbers in the arrays are:", result);