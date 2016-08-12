import scala.io.Source
import collection.mutable.ArrayBuffer

object Main {

	def main(args: Array[String]) = {

		for (line <- Source.fromFile(args(0)).getLines().filter(!_.isEmpty())) {
			val list = line.split(" ")
			val mth = list(list.length - 1).toInt
			val position = list.length - mth - 1
			if (position >= 0)
				println(list(list.length - mth - 1))
		}
	}
}
