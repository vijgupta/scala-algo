package basic.algo

/**
  * @author vijgupta
  */

object Fibb {
  def fib(n : Int) : Int = {
    if (n <= 2) 1
    else {
      fib (n-1)+fib(n-2)
    }
  }

}
