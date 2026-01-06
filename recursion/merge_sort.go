package recursion

func merge(arr []int, low, mid,high int){
	temp := make([]int,len(arr))
	for i:=low;i<=high;i++{
		temp[i] = arr[i]
	}
	n1 := low 
	n2 := mid+1
	i:=low

	for n1 <= mid && n2 <= high {
		if temp[n1] < temp[n2]{
			arr[i] = temp[n1]
			n1++
		}else{
			arr[i] = temp[n2]
			n2++
		}
		i++
	}
	if n1 <= mid {
		arr[i] = temp[n1]
		n1++
		i++
	}
	if n2 <= high {
		arr[i] = temp[n2]
		n2++
		i++
	}
}

func MergeSort(arr []int,low,high int ){
	if low >= high {
		return 
	}
	mid := low+(high-low) /2 
	MergeSort(arr,low,mid)
	MergeSort(arr,mid+1,high)
	merge(arr,low,mid,high)
}