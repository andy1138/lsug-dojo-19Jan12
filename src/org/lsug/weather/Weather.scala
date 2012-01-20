package org.lsug.weather
import scala.io.Source

object Weather {
	def file( filename:String): String = {
	  Source.fromFile(filename).mkString
	}
	
	def readHeader(filename:String) : Iterator[String] = {
	  val lines = Source.fromFile(filename).getLines()
	  lines.drop(8)
	}
	
	def readDay(iter: Iterator[String]): String = {
		iter.next()
	}
}