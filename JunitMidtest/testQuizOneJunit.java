package JunitMidtest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;

import org.junit.Before;

public class testQuizOneJunit {
	
	public QuizOneJunit obj;
	
	@Before
	public void init() {
		obj = new QuizOneJunit();
	}
	
	//TC1 (aaCzdafe)
	@Test
	public void tc01() {
		assertEquals(3, obj.countLetterA("aaCzdafe"));
	}
	
	//TC2 (yyzxczzaxcyy)
	@Test
	public void tc02() {
		assertEquals(1, obj.countLetterA("yyzxczzaxcyy"));
		
	}
	
	//TC3 (aaCzdafe)
	@Test
	public void tc03() {
		assertEquals(false, obj.checkTwoLetter("aaCzdafe"));
	}
	
	//TC4 (ccaaCzdafec)
	@Test
	public void tc04() {
		assertEquals(true, obj.checkTwoLetter("yyzxczzaxcyy"));
	}
}
