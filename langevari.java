import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class langevari {
	
	


	
	public static void langevari() {
		Random randomno=new Random();
		String [] valik = {"energiajook", "pakk tuletikke", "nuga"};
		
		String asi =valik[randomno.nextInt(valik.length)];
		 if (asi.equals("energiajook")) {
		 
			 System.out.printf("M�rkad taevast langevat v�ikest langevarju, mis maandub sinust veidi eemal. Korjad selle �les ja avad pakendi. Sees on:\n -energiajook\n ");
		//siin oleks vaja n��d elusid lisada. kuidas me seda lahendame? �kki teha eluks eraldi klass, kus on meetod, et v�tab v�hemaks v�i pane juurde?	 
		 }
		
		 else if (asi.equals("pakk tuletikke"))
		{ //selliste asjade jaoks peaks inventory olema..
			 //�kki peaks lihtsustama ja ainult toitu kaasa andma? 
			 	System.out.printf("M�rkad taevast langevat v�ikest langevarju, mis maandub sinust veidi eemal. Korjad selle �les ja avad pakendi. Sees on:\n -pakk tuletikke\n  ");}
		else if (asi.equals("nuga")) {
			 	System.out.printf("M�rkad taevast langevat v�ikest langevarju, mis maandub sinust veidi eemal. Korjad selle �les ja avad pakendi. Sees on:\n -hea terav nuga\n ");}
			
		}
		 
	public static void metsamari() {
		double juh=Math.random()*10+1;
		System.out.printf("�hel p��sal kasvavad isu�ratavad valged marjad. Sa pole selliseid varem n�inud ja see ei tundu olevat nende loomulik kasvukoht.\n "
				+ "Proovid marju -vajuta [s].\n L�hedas edasi - vajuta [e].\n ");
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
				
			System.out.println("Enesetunne l�heb kehvaks..."); // siin peaks elusid v�hemaks v6tma
			 }
			else 
				System.out.printf("T�itsa maitsev mari ju..enesetunne l�heb t�kk maad paremaks\n");
			
				
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
