package by.htp.banksystem.launch;
import by.htp.banksystem.launch.Inspector;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Start.bankingSystem(); // Start banking system.
			Person.addClient();    // Adding a new client
			Inspector.searchCliName(); // Print client;
			Inspector.searchTypeCl();
			Inspector.searchAccount();
			Inspector.blockAccount();
			Inspector.printClient();
	}

}
