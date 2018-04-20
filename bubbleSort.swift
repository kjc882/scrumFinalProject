var array = [5,3,4,6,8,2,9,1,7,10,11]

var sortedArray = Array(array)

var sortedAboveIndex = array.count // Assume all values are not in order

var lastSwapIndex = 0

//repeat {
	for i in 1 ..< sortedAboveIndex {
		if ((sortedArray[i - 1] ) > (sortedArray[i] )) {
			swap(&sortedArray[i], &sortedArray[i - 1])
			lastSwapIndex = i
		}
	}
	
sortedAboveIndex = lastSwapIndex

//} while (sortedAboveIndex != 0)

// [5, 3, 4, 6, 8, 2, 9, 1, 7, 10, 11]
print(array)

// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]

print(sortedArray)