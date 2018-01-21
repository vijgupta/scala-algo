package basic.ds

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
  * @author vijgupta
  */

@RunWith(classOf[JUnitRunner])
class StackTest extends FunSuite{

  test("Generic Stack"){
        val stack = new Stack[Int]
        stack.push(5)
        stack.push(4)
        stack.push(3)
        stack.push(2)
        stack.push(1)
        assert(1 == stack.pop())
        assert (2 == stack.pop())
        assert (3 == stack.pop())
        stack.push(10)
        stack.push(20)
        assert(20 == stack.pop())
  }
}
