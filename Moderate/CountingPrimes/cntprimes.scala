import scala.io.Source

object Main {

	def isPrime(i: Int) = {
		if (i<=1) false 
		else if (i==2) true 
		else !(2 to (i-1)).exists(x => i % x == 0)
	}

	def main(args: Array[String]) = {
		for (line <- Source.fromFile(args(0)).getLines.filter(!_.isEmpty)) {
			val Array(s,f) = line.split(",").map(_.toInt)
			var count = 0
			for (n <- s to f) {
				if (isPrime(n))
					count += 1
			}
			println(count)
		}
	}
}