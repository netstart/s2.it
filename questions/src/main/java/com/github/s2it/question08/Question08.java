package com.github.s2it.question08;

public class Question08 {

	public String build(String a, String b) {
		if (!existNumber(a) || !existNumber(b)) {
			return "";
		}

		int sizeTotal = a.length() + b.length();

		if (sizeTotal >= "1000000".length()) {
			return "-1";
		}

		StringBuilder c = new StringBuilder();

		for (int position = 0; position < sizeTotal; position++) {
			appendCharAt(a, position, c);
			appendCharAt(b, position, c);
		}

		return c.toString();
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
