import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	
	GradeBook book1 = new GradeBook(5);
	GradeBook book2 = new GradeBook(5);

	@BeforeEach
	void setUp() throws Exception {
		
		book1.addScore(38.1);
		book1.addScore(89.7);
		book2.addScore(59.9);
		book2.addScore(100.0);
		book2.addScore(13.0);
		book2.addScore(69.3);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		
		book1 = null;
		book2 = null;
		
	}

	@Test
	void testAddScore() {
		assertTrue(book1.addScore(27.8));
	}

	@Test
	void testSum() {
		assertEquals(127.8, book1.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(38.1, book1.sum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(127.8, book1.sum(), .0001);

	}

	@Test
	void testGetScoreSize() {
		assertEquals(2, book1.getScoreSize(), .001);
	}

	@Test
	void testToString() {
		assertEquals("38.1 89.7 ", book1.toString());
	}

}
