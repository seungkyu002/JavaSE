package day08.util;

/*
 * [[ String 불변의 객체 ]]
 * 	1. 메모리절약
 *  2. Security
 *  3. Thread Safe 
 * 
 */


public class MainClass05 {
	
	public static void main(String[] args) {
		String str1 = "abc";	// 불변
		String str2 = "abc";	// 불변
		String str3 = new String("abc"); 	// 새로운 메모리
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		// length 길이
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt.length());
		
		// 문자열이 지정한 문자로 시작하는지 판단
		String str4 = "apple";
		boolean startsWith = str4.startsWith("a");
		System.out.println("startsWith: " + startsWith);
		
		// 문자열 마지막에 지정한 문자가 있는지를 판단
		String str5 = "test";
		boolean endsWith = str5.endsWith("t");
		System.out.println("endsWith: " + endsWith);
		
		// 문자 인덱스번호 반환
		String str6 = "abcdef";
		int indexOf = str6.indexOf("d");
		System.out.println("indexOf: " + indexOf);
		
		// 문자열에 지정한 문자가 마지막몇번째에 있는 int를 반환한다.
		String str7 = "AdnroidApp";
		int lastIndexOf = str7.lastIndexOf("A");
		System.out.println("lastIndexOf:" + lastIndexOf);
		
		// 문자 치환
		String str8 = "A*B*C*D";
		String replace = str8.replace("*", "-");
		System.out.println("replace: " + replace);
		
		// 문자열을 나누기(배열로 반환)
		String str9 = "A:B:C:D:abcd";
		String[] split = str9.split(":");
		System.out.println("split: " + split[1]);
		
		// 문자열 적삭
		String str10 = "ABCDEF";
		String substring = str10.substring(0, 2);
		System.out.println("substring: " + substring);
		
		// 소문자 변환
		String str11 = "abcDEF";
		String toLowerCase = str11.toLowerCase();
		System.out.println("toLowerCase: " + toLowerCase);
		
		// 대분자 변환
		String str12 = "abcDEF";
		String toUppercase = str12.toUpperCase();
		System.out.println("toUppercase: " + toUppercase);
		
		// 공백제거
		String s = "     java java java     ";
		String v;
		v = s.trim();
		System.out.println("trim:" + v);
		
		// 문자비교
		String str13 = "A";
		String str14 = "B";
		int compareTo = str13.compareTo(str14);
		if(compareTo > 0){
		       System.out.println(str13 + " > " +str14);
		} else if (compareTo == 0){
		       System.out.println(str13 + " = " +str14);
		} else{
		       System.out.println(str13 + " < " +str14);
		}
		
		// 문자 포함여부
		String str15 = "abcd";
		String str16 = "c";
		boolean contains = str15.contains(str16);
		System.out.println("contains: " + contains);
		
		
		
		
	}

}
