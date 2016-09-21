import scala.collection.mutable.ArrayBuffer

object Map {
	def main(args: Array[String]) {

		//The value of this map is immutable i.e. can not be changes after its been assign
		val employees = Map("Manager" -> "Bob Smith", "Secretary" -> "Sue Brown")

		if(employees.contains("Manager"))
			printf("Manager : %s\n", employees("Manager"))


		//If want mutable map then u have to create map according to this method. 
		val customers = collection.mutable.Map(100 -> "Paul Smith", 101 -> "Sally Smith")

		printf("Cust 1 : %s\n", customers(100))

		customers(100) = "Tom Marks"
		customers(102) = "Megan Swift"

		for((k,v) <- customers)
			printf("%d : %s\n", k,v)
	}
}