package First_non_Repeating_Character;

import java.util.HashMap;

public class firstUniqueCharacter {

	public int firstUniqueChar(String s)
	{
		HashMap<Character, Integer> map = new HashMap<>();
		
		//step 1 : count freequency
		for(int i =0; i< s.length(); i++)
		{
			char ch = s.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		
		// step 2 : Find first non-Repeating character
		for(int i=0; i< s.length();i++)
		{
			if(map.get(s.charAt(i)) == 1) {
				return i;
			}
		}
		
		return -1;
	}
	
	
	// Main method
    public static void main(String[] args) {
        firstUniqueCharacter obj = new firstUniqueCharacter();

        String input = "loveleetcode";
        int result = obj.firstUniqueChar(input);

        System.out.println("First non-repeating character index: " + result);
    }
}
