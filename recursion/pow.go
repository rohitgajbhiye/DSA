package recursion

func myPow(x float64, n int) float64 {
    if n < 0 {
        return 1 / pow(x,-n)
    }
    return pow(x,n)
}

func pow(x float64, n int) float64 {
    if n == 0 {
        return 1 
    }
    result := pow(x,n/2)
    if n % 2 ==0 {
        return result * result
    }else {
        return result * result * x
    }
}