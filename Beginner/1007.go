package main

import "fmt"

func main() {
	var n1, n2, n3, n4 int

	fmt.Scan(&n1, &n2, &n3, &n4)
	fmt.Printf("DIFERENCA = %d\n", ((n1 * n2) - (n3 * n4)))
}
