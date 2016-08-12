import scala.io.Source
import scala.collection.mutable.ListBuffer

object Main {

	def main(args: Array[String]) = {
		val sourceFile = Source.fromFile(args(0)).getLines().filter(!_.isEmpty())
		val numLineToDisplay = sourceFile.next.toInt
		val buffer = ListBuffer.empty[String]
		for (line <- sourceFile)
			buffer += line
		for (i <- 0 to numLineToDisplay - 1)
			println(buffer.sortWith(_.length>_.length)(i))
	}
}
