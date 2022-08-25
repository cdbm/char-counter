package charcounter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharCounter {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print ("Type your String : "); 
		String s = in.nextLine(); 
		
		Map<Character, Integer> appearances = new HashMap<>();
		
		for(char c : s.toCharArray()) {
			if((c > 64 && c < 91) || (c > 96 && c < 123)) {
				Integer x = appearances.get(c);
				if(x == null) {
					appearances.put(c, 1);
				}else {
					appearances.put(c, x+1);
				}	
			}
		}
	
		System.out.println("Original String: " +s);
		for(var entry : appearances.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
