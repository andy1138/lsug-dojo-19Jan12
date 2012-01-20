package org.lsug.weather

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import java.io.{ByteArrayOutputStream, PrintStream}
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class WeatherTest extends FunSuite with ShouldMatchers {
  test("Can find file and read it") {
    val res = Weather.file("weather.dat")
    assert( res.contains("Unofficial") )
  }
  
  test("Can find the first data row") {
    val resIt = Weather.readHeader("weather.dat")
    val res = Weather.readDay(resIt)
    println(res)
      assert(res.contains("1  88    59    74          53.8       0.00 F       280  9.6 270  17  1.6  93 23 1004.5"))
  }

}