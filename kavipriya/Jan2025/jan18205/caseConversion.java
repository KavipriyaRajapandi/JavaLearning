class caseConversiom {
	public static void main(String[] args) {
		String s = "aceADBbZY";
		String swapped = swapMethod(s);
		System.out.println("Converted String: " + swapped);
	}

	public static String swapMethod(String s) {
		String ans = "";
		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (Character.isUpperCase(ch[i])) {
				ans += Character.toLowerCase(ch[i]);
			} else if (Character.isLowerCase(ch[i])) {
				ans += Character.toUpperCase(ch[i]);
			} else {
				ans += ch[i]; // If it's not a letter, keep it as it is
			}
		}

		return ans;
	}
}
