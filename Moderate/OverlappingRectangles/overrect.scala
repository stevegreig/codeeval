import scala.io.Source

object Main {
	def overlaps(r1_ul_x:Int, r1_ul_y:Int, r1_lr_x:Int, r1_lr_y:Int, r2_ul_x:Int, r2_ul_y:Int, r2_lr_x:Int, r2_lr_y:Int ): Boolean = {
		(r1_ul_x <= r2_lr_x) && (r1_lr_x >= r2_ul_x) && (r1_ul_y >= r2_lr_y) && (r1_lr_y <= r2_ul_y)
	}

	def main(args: Array[String]) = {
		for (line <- Source.fromFile(args(0)).getLines().filter(!_.isEmpty())) {
			val coords = line.split(",").map(_.toInt)
			println(if (overlaps(coords(0),coords(1),coords(2),coords(3),coords(4),coords(5),coords(6),coords(7))) "True" else "False")
		}
	}
}