passes = 0
failures = 0
for student in range(15):
	result = int(input('enter result'))
	if result >= 45:
			passes = passes +1 
	else:
			failures = failures+1 
print('passesd:', passes)
print('failure:' , failures)