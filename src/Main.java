import Prog1Tools.IOTools;

public class Main {

	public static void main(String[] args) {
		
		int i, j, login_number = 1, check = 0;
		String password = "";
		char password_muster [] = {'P', 'R', 'O', 'G'};
		
		while (login_number <= 3) {
			
			password = IOTools.readLine("Versuch N" + login_number + ". Geben Sie das Passwort ein: ");
			char password_split [] = new char [password.length()];
			
			for (i = 0; i < password.length(); i++) {
				password_split[i] = password.charAt(i);
				for (j = 0; j < password.length(); j++) {
					if (Character.toUpperCase(password_split[i]) == Character.toUpperCase(password_muster[j])) {
						check = check + 1;					
					} 
				}
			}
			
			if (check == password.length()) {
				System.out.println("Passwort ist korrekt.");
				login_number = 3;
			} else {
				System.out.println("Passwort ist nicht korrekt.");
			}
			login_number++;
			check = 0;
		}
		
	}

}
