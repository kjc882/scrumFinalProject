struct Stack<Element> {
	fileprivate var array: [Element] = []
	
	mutating func push(_ element: Element) {
		array.append(element)
	}
	
	mutating func pop() -> Element? {
		return array.popLast()
	}
	
	func peek() -> Element? {
		return array.last
	}
}

extension Stack: CustomStringConvertible {
	var description: String {
		let topDivider = "---Stack---\n"
		let bottomDivider = "\n-----------\n"
		
		let stackElements = array.map { "\($0)" }.reversed().joined(separator: "\n")
		return topDivider + stackElements + bottomDivider
	}
}

var rwBookStack = Stack<String>()

print("Each of the entries below were 'pushed' onto the stack in reverse order in the code\n")

rwBookStack.push("Last item in the stack")
rwBookStack.push("3rd item in the stack")
rwBookStack.push("2nd item in the stack")
rwBookStack.push("First item in the stack")

print(rwBookStack)