object Function1 {
	def main(args: Array[String]) {

		/*
			def funcName(param1: dataType, param2: dataType): returnType = {
				function Body
				return valueToReturn
			}
		*/

		def getSum(num1: Int = 1, num2: Int = 1) : Int = {
			//use can use return if u want but if u remove return keyword it will still return result
			return num1 + num2
		}

		println("5 + 4 = " + getSum(5,4))
	}
}