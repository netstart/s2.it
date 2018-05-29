package com.github.s2it.question09;

import org.junit.Assert;
import org.junit.Test;

public class Question09Test {
	@Test
	public void sumOneNodeWithZeroTest() {
		Question09 node01 = new Question09(0);
		Assert.assertEquals(node01.sum(), 0);
	}

	@Test
	public void sumOneNodeTest() {
		Question09 node01 = new Question09(1);
		Assert.assertEquals(node01.sum(), 1);
	}

	@Test
	public void sumTwoNodeTest() {
		Question09 node01 = new Question09(1);
		node01.add(new Question09(2));
		Assert.assertEquals(3, node01.sum());
	}

	@Test
	public void sumThreeNodeTest() {
		Question09 node01 = new Question09(1);
		node01.add(new Question09(2));
		node01.add(new Question09(3));
		Assert.assertEquals(6, node01.sum());
	}

	@Test
	public void sumSixNodeTest() {
		Question09 node01 = new Question09(1);
		Question09 node02 = new Question09(2);
		Question09 node03 = new Question09(3);

		node01.add(node02);
		node01.add(node03);

		node02.add(new Question09(4));
		node02.add(new Question09(5));
		node03.add(new Question09(6));

		Assert.assertEquals(21, node01.sum());
	}

	@Test
	public void sumSixNodeOnSecondNodeTest() {
		Question09 node01 = new Question09(1);
		Question09 node02 = new Question09(2);
		Question09 node03 = new Question09(3);

		node01.add(node02);
		node01.add(node03);

		node02.add(new Question09(4));
		node02.add(new Question09(5));
		node03.add(new Question09(6));

		Assert.assertEquals(11, node02.sum());
	}

	@Test
	public void sumOnlyPairNodeTest() {
		Question09 node01 = new Question09(2);
		Question09 node02 = new Question09(4);
		node01.add(node02);
		node02.add(new Question09(6));

		Assert.assertEquals(12, node01.sum());
	}

	@Test
	public void sumOnlyOddNodeTest() {
		Question09 node01 = new Question09(3);
		Question09 node02 = new Question09(7);
		node01.add(node02);
		node02.add(new Question09(9));

		Assert.assertEquals(19, node01.sum());
	}

	@Test
	public void sumOnlyOddNodeOnSecondNoeTest() {
		Question09 node01 = new Question09(3);
		Question09 node02 = new Question09(7);
		node01.add(node02);
		node02.add(new Question09(9));

		Assert.assertEquals(16, node02.sum());
	}

}
