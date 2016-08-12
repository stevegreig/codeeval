import scala.io.Source

object Main {

    def getME(numbers: Array[Int]): Option[Int] = {
        val numMap = scala.collection.mutable.HashMap[Int,Int]()
        for (num <- numbers){
            numMap.get(num) match {
                case Some(n) => numMap(num) += 1
                case None    => numMap(num) = 1
            }
        }
        val major = numMap.filter( t => t._2 > (numbers.length / 2))
        if (major.size > 0)
            Some(major.head._1)
        else
            None
    }

    def main(args: Array[String]) = {
        for (line <- Source.fromFile(args(0)).getLines().filter(!_.isEmpty())) {
            println( getME(line.split(",").map(_.toInt)) match {
                case Some(n) => n 
                case None    => "None"
            })
        }
    }
}
