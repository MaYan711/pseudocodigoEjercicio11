import java.util.*;

public class Ejercicio11 {

	public static void main (String[] args) {
		int conta = 0, contI = 0, impar = 0, suma = 0, may = 0, num;
		double par = 0;
		for (int i = 0; i < 10; i++){
			num = (int)(Math.random() * 36) + 1;
			if(num % 2 == 2 && num !=0){
				contI++;
				suma += num;
				par = suma / conta;
			} 
			else {
				impar++;
			}
			if (num > 12 && num < 25) {
				conta++;
			}
			if (may < num){
				may = num;
			}
		}
		System.out.println("De los 10 hay:" + impar + " ,impares");
		System.out.println("Hay" + par + " ,pares");
		System.out.println("Hay" + conta + "entre 13 y 24");
		System.out.println("Y el numero mas grande es:" + may);
	}
}