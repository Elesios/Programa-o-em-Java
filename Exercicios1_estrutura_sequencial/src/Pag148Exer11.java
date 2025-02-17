import java.util.Scanner;
import java.util.Random;

public class Pag148Exer11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		float carro = 0, valor_veiculo = 0, desconto = 0, juros = 0, parcela_valor = 0;	
		int parcela = 0;
		String entrada;
		
		while(true) {
			System.out.print("\nDigite o Valor do Veiculo:");
			entrada = scan.next();
				if(entrada.matches("\\d+")) {// Verifica se contém apenas números (0-9)
					carro = Float.parseFloat(entrada);// Converte para float
					//System.out.printf("\nValor digitado: %.2f", carro);
					break;
				}else {
					System.out.print("\nNumero invalido:");
					}
		
		}
		System.out.println("\n---------------------------------------:");
		System.out.println("\nSelecione a Quantidade de Parcela sendo:");
		System.out.println("00 - 20% Desconto A vista:");
		System.out.println("06 Parcelas:");
		System.out.println("12 Parcelas:");
		System.out.println("18 Parcelas:");
		System.out.println("24 Parcelas:");
		System.out.println("30 Parcelas:");
		System.out.println("36 Parcelas:");
		System.out.println("42 Parcelas:");
		System.out.println("48 Parcelas:");
		System.out.println("56 Parcelas:");
		System.out.println("60 Parcelas:");
		
		while(true) {
			System.out.print("\nDigite a Parcela:");
			entrada = scan.next();
				if(entrada.matches("\\d+")) {// Verifica se contém apenas números (0-9)
					parcela = Integer.parseInt(entrada);;// Converte para float
					if(parcela == 0 || parcela == 6 || parcela == 12 || parcela == 19 || parcela == 24  
							|| parcela == 30 || parcela == 36 || parcela == 42 || parcela == 48
							|| parcela == 56 || parcela == 60) {
					//	System.out.printf("\nParcela Digitada: %d", parcela);
						break;
					}else {
						System.out.print("\nNumero invalido:");						
						}
				}else {
					System.out.print("\nNumero invalido:");					
				}
			
		}
		switch (parcela) {
			case 0:{
				 desconto = (carro * 20)/100;	
				 valor_veiculo = carro - desconto;
				 System.out.printf("\nValor do veiculo: %.2f", carro);
				 System.out.printf("\nPagamento a Vista 20% de desconto:");
				 System.out.printf("\nvalor do desconto: %.2f", desconto);
				 System.out.printf("\nvalor final do veiculo: %.2f", valor_veiculo);	
				 break;
			}
			case 6:{
				 juros = carro * 0.03f;	
				 valor_veiculo = carro + juros;
				 parcela_valor = valor_veiculo / parcela;
				 System.out.printf("\nValor do veiculo: %.2f", carro);
				 System.out.printf("\nQuantidade de Parcelas: %d", parcela);
				 System.out.printf("\nValor das Parcelas: %.2f", parcela_valor);
				 System.out.printf("\nvalor do juros: %.2f", juros);
				 System.out.printf("\nvalor final do veiculo: %.2f", valor_veiculo);	
				 break;
			}
			case 12:{
				 juros = carro * 0.06f;	
				 valor_veiculo = carro + juros;
				 parcela_valor = valor_veiculo / parcela;
				 System.out.printf("\nValor do veiculo: %.2f", carro);
				 System.out.printf("\nQuantidade de Parcelas: %d", parcela);
				 System.out.printf("\nValor das Parcelas: %.2f", parcela_valor);
				 System.out.printf("\nvalor do juros: %.2f", juros);
				 System.out.printf("\nvalor final do veiculo: %.2f", valor_veiculo);	
				 break;
			}
			case 18:{
				 juros = carro * 0.09f;	
				 valor_veiculo = carro + juros;
				 parcela_valor = valor_veiculo / parcela;
				 System.out.printf("\nValor do veiculo: %.2f", carro);
				 System.out.printf("\nQuantidade de Parcelas: %d", parcela);
				 System.out.printf("\nValor das Parcelas: %.2f", parcela_valor);
				 System.out.printf("\nvalor do juros: %.2f", juros);
				 System.out.printf("\nvalor final do veiculo: %.2f", valor_veiculo);	
				 break;
			}
			case 24:{
				 juros = carro * 0.12f;	
				 valor_veiculo = carro + juros;
				 parcela_valor = valor_veiculo / parcela;
				 System.out.printf("\nValor do veiculo: %.2f", carro);
				 System.out.printf("\nQuantidade de Parcelas: %d", parcela);
				 System.out.printf("\nValor das Parcelas: %.2f", parcela_valor);
				 System.out.printf("\nvalor do juros: %.2f", juros);
				 System.out.printf("\nvalor final do veiculo: %.2f", valor_veiculo);	
				 break;
			}
			case 30:{
				 juros = carro * 0.15f;	
				 valor_veiculo = carro + juros;
				 parcela_valor = valor_veiculo / parcela;
				 System.out.printf("\nValor do veiculo: %.2f", carro);
				 System.out.printf("\nQuantidade de Parcelas: %d", parcela);
				 System.out.printf("\nValor das Parcelas: %.2f", parcela_valor);
				 System.out.printf("\nvalor do juros: %.2f", juros);
				 System.out.printf("\nvalor final do veiculo: %.2f", valor_veiculo);	
				 break;
			}
			case 36:{
				 juros = carro * 0.18f;	
				 valor_veiculo = carro + juros;
				 parcela_valor = valor_veiculo / parcela;
				 System.out.printf("\nValor do veiculo: %.2f", carro);
				 System.out.printf("\nQuantidade de Parcelas: %d", parcela);
				 System.out.printf("\nValor das Parcelas: %.2f", parcela_valor);
				 System.out.printf("\nvalor do juros: %.2f", juros);
				 System.out.printf("\nvalor final do veiculo: %.2f", valor_veiculo);	
				 break;
			}
			case 42:{
				 juros = carro * 0.21f;	
				 valor_veiculo = carro + juros;
				 parcela_valor = valor_veiculo / parcela;
				 System.out.printf("\nValor do veiculo: %.2f", carro);
				 System.out.printf("\nQuantidade de Parcelas: %d", parcela);
				 System.out.printf("\nValor das Parcelas: %.2f", parcela_valor);
				 System.out.printf("\nvalor do juros: %.2f", juros);
				 System.out.printf("\nvalor final do veiculo: %.2f", valor_veiculo);	
				 break;
			}
			case 48:{
				 juros = carro * 0.24f;	
				 valor_veiculo = carro + juros;
				 parcela_valor = valor_veiculo / parcela;
				 System.out.printf("\nValor do veiculo: %.2f", carro);
				 System.out.printf("\nQuantidade de Parcelas: %d", parcela);
				 System.out.printf("\nValor das Parcelas: %.2f", parcela_valor);
				 System.out.printf("\nvalor do juros: %.2f", juros);
				 System.out.printf("\nvalor final do veiculo: %.2f", valor_veiculo);	
				 break;
			}
			case 56:{
				 juros = carro * 0.27f;	
				 valor_veiculo = carro + juros;
				 parcela_valor = valor_veiculo / parcela;
				 System.out.printf("\nValor do veiculo: %.2f", carro);
				 System.out.printf("\nQuantidade de Parcelas: %d", parcela);
				 System.out.printf("\nValor das Parcelas: %.2f", parcela_valor);
				 System.out.printf("\nvalor do juros: %.2f", juros);
				 System.out.printf("\nvalor final do veiculo: %.2f", valor_veiculo);	
				 break;
			}
			case 60:{
				 juros = carro * 0.30f;	
				 valor_veiculo = carro + juros;
				 parcela_valor = valor_veiculo / parcela;
				 System.out.printf("\nValor do veiculo: %.2f", carro);
				 System.out.printf("\nQuantidade de Parcelas: %d", parcela);
				 System.out.printf("\nValor das Parcelas: %.2f", parcela_valor);
				 System.out.printf("\nvalor do juros: %.2f", juros);
				 System.out.printf("\nvalor final do veiculo: %.2f", valor_veiculo);	
				 break;
			}
			default:
				break;
		
			}
	}	
}
