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

}
