
public class Driver {
	
	public static void main(String[] args) {
		MyString ms = new MyString("Hello");
		MyString ms2 = new MyString("world");
		
		System.out.println("Testing length method: ");
		System.out.println("There are " + ms.length() + " characters in " + ms.toString());
		
		System.out.println("");
		
		System.out.println("Testing toString method: ");
		System.out.println("The ms array contains the word " + ms.toString());
		
		System.out.println("");
		
		System.out.println("Testing equals method: ");
		System.out.println(ms.toString() + " and " + ms2.toString() + " evaluates to " + ms.equals(ms2));
		
		System.out.println("");
		
		System.out.println("Testing compareTo method: ");
		System.out.println(ms.toString() + " compares to " + ms2.toString() + " with a value of " + ms.compareTo(ms2));
		
		System.out.println("");
		
		System.out.println("Testing get method: ");
		System.out.println("The char at index 1 for " + ms.toString() + " is " + ms.get(1));
		
		System.out.println("");
		
		System.out.println("Testing toUpper method: ");
		System.out.println(ms.toString() + " in all upper case is " + ms.toUpper());
		
		System.out.println("");
		
		System.out.println("Testing toLower method: ");
		System.out.println(ms.toString() + " in all lower case is " + ms.toLower());

		System.out.println("");
		
		System.out.println("Testing substring(int) method: ");
		System.out.println(ms.toString() + " starting at index 2 is " + ms.substring(2));
		
		System.out.println("");
		
		System.out.println("Testing substring(int, int) method: ");
		System.out.println(ms.toString() + " starting at index 2 and ending at index 4 is " + ms.substring(2, 5));
		
		System.out.println("");
		
		System.out.println("Testing indexOf method: ");
		System.out.println("The first index that the letter l occurs at is " + ms.indexOf('l'));
		
		System.out.println("");
		
		System.out.println("Testing substring(int) method: ");
		System.out.println("The last index that the letter l occurs at is " + ms.lastIndexOf('l'));
		
		System.out.println("");
		
		System.out.println("Testing concat method: ");
		System.out.println(ms.toString() + " concatenated with " + ms2.toString() + " is " + ms.concat(ms2));

	}

}
