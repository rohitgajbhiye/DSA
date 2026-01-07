package recursion

func myAtoi(s string) int {
	low := 0
	high := len(s)
	sign := 1
	digit := 0

	// 1. skip the leading spaces
	for low < high && s[low] == ' ' {
		low++
	}

	// 2. handle signed integers

	for low < high && (s[low] == '-' || s[low] == '+') {
		if s[low] == '-' {
			sign = -1
		}
		low++
	}

	// 3. only consider digit, break if other character found.
	for low < high && s[low] >= '0' && s[low] <= '9' {
		chr := int(s[low] - '0')
		digit = digit*10 + chr
		low++
	}
	return sign * digit

}