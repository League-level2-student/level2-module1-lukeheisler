package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		ArrayList<String> list = new ArrayList<String>();
		// Don't forget to import the ArrayList class

		// 2. Add five Strings to your list
		list.add("Hello,");
		list.add("how");
		list.add("are");
		list.add("you");
		list.add("today?");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// 4. Print all the Strings using a for-each loop
		for (String j : list) {
			System.out.println(j);
		}
		// 5. Print only the even numbered elements in the list.
		for (int k = 0; k < list.size(); k++) {
			if (k % 2 == 0) {
				System.out.println(list.get(k));
			}
		}
		// 6. Print all the Strings in reverse order.
		
		// 7. Print only the Strings that have the letter 'e' in them.
	}
}
