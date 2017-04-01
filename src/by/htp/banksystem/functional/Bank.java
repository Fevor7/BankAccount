package by.htp.banksystem.functional;
import by.htp.banksystem.entityAccount.*;
import by.htp.banksystem.functional.DataProcessing;
import by.htp.banksystem.entityClient.*;

public class Bank {
	public static final int NUMBER = 3;
	private static Client [] client;
	private static Account [] account;
	private static int namberAccount=187451;
	private static int namberClient=0;
	private static int sizeArrClient = 5;
	
	public static void  initializationBank(){
		
		client = new Client [sizeArrClient];
		client[namberClient] = new IndividualClient();
		client[namberClient].setNameClient("Vasya");
		account = new Account[5];
		account[0] = new CreditHome();
		namberAccount++;
		account[0].setNamberAccount(namberAccount);
		account[0].setBalance(-2500.0);
		account[1] = new DebitCardAcc();
		namberAccount++;
		account[1].setNamberAccount(namberAccount);
		account[1].setBalance(1500.0);
		account[2] = new DebitCardAcc();
		namberAccount++;
		account[2].setNamberAccount(namberAccount);
		account[2].setBalance(1800.0);
		client[namberClient].setAccount(account);
		namberClient++;
		
		client[namberClient] = new LegalEntity();
		client[namberClient].setNameClient("Petya");
		account = new Account[5];
		account[0] = new CreditHome();
		namberAccount++;
		account[0].setNamberAccount(namberAccount);
		account[0].setBalance(-3500.0);
		account[1] = new DebitCardAcc();
		namberAccount++;
		account[1].setNamberAccount(namberAccount);
		account[1].setBalance(5500.0);
		client[namberClient].setAccount(account);
		OutputOfData.printAllClient(client);
		namberClient++;
	}

	public static void prntAllClient (){
		OutputOfData.printAllClient(client);
	}
	public static void newClient(String Name, String typeClient, String typeAccount, double balance ){
		//Checking the size of the array of clients
		int size; 
		size = client.length+1;
		if ((size - namberClient)<NUMBER) {
			client = DataProcessing.IncreasArr(client);
		}
		if (("LegalEntity").equals(typeClient)) {
			client[namberClient] = new LegalEntity();
		} else {
		if (("IndividualClient").equals(typeClient)) {
			client[namberClient] = new IndividualClient();
		  }  else {
			  client[namberClient] = new IndividualClient();
		  }
		}
		client[namberClient].setNameClient(Name); 
		account = new Account[5];
		if (("CreditHome").equals(typeAccount)) {
			account[0] = new CreditHome();
		} else {
		if (("DebitCardAcc").equals(typeAccount)) {
			account[0] = new DebitCardAcc();
		  }  else {
			  account[0] = new DebitCardAcc();
		  }
		}
		account[0].setBalance(balance);
		namberAccount++;
		account[0].setNamberAccount(namberAccount);
		client[namberClient].setAccount(account);
		namberClient++;
		OutputOfData.printNewClient();
		OutputOfData.printClient(client,namberClient);
		// OutputOfData.printAllClient(client);
		OutputOfData.printLine();
	}
	public static void searchCliName(String nameClient) {
		if (("").equals(nameClient)==false) {
			OutputOfData.printSearCliName(nameClient);
			OutputOfData.searchCliName(client, nameClient);
		}
		
	}
	public static void searchTypeCl(String typeClient) {
		if (("").equals(typeClient)==false) {
			OutputOfData.searCliType(client, typeClient);
		}
	}
	public static void searchAccount(int namberAccount){
		OutputOfData.searchAccount(namberAccount);
		DataProcessing.searchAccount(client, namberAccount);
	}
	public static void blockAccount(int namberAccount){
		if (namberAccount>0) {
		DataProcessing.blockAccount(client, namberAccount);
		
		}
	}
}

