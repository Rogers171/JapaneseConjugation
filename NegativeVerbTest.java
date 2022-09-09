/**
 * @author Adell - amrogers5
 * CIS175 - Fall 2022
 * Sep 8, 2022
 */
package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Model.NegativeVerb;

public class NegativeVerbTest {
	NegativeVerb negativeVerb = new NegativeVerb("tabenai");  //Tabenai means "to not eat", it is the negative of "taberu" 'to eat'
	
	@Before
	public void setUp () throws Exception {}
	
	@Test
	public void test() {
		assertEquals("tabenakatta", negativeVerb.createPastNegative(negativeVerb.getPlainPresentNegative()));
	}

}
