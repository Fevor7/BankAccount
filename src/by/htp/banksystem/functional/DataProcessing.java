package by.htp.banksystem.functional;
import by.htp.banksystem.entityAccount.*;
import by.htp.banksystem.entityClient.*;

public class DataProcessing {
	public static Client []  IncreasArr( Client [] client ){
		int length;
		length = client.length;
		 Client [] client2 = new Client [length+7];
		 for (int i = 0; i<length; i++){
			 client2[i]=client[i];
		 }
		 
		return client2; 
	}
public static Client []  clearClient(Client [] client){
	int size;
	int g=1;
	size = client.length;
	
	if (client != null) {
		for (int i = 1; i<size; i++ ) {
			if ((client[i]==null)&&(client[i-1]==null)) {
				g=i-1; 
				break;
			}
		}
		Client [] client2 = new Client [g];
		for (int i = 0; i<g; i++ ) {
				client2[i]=client[i];
			}
		client=client2;
	}
	return client;
}
public static Account[]  clearAccount(Account [] account){
	int size;
	int g=1;
	size = account.length;
	
	if (account != null) {
		for (int i = 1; i<size; i++ ) {
			if ((account[i]==null)&&(account[i-1]==null)) {
				g=i-1;
				break;
			}
		}
		Account[] account2 = new Account [g];
		for (int i = 0; i<g; i++ ) {
			account2[i]=account[i];
			}
		account=account2;
	}
	return account;
}
public static void searchAccount(Client[] client, int namberAccount){
	int quantityClient=0;
	int n;
	int search=0;
	int namberAcc;
	Account [] account;
	
	if (client != null) {
		client = clearClient(client);
		quantityClient = client.length;
		for(int i = 0; i<quantityClient; i++){
			if (client[i] != null) {
				account = client[i].getAccount();
				account = DataProcessing.clearAccount(account);
				n=account.length;
				for (int j = 0; j<n; j++){
					if (account[j]!=null) {
						namberAcc=account[j].getNamberAccount();
						if (namberAcc==namberAccount) {
							search++;
							OutputOfData.prntAccount(client, account, i, j);
						}
					}
				}
			}
			
		}
		
	}
	if (search==0){
		OutputOfData.printNamAcc();
	}
	OutputOfData.printLine();
}
public static void blockAccount(Client[] client, int namberAccount){
	int quantityClient=0;
	int n;
	int search=0;
	int namberAcc;
	Account [] account;
	
	if (client != null) {
		client = clearClient(client);
		quantityClient = client.length;
		for(int i = 0; i<quantityClient; i++){
			if (client[i] != null) {
				account = client[i].getAccount();
				account = DataProcessing.clearAccount(account);
				n=account.length;
				for (int j = 0; j<n; j++){
					if (account[j]!=null) {
						namberAcc=account[j].getNamberAccount();
						if (namberAcc==namberAccount) {
							search++;
							account[j].setStatusBlock(true);
							OutputOfData.prntAccount(client, account, i, j);
						}
					}
				}
			}
			
		}
		
	}
	if (search==0){
		OutputOfData.noBlock(); 
	} else {
		OutputOfData.printBlock();
	}
	OutputOfData.printLine();
}

}
