package Comprova;
import java.util.Random;
public class Busca {

	public static void main(String[] args) {
		Random rnd = new Random();
		long time_start ,time_end;
		time_start = System.currentTimeMillis();
		int[] array = new int [500000];
		for (int i = 0; i < array.length; i++){
			array[i] = i+1;
		}
		int buscat = rnd.nextInt(500000);
		for (int i = 0; i < array.length; i++){
			if (buscat == array[i]){
				i = array.length;
			}
		}
		time_end = System.currentTimeMillis();
		System.out.println("El programa ha trigat : " + (time_end + time_start) + " mil·lisegons en trobar el numero: " + buscat);
	}

}
