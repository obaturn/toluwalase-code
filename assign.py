<<<<<<< HEAD
#positive_count=0
#negative_count=0
#zero_count=0


continue = "yes"
while continue == "yes":
	try:
		number = int(input("Please enter a number: "))
		if number > 0:
			print("positive number")
		elif number < 0:
			print("Negative number")
		else:
			print("Zero number")
		continue = input("Would you like you like to try again,\nEnter yes or no: ")	
	
	except:
		print("Something went wrong input input another number")
		continue = input("Would you like to continue: \n Enter yes or no: ")

		





































=======
#positive_count=0
#negative_count=0
#zero_count=0


continue = "yes"
while continue == "yes":
	try:
		number = int(input("Please enter a number: "))
		if number > 0:
			print("positive number")
		elif number < 0:
			print("Negative number")
		else:
			print("Zero number")
		continue = input("Would you like you like to try again,\nEnter yes or no: ")	
	
	except:
		print("Something went wrong input input another number")
		continue = input("Would you like to continue: \n Enter yes or no: ")

		





































>>>>>>> 878da3792fa3f45869d527fb1cbb6b45ac1f8a10
