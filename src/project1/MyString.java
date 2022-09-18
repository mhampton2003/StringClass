package project1;

public class MyString {
	private int curr_length;
	char[] arr;
	
	//default constructor
	public MyString() {
		curr_length = 0;
		arr = null;
	}
	
	//non-default constructor
	public MyString(String str) {
		curr_length = str.length();
		arr = new char[curr_length];

		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
			System.out.println(arr[i]);
		}
	}
	
	//copy constructor
	public MyString(MyString obj) {
		
	}
	
	//returns length of string
	public int length() {
		return curr_length;
	}
	
	//
	private void ensureCapacity(String str) {
		char[] temp = new char[curr_length];
		for (int i = 0; i < curr_length; i++) {
			temp[i] = arr[i];
		}
	}
	
	//returns array values as a string
	public String toString() {
		String s = "";
		for (int i = 0; i < curr_length; i ++) {
			s = s + arr[i];
		}
		
		System.out.println(s);
		return s;
	}
	
	//
	public Boolean equals(MyString obj) {
		if (curr_length == obj.toString().length()) {
			for (int i = 0; i < curr_length; i++) {
				if ((int)arr[i] == (int)obj.toString().charAt(i)) {
					//System.out.println("ascii true");
				}
				else {
					System.out.println("ascii false");
					return false;
				}
			}
		}
		else {
			System.out.println("length false");
			return false;
		}
		return true;
	}
}
