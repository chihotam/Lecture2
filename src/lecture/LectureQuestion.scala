package lecture

import scala.io.{BufferedSource, Source}
object LectureQuestion {
  def fileSum(filename: String): Int = {
    val file: BufferedSource = Source.fromFile(filename)
    var total: Int = 0
    for (line <- file.getLines()) {
      val split: Array[String] = line.split("#")
      for (value <- split) {
        total += value.toInt
      }
    }
    total
  }
}