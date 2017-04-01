package by.htp.banksystem.functional;
import by.htp.banksystem.entityClient.*;
import by.htp.banksystem.entityAccount.*;

public class OutputOfData {

	public static void printAllClient(Client [] client ) {
		int quantityClient=0;
		int quantityAcc=0;
		int n;
		double summaAll=0.0; 
		double summaPol=0.0;
		double summaOtr=0.0;
		double balance;
		Account [] account;
		
		if (client != null) {
			client = DataProcessing.clearClient(client);
			quantityClient = client.length;
			for(int i = 0; i<quantityClient; i++){
				if (client[i] != null) {
					System.out.println("ÈÌß ÊËÈÅÍÒÀ: " + client[i].getNameClient()+ ", òèï êëèåíòà: "+ client[i].getTypeClient());
					account = client[i].getAccount();
					account = DataProcessing.clearAccount(account);
					n=account.length;
					summaAll=0.0;
					summaPol=0.0;
					summaOtr=0.0;
					for (int j = 0; j<n; j++){
						if (account[j]!=null) {
							quantityAcc++;
							balance=account[j].getBalance(); 
							summaAll = summaAll + balance;
							System.out.println(" "+quantityAcc+" ñ÷åò - íîìåð ñ÷åòà: "+account[j].getNamberAccount()+", òèï ñ÷åòà: "+ account[j].getTypeAccount()+", áëîêèðîâêà: "+account[j].isStatusBlock()+  ", áàëàíñ: "+balance);
						if(balance>0){
							summaPol = summaPol+balance;
						}
						if(balance<0){
							summaOtr = summaOtr+balance;
						}
						}
					}
					quantityAcc=0; 
					System.out.println("   Îáùèé áàëàíñ íà âñå ñ÷åòàõ: "+ summaAll+"; áàëàíñ íà ñ÷åòàõ ñ ïîëîæèòåëüíûì îñòàòêîì: "+summaPol+"; áàëàíñ íà ñ÷åòàõ ñ îòðèöàòåëüíûì îñòàòêîì: "+summaOtr);
				}
				
			}
			printLine();
		}
	}
	public static void printClient (Client [] client, int namberClient){
		int quantityAcc=0;
		int n;
		double summaAll=0.0; 
		double summaPol=0.0;
		double summaOtr=0.0;
		double balance;
		Account [] account;
		int namberCli; 
		namberCli = namberClient-1;
		if (client != null) {
				if (client[namberCli] != null) {
					System.out.println("Èìÿ êëèåíòà: " + client[namberCli].getNameClient()+ ", òèï êëèåíòà: "+ client[namberCli].getTypeClient());
					account = client[namberCli].getAccount();
					account = DataProcessing.clearAccount(account);
					n=account.length;
					summaAll=0.0;
					summaPol=0.0;
					summaOtr=0.0;
					for (int j = 0; j<n; j++){
						if (account[j]!=null) {
							quantityAcc++;
							balance=account[j].getBalance(); 
							summaAll = summaAll + balance;
							System.out.println(" "+quantityAcc+" ñ÷åò - íîìåð ñ÷åòà: "+account[j].getNamberAccount()+", òèï ñ÷åòà: "+ account[j].getTypeAccount()+", áëîêèðîâêà: "+account[j].isStatusBlock()+  ", áàëàíñ: "+balance);
						if(balance>0){
							summaPol = summaPol+balance;
						}
						if(balance<0){
							summaOtr = summaOtr+balance;
						}
						}
					}
					quantityAcc=0; 
					System.out.println("   Îáùèé áàëàíñ íà âñå ñ÷åòàõ: "+ summaAll+"; áàëàíñ íà ñ÷åòàõ ñ ïîëîæèòåëüíûì îñòàòêîì: "+summaPol+"; áàëàíñ íà ñ÷åòàõ ñ îòðèöàòåëüíûì îñòàòêîì: "+summaOtr);
				}
				
		}
	}
	public static void printNewClient(){
		System.out.println("ÇÀÐÅÃÈÑÒÐÈÐÎÂÀÍ ÍÎÂÛÉ ÊËÈÅÍÒ: ");
	}
	public static void printSearCliName(String nameClient){
		if (("").equals(nameClient)==false) {
			System.out.println("ÐÅÇÓËÜÒÀÒÛ ÏÎÈÑÊÀ ÏÎ ÇÀÏÐÎÑÓ "+ "\""+nameClient+"\""+":");
		}
	}
	public static void searchCliName(Client [] client, String nameClient){
		int quantityClient;
		int s=0;
		String name;
		if ((("").equals(nameClient)==false)&&(client!=null)) {
			client = DataProcessing.clearClient(client);
			quantityClient = client.length;
			for(int i = 0; i<quantityClient; i++){
				name = client[i].getNameClient();
				if (nameClient.equals(name)){
					printClient (client, i+1); 
					s++;
				}
				
			}
			
		}
		if (s==0) {
			System.out.println("ÏÎÈÑÊ ÍÅ ÄÀË ÐÅÇÓËÜÀÒÎÂ");
		}
		printLine();
	}
	
	public static void searCliType(Client [] client,String typeCl){
		
		int quantityClient;
		int s=0;
		String name;
		System.out.println("ÏÎÈÑÊ ÏÎ ÇÀÄÀÍÍÎÌÓ ÒÈÏÓ ÊËÈÅÍÒÀ - "+typeCl+":");
		if ((("").equals(typeCl)==false)&&(client!=null)) {
			client = DataProcessing.clearClient(client);
			quantityClient = client.length;
			for(int i = 0; i<quantityClient; i++){
				name = client[i].getTypeClient();
				if (typeCl.equals(name)){
					printClient (client, i+1); 
					s++;
				}
				
			}
			
		}
		if (s==0) {
			System.out.println("ÏÎÈÑÊ ÍÅ ÄÀË ÐÅÇÓËÜÒÀÒÎÂ");
		}
		printLine();
		
	}
	public static void searchAccount(int namberAcc){
		if (namberAcc!=0) {
			System.out.println("ÐÅÇÓËÜÒÀÒÛ ÏÎÈÑÊÀ ÏÎ ÍÎÌÅÐÓ Ñ×ÅÒÀ - "+ "\""+namberAcc+"\""+":");
		}
	}
	public static void printLine(){
		System.out.println("---------------------------------------------------------------------------");
	}
	public static void prntAccount(Client [] client, Account[] account, int a, int b){
		if ((client!=null)&(account!=null)) {
		System.out.println("Âëàäåëåö: "+client[a].getNameClient()+", òèï êëèåíòà: "+client[a].getTypeClient()+", íîìåð ñ÷åòà: "+account[b].getNamberAccount()+", òèï ñ÷åòà: "+account[b].getTypeAccount()+", áëîêèðîâêà: "+account[b].isStatusBlock()+ ", áàëàíñ: "+account[b].getBalance());
		}
		}
	public static void printNamAcc(){
		System.out.println("Ñ÷åòà ñ òàêèì íîìåðîì íå íàéäåíî");
	}
	public static void noBlock(){
		System.out.println("Ñ÷åòà íå íàéäåí, áëîêèðîâêà íå âûïîëíåíà");
	}
	public static void printBlock(){
		System.out.println("Ñ×ÅÒ ÇÀÁËÎÊÈÐÎÂÀÍ!!!");
	}
}