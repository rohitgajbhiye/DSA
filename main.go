package main

import (
	"DSA/recursion"
)

func main() {
	arr := []int{2,1,5,3,8,6}
	recursion.MergeSort(arr,0,len(arr)-1)
}