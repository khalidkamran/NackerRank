package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import StringManipulation.FunnyString;


public class FunnyStringTest {
	private FunnyString fString;
	
	@Before
	public void initilize(){
		fString = new FunnyString();
	}
	
	@Test
	public void test() {
		assertArrayEquals("is funny failed", "", fString.isFunny("ABXZ"));
	}

}
