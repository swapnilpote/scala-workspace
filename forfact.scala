/* object Factorial {
	def main(args: Array[String]){
		var result = fact(0)

		print("factorial = ")
		println(result)
	} */

	def fact(n: Int): Int = {
		var factorial = 1
		var c = 1

		if(n <= 0){
			return n
		} else {
			for(c <- 1 to n){
				factorial = factorial * c
			}
			return factorial
		}
	}

	var result = fact(1)
	println(result)
	/*}
}*/