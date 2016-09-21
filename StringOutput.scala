object StringOutput {
	def main(args: Array[String]) {
		var randSent = "I saw a dragon fly by"

		println("3rd index : " + randSent(3))

		println("String length : " + randSent.length)

		println(randSent.concat(" and explode"))

		println("Are string equals " + "I saw a dragon".equals(randSent))

		println("dragon starts at index " + randSent.indexOf("dragon"))

		val randSentArray = randSent.toArray

		for(v <- randSentArray)
			println(v)
	}
}