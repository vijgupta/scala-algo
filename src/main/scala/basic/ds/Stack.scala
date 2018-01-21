package basic.ds

/**
  * @author vijgupta
  * Generic Stack
  */
class Stack[T] {
  var top: Node[T] = null;

  def isEmpty(): Boolean = {
    top == null
  }

  def push(t : T) : Unit = {
    val elem = new Node[T](t, null)
    if (top == null){
      top = elem
    }else {
      elem.next = top
      top = elem
    }
  }

  def pop() : T = {
    if (isEmpty()) throw new RuntimeException("Stack is Empty")
    else {
      val elem = top.t
      top = top.next;
      return  elem
    }
  }

}

class Node[T](var t: T, var next: Node[T]){

}

