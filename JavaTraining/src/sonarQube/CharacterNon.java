package sonarQube;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class CharacterNon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		Map<Character,Integer> nonchar = new  LinkedHashMap<>();
		for(int j=0;j<string.length();j++){
			char ch = string.charAt(j);
			if(nonchar.containsKey(ch)){
				nonchar.put(ch,nonchar.get(ch)+1);
			}
			else if(ch != ' '){
				nonchar.put(ch,1);
			}
		}
	    System.out.println(nonchar);
		for(Entry<Character, Integer> o:nonchar.entrySet()) {
			if(o.getValue() == 1) {
				System.out.println(o.getKey());
				break;
			}
		}
	}
}