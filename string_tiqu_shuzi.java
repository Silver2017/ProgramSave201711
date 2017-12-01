/*×Ö·û´®£¬ÌáÈ¡Êý×Ö*/
public class string_tiqu_shuzi {
	public static void main(String[] args) {
		String chkdt = "abc2017-12-01";
		if (chkdt.length() > 0) {
			String str = chkdt.trim();
			String str2 = "";
			if (str != null && !"".equals(str)) {
				for (int i5 = 0; i5 < str.length(); i5++) {
					if (str.charAt(i5) >= 48 && str.charAt(i5) <= 57) {
						str2 += str.charAt(i5);
					}
				}
				System.out.println(str2);
			}
			chkdt = str2;

		}
	}
}
