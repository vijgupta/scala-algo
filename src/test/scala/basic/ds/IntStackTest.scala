package basic.ds

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
  *  @author vijgupta
  */

@RunWith(classOf[JUnitRunner])
class IntStackTest extends FunSuite{

  test("StackInt push and pop"){
    val stack = new IntStack(3)
    stack.push(3)
    stack.push(2)
    stack.push(5)
    val popVal = stack.pop()
    assert(popVal == 5)

  }
}
