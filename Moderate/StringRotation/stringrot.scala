import scala.io.Source

object Main {
	def compare(leftStr:String, rightStr:String): Boolean = {
		def compareRec(left: List[Char], right: List[Char], idx: Int): Boolean = {
			if (left == right) true
			else if (idx > (leftStr.length -1)) false
			else compareRec(left, right.tail ++ Some(right.head), idx + 1)
		}
		compareRec(leftStr.toList,rightStr.toList,1)
	}

	def main(args: Array[String]) = {
		for (line <- Source.fromFile(args(0)).getLines().filter(!_.isEmpty())) {
			val Array(leftStr,rightStr) = line.split(",")
			println(if (compare(leftStr,rightStr)) "True" else "False")
		}
	}
}
