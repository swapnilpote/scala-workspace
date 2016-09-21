import scala.collection.mutable.ArrayBuffer

object ArrayBuffer {
	def main(args: Array[String]) {

		//If u are using arrays u have to mention the size of the array. So thats y size of array is fixed as soon as u created it.
		val favNum = new Array[Int](20)

		val friends = Array("bob", "tom")

		friends(0) = "sue"
		println("Best friend " + friends(0))


		//In ArrayBuffer u dont have to mention the size the of it & u can feed as much data u want as time required
		val friends2 = ArrayBuffer[String]()

		friends2.insert(0, "Phil")
		friends2 += "Mark"
		friends2 ++= Array("Susy", "Paul")
		friends2.insert(1, "Mike", "Sally", "Sam", "Mary", "Sue")
		friends2.remove(1,2)

		val friend: String = " "
		for(friend <- friends2)
			println(friend)


		//How to fill the favNum array
		for(j <- 0 to (favNum.length - 1)){
			favNum(j) = j
			println(favNum(j))
		}

		val favNumTimes2 = for(num <- favNum) yield 2 * num
		favNumTimes2.foreach(println)


		val favNumDiv4 = for(num <- favNum if num % 4 == 0) yield num
		favNumDiv4.foreach(println)


		val multTable = Array.ofDim[Int](10,10)

		for(i <- 0 to 9){
			for(j <- 0 to 9){
				multTable(i)(j) = i * j
			}
		}

		for(i <- 0 to 9){
			for(j <- 0 to 9){
				printf("%d : %d = %d\n", i, j, multTable(i)(j))
			}
		}
		
		println("Sum : " + favNum.sum)
		println("Min : " + favNum.min)
		println("Max : " + favNum.max)
	
		// for desending we use >. If u want to sort in assending order use < this sign.
		val sortedNums = favNum.sortWith(_>_)

		println(sortedNums.deep.mkString(", "))
	}
}