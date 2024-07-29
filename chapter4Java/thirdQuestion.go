package main

import "fmt"

func main() {
	for {
		fmt.Println("enter either 1 or 2")
		var input string
		fmt.Scan(&input)
		if input == "1" || input == "2" {
			break
		}
	}
	fmt.Println("you have enter 1 or 2")
}
