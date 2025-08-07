package String;
/*
 6. Design and implement a custom Java class named MyString that mimics the behavior of Java’s built-in String class. Your class should store character data internally (e.g., using a char[] or String as input) and should provide the following string methods,
 */
class My_String {
    char[] character;

    My_String(char[] character) {
        this.character = character;
    }

    // Returns the number of characters.

    public int length() {
        return character.length;
    }

    // Returns the character at the specified index.

    public char charAt(int index) {
        try {
            return character[index];
        } catch (ArrayIndexOutOfBoundsException i) {
            System.err.println("IndexOutOfBounds : " + i);
        }
        return '\u0000';
    }

    // Checks if two MyString objects are equal.

    public boolean equals(My_String str) {
        if (this.character.length != str.character.length)
            return false;
        for (int i = 0; i < str.character.length; i++) {
            if (str.character[i] != this.character[i])
                return false;
        }
        return true;
    }

    // Returns a new string with all characters in uppercase.

    public My_String toUpperCase() {
        char []  ch = new char[this.character.length];
        for (int i = 0; i < ch.length; i++) {
            if (this.character[i] >= 'a' && this.character[i] <= 'z') {
                ch[i] = (char) (this.character[i] - 32);
            }
            else ch[i] = (char) (this.character[i]);
        }
        return new My_String(ch);
    }

    // Returns a new string with all characters in lowercase.

    public My_String toLowerCase() {
        char []  ch = new char[this.character.length];
        for (int i = 0; i <ch.length; i++) {
            if (this.character[i] >= 'A' && this.character[i] <= 'Z') {
                ch[i] = (char) (this.character[i] + 32);
            }
            else ch[i] = (char) (this.character[i]);
        }
        return new My_String(ch);
    }

    // Checks if a substring exists.

    public My_String substring(int start, int end) {
        char[] substr = new char[(end - start) + 1];
        int index = 0;
        for (int i = start; i < end; i++)
            substr[index++] = this.character[i];
        return new My_String(substr);
    }

    // Checks if a substring exists. Single parameter

    public My_String substring(int start) {
        char[] substr = new char[(this.character.length - start)];
        try {
            int index = 0;
            for (int i = start; i < this.character.length; i++)
                substr[index++] = this.character[i];
        } catch (SecurityException s) {
            s.printStackTrace();
        }
        return new My_String(substr);
    }

    // Concatenates another string to the current one.

    public My_String concat(My_String str) {
        char con[] = new char[this.character.length + character.length];
        int index = 0;
        for (int i = 0; i < this.character.length; i++)
            con[index++] = this.character[i];
        for (int i = 0; i < str.character.length; i++)
            con[index++] = str.character[i];
        return new My_String(con);
    }

    // Returns the index of the first occurrence of the character.

    public int indexOf(char ch) {
        for (int i = 0; i < this.character.length; i++) {
            if (this.character[i] == ch)
                return i;
        }
        return -1;
    }

    // Replaces all occurrences of a character.
    public My_String replace(char oldChar, char newChar) {
        for (int i = 0; i < this.character.length; i++) {
            if (this.character[i] == oldChar)
                this.character[i] = newChar;
        }
        return new My_String(character);
    }

    public boolean contains(My_String sub) {
        int len = this.character.length;
        int len2 = sub.character.length;
        for (int i = 0; i <=len - len2; i++) {
           System.out.println(this); 
           My_String str = (this.substring(i, i+len2));  
           System.out.println("str : " +str);  
           System.out.println("sub ; " +sub);  
           if(sub.equals(str)) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < this.character.length; i++) {
            str += this.character[i];
        }
        return str;
    }
}