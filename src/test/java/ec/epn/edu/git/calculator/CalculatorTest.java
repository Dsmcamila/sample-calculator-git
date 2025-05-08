package ec.epn.edu.git.calculator;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator c = null;

    @BeforeClass //Se ejecuta una vez al incicio
    public static void setUpClass(){
        System.out.println("SetUpClean()");
    }

    @Before // Obliga a que se ejecute antes de cada test
    public void setUp() {
        c = new Calculator();
        System.out.println("setUp()");
    }

    //Los test se ejecutan aleatoriamente
    @Test
    public void given_two_integers_when_addition_then_ok() {
        assertEquals(6, c.adittion(4, 2));
        System.out.println("Test 1");
    }

    @Test
    public void given_two_integers_when_subtraction_then_ok() {
        assertEquals(2, c.subtraction(4, 2));
        System.out.println("Test 2");
    }

    @Test(expected = ArithmeticException.class)
    public void given_two_integers_when_division_then_ok() {
        assertEquals(2, c.division(6, 0));
        System.out.println("Test 3");
    }

    @Test(timeout = 200)
    public void given_two_integers_when_multiplication_then_ok() {
        assertEquals(8, c.multiplication(4, 2));
        System.out.println("Test 4");
    }

    @After //Después de cada test
     public  void tearDown(){
        System.out.println("tearDown()");
        c.setAns(0);
        c=null;
    }

    @AfterClass //Se ejecuta una vez al final
    public static void tearDownClass(){
        System.out.println("tearDownClass()");
    }


}