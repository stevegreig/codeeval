import scala.io.Source

object Main {

	def main(args: Array[String]) = {

		for (line <- Source.fromFile(args(0)).getLines().filter(!_.isEmpty())) {
			val Array(words, rem) = line.split(", ")
			println(words.filterNot(rem.toSet))
		}
	}
}
