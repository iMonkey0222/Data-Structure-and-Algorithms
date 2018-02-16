# Design a Stack with getMin function
# Book <<Programmer interview guide>>

# 1 stack to store data: stackData
# 1 stack to store min: stackMin

class Mystack1(object):
	
	def __init__(self):
		self.stackData = Stack()
		self.stackMin = Stack()
	
	def push(self, newNum):
		self.stackData.push(newNum)

		if self.stackMin.isEmpty():
			self.stackMin.push(newNum)

		elif newNum < self.getMin():
			self.stackMin.push(newNum)

		else: # if newNum >= the min in stackMin, push min itself 
			newMin = self.getMin()
			self.stackMin.push(newMin)

	def pop(self):
		if self.stackMin.isEmpty():
			raise Exception("Your stack is empty!")
		self.stackData.pop() 			# remove it in data
		return self.stackMin.pop() 	# remove the minimum and show


	def getMin(self):
		if self.stackMin.isEmpty():
			raise Exception("Your stack is empty!")
		return self.stackMin.peek()



# Tips: Create a Stack in Python since python not have one like in Java
class Stack(object):
	# initialize stack as empty list
	def __init__(self):
		self.items = []

	def isEmpty(self):
		return self.items == []

	def peek(self):
		return self.items[len(self.items)-1]

	def size(self):
		return len(self.items)
		
	def push(self, item):
		self.items.append(item)

	def pop(self):
		return self.items.pop()

# Mystack Demo
# Return the minimum value 

if __name__ == '__main__':
	myStack = Mystack1()
	myStack.push(3)
	myStack.push(4)
	myStack.push(5)
	myStack.push(1)
	myStack.push(2)
	myStack.push(1)
	print ("The minimum value is %d") % (myStack.pop())