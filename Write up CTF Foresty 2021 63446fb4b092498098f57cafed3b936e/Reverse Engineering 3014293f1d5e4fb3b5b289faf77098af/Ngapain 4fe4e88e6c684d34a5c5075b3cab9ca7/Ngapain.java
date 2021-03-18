import java.util.*;

class restricted_area {
    public static void main(String args[]) {
        restricted_area restrict = new restricted_area();
        Scanner scanner = new Scanner(System.in);
        System.out.print("What are you doing here? ");
	String userInput = scanner.next();
	String input = userInput.substring("forestyCTF{".length(),userInput.length()-1);
	if (restrict.checkPassword(input)) {
	    System.out.println("Access granted.");
	} else {
	    System.out.println("Access denied!");
	}
    }


    public boolean checkPassword(String password) {
        return password.length() == 32 &&
               password.charAt(0)  == 's' &&
               password.charAt(29) == 'd' &&
               password.charAt(4)  == 'd' &&
               password.charAt(2)  == '0' &&
               password.charAt(23) == 'r' &&
               password.charAt(3)  == 'P' &&
               password.charAt(17) == 'S' &&
               password.charAt(1)  == 't' &&
               password.charAt(7)  == 'N' &&
               password.charAt(10) == '0' &&
               password.charAt(5)  == 'O' &&
               password.charAt(9)  == 's' &&
               password.charAt(11) == '3' &&
               password.charAt(15) == 'N' &&
               password.charAt(8)  == '6' &&
               password.charAt(12) == 'T' &&
               password.charAt(20) == 'P' &&
               password.charAt(14) == 'i' &&
               password.charAt(6)  == '1' &&
               password.charAt(24) == '5' &&
               password.charAt(18) == 'T' &&
               password.charAt(13) == 'H' &&
               password.charAt(19) == 'u' &&
               password.charAt(21) == 'I' &&
               password.charAt(16) == 'G' &&
               password.charAt(27) == 'g' &&
               password.charAt(30) == 'L' &&
               password.charAt(25) == '_' &&
               password.charAt(22) == 'd' &&
               password.charAt(28) == 'u' &&
               password.charAt(26) == '9' &&
               password.charAt(31) == 'c';
    }
}
