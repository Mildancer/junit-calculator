import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {

	private Calculator classUnderTest;

	@Before                                // wykonanie przed kazdym testem
	public void setUp() {
		System.out.println("Metoda zostanie wykonana przed kazdym testem");
		classUnderTest = new Calculator();                                        // za kazdym razem przywraca nowy kalkulator
	}

	@After                                    // wykonane po kazdym tescie
	public void tearDown() {
		System.out.println("Metoda zostanie wykonana po kazdym tescie");
	}

	@Test                                                        //metoda testowa
	public void test1() throws Exception {
		System.out.println("Metoda testowa");


		double a = 1.0;
		double b = 3.5;
		double c = 3.0;
		double d = 4.0;
		double e = 2.0;

		double f = 0.0;


		//to czego sie spodziewamy
		double expected = 4.5;

		double expected2 = -2.5;

		double excpected3 = 12;
		double excpected4 = 2;


		//to co faktycznie zwrocila nam funkcja
		double actual = classUnderTest.sum(a, b);

		double actual2 = classUnderTest.subtract(a, b);

		double actual3 = classUnderTest.multiply(c, d);

		double actual4 = classUnderTest.divide(d, e);
		// double actual5 =classUnderTest.divide(e,f);

		// tolerancja-odchylenie expected od actual 0.001
		Assert.assertEquals(expected, actual, 0.001);

		Assert.assertEquals(expected2, actual2, 0.001);

		Assert.assertEquals(excpected3, actual3, 0.001);
		Assert.assertEquals(excpected4, actual4, 0.001);


	}

	@Test(expected = IllegalArgumentException.class)   // nazwa  wyjatku na poczatku expect IllegalArgumentException  @Test (expected = Exception.class)
	public void test2() {


	double a = 1.0;
	double b = 0.0;
	double actual = classUnderTest.divide(a, b);
}
}