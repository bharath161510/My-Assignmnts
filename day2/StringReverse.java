package week2.day2;

import java.util.Iterator;

public class StringReverse {
	
public static void main(String[] args) {

       String name = "Bharath";
       char[] ch = name.toCharArray();
       
       for (int i =ch.length-1; i>=0; i--) {
		System.out.print(ch[i]);
	}
}
}
