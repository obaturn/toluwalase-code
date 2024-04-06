
largest = o
smallest = 0
counter = 0
while num != -1:
num = int(input("enter how many numbers you wish to run this program"))	
		if num > largest:
			largest = num
		if num < smallest:
			smallest = num
		counter = counter+1
num = int(input("enter how many numbers you wish to run this program"))
print(largest)
print(smallest)