import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {

    PhoneBook sut = new PhoneBook();

    @Test
    public void addTest() {
        //arrange
        String name1 = "Petr";
        String number1 = "89112222222";
        String name2 = "Andrew";
        String number2 = "89113333333";
        int expected = 2;
        //act
        sut.add(name1, number1);
        int result = sut.add(name2, number2);
        //assert
        assertEquals(expected, result);
    }

    @BeforeEach
    public void initTest() {
        System.out.println("Test started");
    }

    @AfterEach
    public void finishTest() {
        System.out.println("Test finished");
    }

    @BeforeAll
    public static void startedTests() {
        System.out.println("Tests started");
    }

    @AfterAll
    public static void finishedTests() {
        System.out.println("Tests finished");
    }
}
