import scala.io.Source

object Main {
	def main(args: Array[String]) = {
		for (line <- Source.fromFile(args(0)).getLines().filter(!_.isEmpty())) {
			val Array(size,nums) = line.split(";")
			println(nums.split(",").map(_.toInt).groupBy(identity).mapValues(_.size).find(_._2 == 2).get._1)
		}
	}
}

