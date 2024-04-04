num1 = float(input("enter your first floating number"))
num2 = float(input("enter your second floating number"))
num3 = float(input("enter your third floating number"))

if num1 < num2 and num1 < num3 and num2 < num3:
	print( num1,num2,num3) 
if num2 < num1 and num2 < num3 and num3 < num1:
	print( num2, num3,num1)
if num3 < num2 and num3 < num1 and num1 < num2:
	print( num3, num2 ,num1)

	