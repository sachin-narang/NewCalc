package in.gov.isro;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator c = new Calculator();
		int result = c.add(5, 5);
		assertEquals(10,result);
	}

}
