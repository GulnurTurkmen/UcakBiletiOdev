package Bilet;
import java.util.Scanner;
public class Bilet {
	public static void main(String[]args){
		int yas,km,select;
		double tutar;
		Scanner inp = new Scanner(System.in);
		System.out.println("1-tek yön\n2-gidiş-dönüş");
		System.out.println("seçiminiz:");
		select = inp.nextInt();
		System.out.println("yaşınızı girin:");
		yas = inp.nextInt();
		System.out.println("km cinsinden mesafeyi girin:");
		km = inp.nextInt();
		switch(select) {
		case 1:
			if(yas<12) {
			tutar =	((0.10*km)-(0.10*km)/2);
			System.out.println("tutarınız:"+tutar);
			}
			if((12 <yas )&& (yas< 24)){
				tutar =	((0.10*km)-(0.10*km)/10);
				System.out.println("tutarınız:"+tutar);
			}
			if(yas>65){
				tutar =	((0.10*km)-(0.30*km)/10);
				System.out.println("tutarınız:"+tutar);
			}break;
		case 2:
			if(yas<12) {
				tutar =	((0.10*km)-(0.10*km)/10);
				System.out.println("tutarınız:"+tutar);
				}
				if((12 <yas )&& (yas< 24)){
					tutar =	((0.10*km)-(0.10*km)/50);
					System.out.println("tutarınız:"+tutar);
				}
				if(yas>65){
					tutar =	((0.10*km)-(0.30*km)/50);
					System.out.println("tutarınız:"+tutar);
					
				}break;
				default:
					System.out.println("hatalı veri girdiniz!");	
		}
	}

}
