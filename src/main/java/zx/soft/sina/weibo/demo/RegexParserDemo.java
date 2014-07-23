package zx.soft.sina.weibo.demo;

import zx.soft.sina.weibo.utils.RegexParser;

public class RegexParserDemo {

	public static void main(String[] args) {

		// String beginRegex = "<dd" + RegexParser.TEXTEGEXANDNRT + "</a>";
		// String endRegex = "<span>";
		// String text = "<dd>    <a a b c>1</a>//@<a b c d>2</a>3 4<span>";
		// RegexParser ansjSayUrl = new RegexParser(beginRegex, endRegex,
		// text, RegexParser.TEXTEGEXANDNRT);
		String source = "��� ����  ";

		RegexParser regexPaserUtil = new RegexParser(null, null);

		System.out.println(regexPaserUtil.isAllChineseChar(source));

	}

}
