package basic.algo

import scala.annotation.tailrec

/**
  * @author vijgupta
  */
object Factorial {

  def fact (x : Int): Int  = {
    if (x < 1) 1
    else
      x * fact(x- 1)
  }

  def fact_tr(x : Int) : Int = {
    @tailrec
    def loop(acc: Int, x: Int): Int =
      if (x == 0) acc
      else
        loop(acc * x, x - 1)
    loop(1, x)
  }

}
