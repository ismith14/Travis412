package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(2, 0), 2);
	}
	public void testminus() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(5, 3), 2);
	}
	public void testmultiply() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(8, 6), 24);
	}
}
