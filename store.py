counter = 0
total = 0
userBuy = "null"
	
howMany = 0
unit = 0
per_unit = []
piecies = []
per_unit_list = []

customer_name = input("what is the customer's name")
more_items = 'yes'
while more_items.lower() == 'yes' :

	user_buy = input("What did the user buy?: ")	
	per_unit.append(user_buy)

	how_many = float(input("how many piecies: "))
	piecies.append(how_many)		 

	unit = floot(input('how much per pieces?: '))
	per_unit_list.append(unit)

	more_items = input("add more items (Enter yes or no)").strip().lower()

	total = howMany * unit
	 	
	totalList.add(total)
 
	
cashier_name = input("what is  your name: (cashierName)")

discount = input("how much discount will he get")

amount_paid("how much did the customer give to you");
	
	

print("""
		SEMICOLON STORE

		MAIN BRANCH

		LOCATION: 312 HERBERT MARCULAY WAY SABO YABA, LAGOS.

		TEL: 03293828343
		
		DATE: 13\04\2024
		""")

print(prompt)

print(f"Cashier Name is : {cashierName}")

print(f"Customner Name is : {customerName}")
	
obaturn = """
	===============================================
		ITEMS	QTY	PRICE	TOTAL(NGN)
	-----------------------------------------------
	 """
sum = 0
for counter in range(len(per_unit)) :
	print(f"\t {per_unit[]} \t {piecies[]}
	 \t {per_unit_list[]} \t {total});  
	sum +=totalList.get(counter")
	
   	
discountPercentage = (sum * (discount)) / 100;
vat = (sum * 17.50 /100);
billTotal =(sum - discountPercentage ) + vat;
balance =(billTotal - amountPaid);
print("-----------------------------------------------------------------------\n")
print(f"the total sum is {sum}")
print(f"the discount Percentage  {discountPercentage}")
print(f" vat @ 17.50 %.2f%n {vat:.2f}")
print("=======================================================================\n")
print(f"\t\t\t\tbillTotal {billTotal:.2f})
print(f"\t\t\tthe  amount Paid {amountPaid:.2f})
print(f"the total balance is" {balance:.2f})
print("========================================================================\n")
print('thank you for your patronage')