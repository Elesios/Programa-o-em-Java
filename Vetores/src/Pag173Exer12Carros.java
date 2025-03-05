import java.util.Random;


public class Pag173Exer12Carros {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		String[] carros ={"Uno","Corolla","Celta","Gol","Fusca"};
		float[] consumo = new float[5];
		
		for(int i = 0; i < 5 ; i++ ) {
			System.out.println("Carro Modelo:"+ carros[i]);
			consumo[i] = rand.nextFloat(15) + 10;
		}
		
		
		
		
	}
	
}
