object Factorial {
	def main(args: Array[String]){
		var fact = 1
		var c = 1
		var n = 0

		if(n < 0){
			println("fact is 1")
		} else {
			for(c <- 1 to n){
				fact = fact * c
			}
			println(fact)
		}
	}
}