package main

import "fmt"

var totalGasUsed float32 = 1
var totalMilesUsed float32 = 1

func main() {

	var milesPerDrive, driverGas int
	for i := 0; i < 10; i++ {
		fmt.Println("enter the miles per driven")
		fmt.Scanln(&milesPerDrive)

		fmt.Println("enter the gallon used")
		fmt.Scanln(&driverGas)

		totalMilesUsed = float32(milesPerDrive) / float32(driverGas)
		totalGasUsed += totalMilesUsed

	}
	fmt.Println("totalMilesUsed:", totalMilesUsed)
	fmt.Println("totalGasUsed:", totalGasUsed)
}
