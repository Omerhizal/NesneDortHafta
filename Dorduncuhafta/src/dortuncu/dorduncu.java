package dortuncu;
import java.util.Scanner;
public class dorduncu {

	public static void main(String[] args) {
		String[] soru=new String[]{"1. Hangi ulke en cok sera gazi yaymaktadir?","2.Hangi gezegenin atmosferi kuresel isinma ile yok edilmektedir?","3.Hangi tur ampul en az enerjiyi tuketir?","4.Iklim degisikligi nedeniyle yilda kac kisi olmektedir?","5.Kuresel isinmaya karsi en savunmasiz hayvan hangisidir?"};
		String[] cevap=new String[5];
		cevap[0]= "A.Cin\n"+ "B.Hindistan\n"+ "C.Amerika\n"+ "D.Japonya\n";
		cevap[1]= "A.Jupiter\n"+ "B.Venus\n" + "C.Mars\n"+ "D.Merkur\n";
		cevap[2]= "A.Akkor Ampul\n"+ "B.Halojen Ampul\n"+ "C.Kompakt Floresan Ampul\n"+"D.Led Ampul\n";
		cevap[3]= "A.1500\n"+ "B.100.000\n"+ "C.150.000\n"+ "D.500.000\n";
		cevap[4]= "A.Kar Leopari\n"+ "B.Kutup Ayisi\n"+ "C.Deniz Gergedani\n"+ "D.Tukan\n";

		int puan=0;
		
		for(int i=0;i<5; i++) {
			System.out.printf(soru[i] + "%n");
			System.out.printf(cevap[i] + "%n");
			System.out.printf("%n");
			Scanner ans = new Scanner(System.in);
			String cevap2 = ans.nextLine();
					if((i==0 && cevap2.equals("a")) ||
						(i==0 && cevap2.equals("A")) || 
						(i==1 && cevap2.equals("b")) ||
						(i==1 && cevap2.equals("B")) ||
						(i==2 && cevap2.equals("C")) ||
						(i==2 && cevap2.equals("c")) ||
						(i==3 && cevap2.equals("c")) ||
						(i==3 && cevap2.equals("C")) ||
						(i==4 && cevap2.equals("c")) ||
						(i==4 && cevap2.equals("C")) ){
						System.out.printf("DOGRU%n");
						puan=puan+1;
					}
					else {
						System.out.printf("YANLIS%n");
					}
				
						
		}
		
			if(puan==5) {
				System.out.print("MUKEMMEL");
			}
			else if(puan==4) {
				System.out.print("BRAVO");
			}
			else {
				System.out.print("DAHA COK CALISMALISINIZ");
			}
			
		
	}


}
