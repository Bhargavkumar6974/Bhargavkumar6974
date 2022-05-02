package strings;

import java.util.StringTokenizer;

public class Tokenizers {

	public static void main(String[] args) {
		String s = "hello : world :  windows";
		StringTokenizer aaa = new StringTokenizer(s);
		StringTokenizer bbb = new StringTokenizer("delhi /is /captial /of/ india", "/"); // strg,delim
		StringTokenizer ccc = new StringTokenizer("i like/pikachu", " ", true); //strg,delim,flg tr=dont prnt fl=prnt nd dnt seprte

		while (aaa.hasMoreTokens()) // jab tak tokns miley rahey ga tab tak

		{
			System.out.println(" " + aaa.nextToken(":")); // delim is :
		}
		while (bbb.hasMoreTokens()) {
			System.out.println(" " + bbb.nextToken());
		}
		while (ccc.hasMoreTokens()) {
			System.out.println(" " + ccc.nextToken());
		}

	}

}
