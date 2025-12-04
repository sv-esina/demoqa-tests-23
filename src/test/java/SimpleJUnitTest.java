import org.junit.jupiter.api.*;


public class SimpleJUnitTest {

    int result;

    @BeforeEach
    void beforeEach(){
        System.out.println("###   beforeEach()");
        result =getResult();
    }

    @AfterEach
    void afterEach(){
        System.out.println("###   afterEach()");
        result =0;
    }

    @Test
    void firstTest(){

        System.out.println("###     firstTest()");
        Assertions.assertTrue(result>2);
    }

    @Test
    void secondTest(){
        System.out.println("###     secondTest()");
        Assertions.assertTrue(result>2);
    }

    @Test
    void thirdTest(){
        System.out.println("###     thirdTest()");
        Assertions.assertTrue(result>2);
    }

    private int getResult(){
        return 3;
    }
}
