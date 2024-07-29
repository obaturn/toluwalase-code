package main

import "fmt"

func main() {
	var counter, largest int

	fmt.Println("Enter a number:")
	fmt.Scan(&largest)

	for i := 1; i < 10; i++ {
		fmt.Println("Enter another number:")
		fmt.Scan(&counter)
		if counter > largest {
			largest = counter
		}
	}

	fmt.Println("Largest number entered:", largest)
}
