package devops.numbers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void numberOutOfRangeReturnsSuccess() {
		Assert.assertEquals( "Success", "Minus One", numberWords.toWords( -1 ) ) ;
	}

}
