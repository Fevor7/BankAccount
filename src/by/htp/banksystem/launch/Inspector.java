package by.htp.banksystem.launch;
import by.htp.banksystem.functional.Bank;

public class Inspector {
	public static void printClient(){

		Bank.prntAllClient();
	}
	public static void searchCliName(){
		Bank.searchCliName("Petya");
	}
	public static void searchTypeCl(){
		Bank.searchTypeCl("физическое лицо");
	}
	
	public static void searchAccount(){
		Bank.searchAccount(187457);
	}
	public static void blockAccount(){
		Bank.blockAccount(187455);
	}
	
}