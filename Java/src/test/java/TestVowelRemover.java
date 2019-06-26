import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestVowelRemover {

    VowelRemover vr;

    @Before
    public void setup(){
        vr = new VowelRemover();
    }


    @Test
    public void TestVowelRemoverWithoutVowels() {
        //Test 1:
        //given
        String expected = "sdf1234";


        //when
        String actual = vr.removeVowels(expected);

        //then
        Assert.assertEquals(expected, actual);


        //Test 2:
    }

    @Test
    public void TestVowelRemoverWithVowels(){
        //given
        String expected2 = "Wh nds vwls?";
        String testString = "Who needs vowels?";


        //when
        String actual2 = vr.removeVowels(testString);

        //then
        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void testVowelRemoverEmtpyString(){
        //given
        String expected = ""; //the empty string, which should remain unchanged

        //when
        String actual = vr.removeVowels(expected); //We attempt to remove all vowels

        //then
        Assert.assertEquals(expected,actual); //it should remain unchanged
    }


}
