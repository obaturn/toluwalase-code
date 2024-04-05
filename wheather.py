""" this code determines wheather condition"""
temperature = float(input("enter the temperature"))
if temperature >= 70 :
	print("the wheather is extremely hot")
elif temperature > 40 and temperature <= 70 :
	print("the wheather is hot")
elif temperature > 20 and temperature <= 40 :
	print("the wheather is average")
elif temperature > 1 and temperature <= 20 :
	print("the wheather is cold")
	print("dear sir stay at home with your wife") 
else :
	print("the wheather is extremely cold , stay home")