package numeroscomplejos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testComplex {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	@Test
    public void testGetImag() {
        System.out.println("getImag");
        Complex instance = new Complex();
        double expResult = 0.0;
        double result = instance.getImag();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImag method, of class Complex.
     */
    @Test
    public void testSetImag() {
        System.out.println("setImag");
        double imag = 0.0;
        Complex instance = new Complex();
        instance.setImag(imag);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReal method, of class Complex.
     */
    @Test
    public void testGetReal() {
        System.out.println("getReal");
        Complex instance = new Complex();
        double expResult = 0.0;
        double result = instance.getReal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setReal method, of class Complex.
     */
    @Test
    public void testSetReal() {
        System.out.println("setReal");
        double real = 0.0;
        Complex instance = new Complex();
        instance.setReal(real);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sumar method, of class Complex.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        Complex c = new Complex(3.20,9.28);
        Complex instance = new Complex(9.79,14.3);
        Complex expResult = new Complex(1.89,2.91);
        Complex result = instance.sumar(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testSumarMultiplucar() {
        System.out.println("sumarMultiplicar");
        Complex suma1  = new Complex(3.20,9.28);
        Complex suma2 = new Complex(9.79,14.3);
        Complex multiplicar = new Complex(1.89,2.91);
        Complex resultSum = suma2.sumar(suma1);
        Complex resultA = multiplicar.multiplicar(resultSum);
        Complex expResultA = new Complex();
        assertEquals(expResultA, resultA) ;
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of restar method, of class Complex.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        Complex c = new Complex(3.20,9.28);
        Complex instance = new Complex(9.79,14.3);
        Complex expResult = new Complex(-1.89,-2.91);
        Complex result = instance.restar(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of multiplicar method, of class Complex.
     */
    @Test
    public void testMultiplicar_Complex() {
        System.out.println("multiplicar");
        Complex c = new Complex(3.20,9.28);
        Complex instance = new Complex(77.09,22.99);
        Complex expResult = new Complex(-98.678678,45345.90);
        Complex result = instance.multiplicar(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class Complex.
     */
    @Test
    public void testMultiplicar_double() {
        System.out.println("multiplicar");
        double n = 0.0;
        Complex instance = new Complex(45.36,52.36);
        Complex expResult =new Complex(65184.32,5616.32);
        Complex result = instance.multiplicar(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class Complex.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        Complex c = new Complex(3.20,9.28);
        Complex instance = new Complex(45.37,2.36);
        Complex expResult =new Complex(6985.32,56.32);
        Complex result = instance.dividir(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Complex.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Complex instance = new Complex();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Complex.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Complex instance = new Complex();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
