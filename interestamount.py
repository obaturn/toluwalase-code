investment = 0
years = 0
total = 0
investment = int(input('enter the amount you wish to invest'))
rate = 20/100
years = int(input('enter how many years you wish to to invest'))
amount_interest = investment * rate
counter = 1
for number in range (years):
	amount_interest = investment * rate
	top_amount = amount_interest + investment
	investment = top_amount
	print(f'the years of the customer is {counter} {investment:.2f}')
	counter +=1

 