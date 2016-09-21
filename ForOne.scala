object ForOne {
	def main(args: Array[String]) {
		//var i = 0

		for(i <- 1 to 10)
			println(i)

		for(i <- 1 to 10 by -1)
			println(i)

		(1 to 3).foreach(i => print(i * 2 + "," ))

		println("Scala Rocks!")
	}
}