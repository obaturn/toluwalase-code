total =0
for number in range(1 , 20001):
	if number%10 ==0:
		 total += number
print(f'the multiple of this is {total:,}')