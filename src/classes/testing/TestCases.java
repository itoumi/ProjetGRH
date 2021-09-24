package classes.testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestCases {
	
	
	public VerifClasses vc;
	
	@Before
	public void initTest() {
		vc = new VerifClasses();
	}
	@Test
	public void testNotEmpty() {
		assertTrue(vc.VerifChaine("bonjour"));
	}
	
	@Test
	public void testID() {
		assertTrue(vc.VerifID(10));
	}
	
	@Test
	public void testNbHeures() {
		assertTrue(vc.VerifNbHeures(11));
	}
	
	@Test
	public void testPrix() {
		assertTrue(vc.VerifPrix(101));
	}
	
	@Test
	public void testTitre() {
		assertTrue(vc.VerifTitre("Formation JAVA"));
	}
	
	@Test
	public void testSession() {
		assertTrue(vc.VerifSession("en ligne"));
	}
	
	@Test
	public void testGrade() {
		assertTrue(vc.VerifGrade("expert"));
	}
}
