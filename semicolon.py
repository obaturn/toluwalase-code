from datetime import datetime

itemsList = []
piecesList = []
perUnitList = []
totalList = []

print("What is the customer's name?")
customerName = input()

moreItems = "yes"

while moreItems.lower() == "yes":
    print("What did the customer buy?")
    userBuy = input()

    print("How many pieces?")
    howMany = int(input())

    print("How much per unit?")
    unit = int(input())

    total = howMany * unit

    itemsList.append(userBuy)
    piecesList.append(howMany)
    perUnitList.append(unit)
    totalList.append(total)

    print("Add more items? (yes/no)")
    moreItems = input()

print("What is your name? (cashierName)")
cashierName = input()

print("How much discount will the customer get?")
discount = int(input())

print("How much did the customer give you?")
amountPaid = int(input())

currentDate = datetime.now().strftime("%Y-%m-%d %H:%M:%S")

print("\nCustomer's name:", customerName)
print("Cashier's name:", cashierName)
print("Date:", currentDate)
print("Items purchased:")

for i in range(len(itemsList)):
    print("- Item:", itemsList[i])
    print("  Quantity:", piecesList[i])
    print("  Price per unit:", perUnitList[i])
    print("  Total:", totalList[i])

totalAmount = sum(totalList)
discountAmount = totalAmount * (discount / 100)
finalAmount = totalAmount - discountAmount
change = amountPaid - finalAmount

print("\nTotal amount before discount:", totalAmount)
print("Discount amount:", discountAmount)
print("Final amount to be paid:", finalAmount)
print("Amount paid by customer:", amountPaid)
print("Change to be given:", change)
