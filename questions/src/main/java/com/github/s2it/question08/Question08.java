package com.github.s2it.question08;

public class Question08 {

	private String MAX = "1000000";

	public String build(String a, String b) {
		if (!existNumber(a) || !existNumber(b)) {
			return "";
		}

		int sizeTotal = sumLength(a, b);
		if (this.isGreatThanMax(sizeTotal)) {
			return "-1";
		}

		return spread(a, b);
	}

	private String spread(String a, String b) {
		int sizeTotal = sumLength(a, b);

		StringBuilder c = new StringBuilder();
		for (int position = 0; position < sizeTotal; position++) {
			appendCharAt(a, position, c);
			appendCharAt(b, position, c);
		}
		return c.toString();
	}

	private boolean isGreatThanMax(int sizeTotal) {
		return sizeTotal >= MAX.length();
	}

	private int sumLength(String a, String b) {
		return a.length() + b.length();
	}

	private StringBuilder appendCharAt(String from, int position, StringBuilder to) {
		try {
			return to.append(from.charAt(position));
		} catch (StringIndexOutOfBoundsException e) {
			return to;
		}
	}

	private boolean existNumber(String number) {
		return number != null && number != "" && number.length() >= 0;
	}

}
