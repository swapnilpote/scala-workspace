import scala.io.StdIn._
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object InputInt {
	def main(args: Array[String]) {
		var numberGuess = 0

		do{
			print("Guess a number : ")
			numberGuess = readLine.toInt
		}while(numberGuess != 15)

		printf("You guessed the serect number %d\n", numberGuess)
	}
}