object ForThree {
	def main(args: Array[String]) {
		var i = 0

		val aList = List(1,2,3,4,5)

		for(i <- aList)
			println("Item in the list " + i)
	}
}