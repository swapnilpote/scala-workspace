object IfElse {
	def main(args: Array[String]) {
		var age = 7

		val canVote = if(age >= 18) "Yes" else "No"

		println(canVote)


		if((age >= 5) && (age <= 6)){
			println("go to nursery")
		}else if((age > 6) || (age <= 7)){
			println("Go to grade 1")
		}else{
			println("You are grown up kid.")
		}
	}
}