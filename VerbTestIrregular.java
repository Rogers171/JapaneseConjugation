/**
 * @author Adell - amrogers5
 * CIS175 - Fall 2022
 * Sep 8, 2022
 */
package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Model.Verb;

public class VerbTestIrregular {
	Verb verb = new Verb("iku", "ikimasu");
	
	@Before
	public void setUp () throws Exception {}
	
	@Test
	public void test() {
		assertEquals("itta", verb.createTaForm(verb.getDictionaryForm(), verb.getMasuForm()));
	} /*For some reason, it keeps returning "iita" (what the result would be if it were a regular verb),
	instead of "itta" (since it's irregular).  I've tried altering both the test and the method in the class
	but nothing seems to work.  I suspect that the verb type isn't being set as "irregular", which is why the
	program is skipping to the godan verb section of the method.*/
	
	@Test
	public void testVerbTypeNotNull() {
		assertNotNull(verb.determineVerbType(verb.getDictionaryForm(), verb.getMasuForm()));
	}
	
	@Test
	public void testTaFormFalse() {
		assertFalse(verb.getDictionaryForm().equals(verb.getTaForm()));
	}
}
