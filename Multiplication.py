userInput = int(input("enter the multiplication number:"))
for i in range(1 , userInput , +1):
	for j in range(1, i, +1):
		square= i * j,
		print(square , end=" ")
	print(' ')