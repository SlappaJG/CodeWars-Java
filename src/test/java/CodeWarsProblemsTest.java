import org.example.Problems;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CodeWarsProblemsTest {

    Problems problems;

    @BeforeEach
    void setUp() {
        // This method runs before each @Test method
        problems = new Problems();
        System.out.println("Initializing Problems object...");
    }

    @Test
    public void TestRepeatString(){
        String str = "a";
        int repeat = 4;
        String expected = "aaaa";

        String result = problems.repeatStr(repeat, str);

        assertEquals(expected, result);
    }

    @Test
    public void TestFilterList()
    {
        assertEquals(List.of(1, 2), problems.filterList(List.of(1, 2, "a", "b")), "For input: [1, 2, \"a\", \"b\"]");
    }

    @Test
    public void TestGetXO(){
        assertEquals(true,  problems.getXO("ooxx"));
        assertEquals(false, problems.getXO("xooxx"));
        assertEquals(true,  problems.getXO("ooxXm"));
        assertEquals(true,  problems.getXO("zpzpzpp"));
        assertEquals(false, problems.getXO("zzoo"));
        assertEquals(false, problems.getXO("xxx23424esdsfvxXXOOooo"));
    }

    @Test
    void testFriend() {
        assertEquals(List.of("Ryan", "Yous"), problems.friend(List.of("Ryan", "Kieran", "Jason", "Yous")), "Input: [\"Ryan\", \"Kieran\", \"Jason\", \"Yous\"]");
        assertEquals(List.of(), problems.friend(List.of("Peter", "Stephen", "Joe")), "Input: [\"Peter\", \"Stephen\", \"Joe\"]");
    }

    @Test
    void testPigIt(){
        assertEquals("igPay atinlay siay oolcay", problems.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", problems.pigIt("This is my string"));
    }

    @Test
    void testBitCounting(){
        assertEquals(5, problems.countBits(1234));
        assertEquals(1, problems.countBits(4));
        assertEquals(3, problems.countBits(7));
        assertEquals(2, problems.countBits(9));
        assertEquals(2, problems.countBits(10));
    }

    @Test
    void testIsNarcissistic(){
        assertTrue(problems.isNarcissistic(153), "153 is narcissistic");
        assertTrue(problems.isNarcissistic(1634), "1634 is narcissistic");
        assertFalse(problems.isNarcissistic(112), "112 is not narcissistic");
    }


}
