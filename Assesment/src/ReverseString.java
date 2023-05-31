
import java.io.*;

public class ReverseString {

	public static void main(String[] args) {
		String strr = "Samruddhi" ,nstr = "";
		char ch;
		
		System.out.println(strr);
		
		for(int i =0; i < strr.length(); i++) {
			ch = strr.charAt(i);
			nstr = ch+strr;}
		
			System.out.println("Reversed order" + nstr);
			
		}
}
