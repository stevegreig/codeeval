import scala.io.Source

object Main {
	def main(args: Array[String]) = {
		for (line <- Source.fromFile(args(0)).getLines().filter(!_.isEmpty())) {
			println(line.toInt.toBinaryString.count(_ == '1'))
		}
	}
}
