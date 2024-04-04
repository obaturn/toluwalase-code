import math

principalAmount = int(input("Enter the principal amount:  "))

Annualrate = int(input("Enter the annual intrest rate:  "))

numberofYears = int(input("Enter the duration in year:  "))
MONTHS_YEAR = 12
NoOfYear = MONTHS _YEAR * numberofYears

rate = Annualrate / 100

MonthlyRate = rate / MONTH_YEAR 

monthbase = 1 + MonthlyRate

base = monthbase ** NoOfYear

num1 = principalAmount * MonthlyRate
num2 = base - 1

Monthlypayment = num1 * base / num2

print(f'{Monthlypayment:.2f}')