package stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestStack {

    Stack<String> myStack;

    @Before
    public void setup(){
            myStack = new GoodStack<>();
    }


    @Test
    public void testPeek(){
        // given:
        // A stack we already have in the variable `mystack`
        String expected = "First!";

        // when:
        //   I try to peek at the top element
        myStack.push(expected);
        String actual = myStack.peek();

        // then:
        // Stack shouldn't be empty
        Assert.assertFalse(myStack.isEmpty());
        // and first element should match the string "First!"
        Assert.assertEquals(expected, actual);


    }
}
