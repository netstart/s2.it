package com.github.s2it.question08;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class Question08Test {

	private Question08 question08;
	private String a;
	private String b;

	@Before
	public void makeQuestion8() {
		this.question08 = new Question08();
		this.a = "5";
		this.b = "193";
	}

	@Test
	public void bothNumberEmptyTest() {
		String numberC = this.question08.build("", "");
		Assert.assertEquals(numberC, "");
	}

	@Test
	public void firstNumberIsFirstNumberFromA() {
		String numberC = this.question08.build(a, b);
		Assert.assertEquals(numberC.charAt(0), a.charAt(0));
	}

	@Test
	public void secondNumberIsSecondtNumberFromB() {
		String numberC = this.question08.build(a, b);
		Assert.assertEquals(numberC.charAt(1), b.charAt(0));
	}

	@Test
	public void numberComplete() {
		String numberC = this.question08.build(a, b);
		Assert.assertEquals(numberC, "5193");
	}

	@Test
	public void greatThan1000000() {
		String numberC = this.question08.build("10256", "512");
		Assert.assertEquals(numberC, "-1");
	}

}
