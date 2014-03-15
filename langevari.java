import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class langevari {
	
	


	
	public static void langevari() {
		Random randomno=new Random();
		String [] valik = {"energiajook", "pakk tuletikke", "nuga"};
		
		String asi =valik[randomno.nextInt(valik.length)];
		 if (asi.equals("energiajook")) {
		 
			 System.out.printf("Märkad taevast langevat väikest langevarju, mis maandub sinust veidi eemal. Korjad selle üles ja avad pakendi. Sees on:\n -energiajook\n ");
		//siin oleks vaja nüüd elusid lisada. kuidas me seda lahendame? äkki teha eluks eraldi klass, kus on meetod, et võtab vähemaks või pane juurde?	 
		 }
		
		 else if (asi.equals("pakk tuletikke"))
		{ //selliste asjade jaoks peaks inventory olema..
			 //äkki peaks lihtsustama ja ainult toitu kaasa andma? 
			 	System.out.printf("Märkad taevast langevat väikest langevarju, mis maandub sinust veidi eemal. Korjad selle üles ja avad pakendi. Sees on:\n -pakk tuletikke\n  ");}
		else if (asi.equals("nuga")) {
			 	System.out.printf("Märkad taevast langevat väikest langevarju, mis maandub sinust veidi eemal. Korjad selle üles ja avad pakendi. Sees on:\n -hea terav nuga\n ");}
			
		}
		 
	public static void metsamari() {
		double juh=Math.random()*10+1;
		System.out.printf("Ühel põõsal kasvavad isuäratavad valged marjad. Sa pole selliseid varem näinud ja see ei tundu olevat nende loomulik kasvukoht.\n "
				+ "Proovid marju -vajuta [s].\n Lähedas edasi - vajuta [e].\n ");
		Scanner scan=new Scanner(System.in);
		String sisend=scan.nextLine();

		if (sisend.equals("s")){
			try{
				TimeUnit.MILLISECONDS.sleep(700);
				}
				catch (InterruptedException e){
					System.out.println("");;
				}
			if (juh<=5){
				
			System.out.println("Enesetunne läheb kehvaks..."); // siin peaks elusid vähemaks v6tma
			 }
			else 
				System.out.printf("Täitsa maitsev mari ju..enesetunne läheb tükk maad paremaks\n");
			
				
			}
		
		if (sisend.equals("e")) 
		{System.out.println("Liigud edasi");}
		
		
	}
		 

		
	
	
	
	
	public static void main(String[] args) {
		langevari();
		metsamari();
		// TODO Auto-generated method stub

	}
}
