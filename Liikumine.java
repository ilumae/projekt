import java.util.Scanner;

public class Liikumine{
	
public void Liikumine (){
	
	Scanner sisend=new  Scanner(System.in);
	String myline=sisend.nextLine();
	
	if (myline=="i") {
		v=v+1;
		
		//System.out.println("p›hja");
		
		
	}
	
	else if (myline=="k"){
		
		v=v-1;
		
		
	}
	
	else if (myline=="j"){
		
		h=h-1;
	}
	
	else if (myline=="l") {
		h=h+1;
		
	}
	
	
	
} 

}