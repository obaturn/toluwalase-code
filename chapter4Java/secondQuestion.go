package main

import "fmt"

func main() {
	var counter, largest, secondLargest int

	fmt.Println("enter the number you wish to ")
	fmt.Scan(&largest)
	for i := 0; i < 9; i++ {
		fmt.Println("enter the other number you wish to ")
		fmt.Scan(&counter)
		if counter > largest {
			secondLargest = largest
			largest = counter
		} else if counter > secondLargest {
			secondLargest = counter
		}

	}
	fmt.Println("the largest number is", largest)
	fmt.Println("the  second largest number is", secondLargest)

}
