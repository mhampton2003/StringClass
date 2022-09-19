
public class MyString {
	private int curr_length;
	char[] arr;
	
	//default constructor - O(1)
	public MyString() {
		curr_length = 0;
		arr = null;
	}
	
	//non-default constructor - O(n)
	public MyString(String str) {
		curr_length = str.length();
		arr = new char[curr_length];

		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
	}
	
	//copy constructor - O(n)
	public MyString(MyString obj) {
		curr_length = obj.curr_length;
		arr = obj.arr;
	}
	
	//returns length of string - O(1)
	public int length() {
		return curr_length;
	}
	
	//allocates extra memory for concatenated objects - O(n)
	private void ensureCapacity() {
		char[] temp = arr;
		int size = curr_length;
		temp = arr;
		
		curr_length *= 3;
		arr = new char[curr_length];
		for (int i = 0; i < size; i++) {
			arr[i] = temp[i];
		}
	}
	
	//adds the second string to the end of the first - O(n + m)
	public MyString concat(MyString obj) {
		//checks if a new array needs to be created to allocate memory
		//for the second concatenated string
		if (obj.length() > (curr_length - this.toString().length())) {
			ensureCapacity();
		}

		MyString m;
		String s = "";
		int counter = 0;
		
		//counts the length of the string for
		for (int i = 0; i < curr_length; i++) {
			if ((int)this.arr[i] != 0) {
				counter++;
			}
		}

		//adds the the first string to a new string
		for (int i = 0; i < counter; i++) {
			s = s + this.get(i);
		}
		
		//adds the second string to the end of the first string
		for (int i = 0; i < obj.length(); i++) {
			s = s + obj.get(i);
		}
		
		//creates a new object with the new concatenated string
		m = new MyString(s);

		return m;
	}
	
	//returns chars in array as a string - O(n)
	public String toString() {
		String s = "";
		for (int i = 0; i < curr_length; i ++) {
			s = s + arr[i];
		}

		return s;
	}
	
	//checks if two MyStrings are equal - O(n)
	public Boolean equals(MyString obj) {
		//checks if lengths are equal
		if (curr_length == obj.toString().length()) {
			//checks if ascii values are equal
			for (int i = 0; i < curr_length; i++) {
				if ((int)arr[i] == (int)obj.get(i)) {
				}
				else {
					return false;
				}
			}
		}
		//if not same length
		else {
			return false;
		}
		return true;
	}
	
	//checks if two MyString objects are greater than, less than, or equal to each other
	//O(n)
	public int compareTo(MyString obj) {
		//if two objects are equal: return 0
		if (this.equals(obj)) {
			return 0;
		}
		
		//if the first index of both objects are equal
		//check the following indexes to see which is greater or less than
		if ((int)this.get(0) == (int)obj.get(0)) {
			for (int i = 0; i < curr_length; i++) {
				//if the chars are the same, check the value at the next index
				if ((int)this.get(i) == (char)obj.get(i)) {
				}
				//if the first object's char is bigger, return 1
				else if ((int)this.get(i) > (char)obj.get(i)){
					return 1;
				}
				//if the second object's char is smaller, return -1
				else {
					return -1;
				}
			}
			return 0;
		}
		
		//if the first char is bigger, return 1
		if ((int)this.get(0) > (char)obj.get(0)){
			return 1;
		}
		//if the second char is smaller, return -1
		else {
			return -1;
		}
	}
	
	//returns the char at the desired index - O(1)
	public char get(int index) {
		return arr[index];
	}
	
	//returns the string as all upper case - O(n)
	public MyString toUpper() {
		MyString upperArr;
		String s = "";
		int asciiTemp;
		
		for (int i = 0; i < curr_length; i++) {
			//checking if each value is lower case
			//if lower case subtracts 32 from the ascii value and adds upper
			//case value to string
			if (((int)arr[i] >= 97) && ((int)arr[i] <= 122)) {
				asciiTemp = (int)arr[i] - 32;
				s = s + (char)asciiTemp;
			}
			//if already upper case copy over into the new string as is
			else {
				s = s + arr[i];
			}
		}
		upperArr = new MyString(s);
		return upperArr;
	}
	
	//returns the string as all lower case - O(n)
	public MyString toLower() {
		MyString lowerArr;
		String s = "";
		int asciiTemp;
		
		for (int i = 0; i < curr_length; i++) {
			//checking if each value is upper case
			//if upper case adds 32 to the ascii value and adds lower
			//case value to string
			if (((int)arr[i] >= 65) && ((int)arr[i] <= 90)) {
				asciiTemp = (int)arr[i] + 32;
				s = s + (char)asciiTemp;
			}
			//if already lower case copy over into the new string as is
			else {
				s = s + arr[i];
			}
		}
		
		lowerArr = new MyString(s);
		return lowerArr;
	}
	
	//returns remaining string starting at desired index - O(n)
	public MyString substring(int n) {
		MyString sub;
		String s = "";
		for (int i = 0; i < curr_length; i++) {
			//if index is greater than or equal to desired index
			//add that index to new string
			if (i >= n) {
				s = s + arr[i];
			}
		}
		sub = new MyString(s);
		return sub;
	}
	
	//returns string in between two desired indexes
	//starting at first input and ending one before second input - O(n)
	public MyString substring(int n, int m) {
		MyString sub2;
		String s = "";
		for (int i = 0; i < curr_length; i++) {
			if (((i == n) || (i > n)) && (i < m)) {
				s = s + arr[i];
			}
		}
		sub2 = new MyString(s);
		return sub2;
	}
	
	//returns the index of the first occurrence of the desired char - O(n)
	public int indexOf(char c) {
		for (int i = 0; i < curr_length; i++) {
			//if the desired char is equal to the char at the index return the index
			if ((int)c == arr[i]) {
				return i;
			}
		}
		//if the char is not found - return -1
		return -1;
	}
	
	//return the index of the last occurrence of the desired char - O(n)
	public int lastIndexOf(char c) {
		for (int i = curr_length - 1; i >= 0; i--) {
			//if the desired char is equal to the char at the index return the index
			if ((int)c == arr[i]) {
				return i;
			}
		}
		//if the char is not found - return -1
		return -1;
	}
}
