number1 = int(input("enter the first number:")),
number2 = int(input("enter the second number:")),
number3 = int(input("enter the third number:")), 
sum = number1 + number2 + number3
average = sum /3
product = number1 * number2 * number3
if number1 > number2 and number1 > number3:
	largest = number1
if number2 > number1 and number2 > number3:
	largest = number2
if number3 > number1 and number3 > number2:
	largest = number3
if number1 < number2 and number1 < number3:
	smallest = number1
if number2 < number3 and number2 < number1:
	smallest = number2
if number3 < number2 and number3 < number1:
	smallest = number3
	
print("the largest is" , + largest),
print("the smallest is" + smallest),