package ec.epn.edu.git.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class) // definir si voy a hacer parametros
public class CalculatorParametersTest {

    private int a,b,expected;

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters() {
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[] {2,1,3});
        objects.add(new Object[] {1,1,2});
        objects.add(new Object[] {4,1,5});
        objects.add(new Object[] {3,1,6});
        objects.add(new Object[] {3,1,7});
        objects.add(new Object[] {3,1,8});
        objects.add(new Object[] {3,1,9});
        return objects;
    }

    public CalculatorParametersTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }


    @Test
    public void given_two_parameters_when_addition_then_ok() {
        Calculator c = new Calculator();
        assertEquals(6, c.addition(4, 2));
        System.out.println("Test 1");
    }
}