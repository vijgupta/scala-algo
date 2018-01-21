package basic.ds

/**
  * Created by vgupta on 1/20/18.
  */
class IntStack {
  private var top : Int  = 0
  private var array: Array[Int] = null

  def this(capacity: Int)  {
    this()
    this.array = Array.fill(capacity){0}
  }

  def isEmpty(): Boolean = {
    top == 0
  }

  def push(elem: Int) : Unit = {
    if (top == array.length) throw new RuntimeException("Stack is full")
    else array(top) = elem;
    top = top+1;
  }

  def pop() : Int = {
    if (isEmpty()) throw new RuntimeException("Stack is empty")
    else {
      top =top -1 ;
      array(top)
    }
  }

  def print(): Unit = {
    array.foreach(x => println(x))
  }
}

object IntStack {
  def main(args: Array[String]): Unit = {

  }
}
