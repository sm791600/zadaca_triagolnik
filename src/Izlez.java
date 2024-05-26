/*Da se napise programa vo koja se vcituvaat 3 realini broevi. Da se ispita dali
 * od vnesenite broevi moze da se formira triagolnik i dali istiot e pravoagolen, ostroagolen
 * ili tapoagolen.
 * Da ima dve klasi vlez (podatoci za strani, konstruktpri, set i geteri i metod rezultat
 * koj proveruva dali postoi triagolnik so zadadenite strani i izlez
 * i izlez klasa koja sodrzi main i proveruva kakov e trig spored aglite)*/

import java.util.Scanner;
public class Izlez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Scanner vnes = new Scanner(System.in);
		System.out.println("Vnesi strana a");
		double a=vnes.nextDouble();
		System.out.println("Vnesi strana b");
		double b=vnes.nextDouble();
		System.out.println("Vnesi strana c");
		double c=vnes.nextDouble();
		
		Vlez triag = new Vlez();
		triag.setA(a);
		triag.setB(b);
		triag.setC(c);
		
		if(triag.rezultat()) {
			if(a*a==b*b+c*c || b*b==a*a+c*c || c*c==a*a+b*b) {
				System.out.println("triagolnikot e pravoagolen");}
			else if(a*a<b*b+c*c && b*b<a*a+c*c && c*c<a*a+b*b) {
				System.out.println("triagolnikot e ostroagolen");}
			else System.out.println("triagolnikot e tapoagolen");
		} else {
			System.out.println("nema takov triagolnik");
		}
		
		
		
	}
}
