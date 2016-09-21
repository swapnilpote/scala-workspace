object ForTwo {
	def main(args: Array[String]) {
		var randLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

		for(i <- 0 until randLetters.length)
			println(randLetters(i))
	}
}