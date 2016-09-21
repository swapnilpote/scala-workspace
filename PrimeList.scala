object PrimeList {
	def main(args: Array[String]) {
		var i = 0

		def printPrimes(){
			val primeList = List(1,2,3,5,7,11)

			for(i <- primeList){
				//code for break keyword
				if(i == 11){
					return
				}

				//code for continue keyword
				if(i != 1){
					println(i)
				}
			}
		}

		printPrimes
	}
}