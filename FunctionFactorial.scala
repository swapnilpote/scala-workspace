object FunctionFactorial {
	def main(args: Array[String]) {

		def factorial(num: BigInt): BigInt = {
			if(num == 1)
				1
			else
				num * factorial(num - 1)
		}

		println("Factorial of 4 : " + factorial(4))

	}
}