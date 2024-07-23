import java.time.LocalDate;
import java.util.Scanner;
public class Javando
{
	public static void main(String[] args) {
	    
	   LocalDate hoje = LocalDate.now();
	   System.out.println(hoje);
	   Scanner  sc = new Scanner(System.in);
	   System.out.println("Digite seu Nome:");
	   String nome = sc.nextLine();
	   System.out.println("Bem vindo(a)" +nome);
	   
	 
	   System.out.println("Informe sua principal atividade:");
	   String cargo = sc.nextLine();
	   System.out.println("Seu setor: " +cargo);
	   
	   System.out.println("Informe o Andar:");
	   int andar = sc.nextInt();
	   System.out.println("O andar é : " +andar);
	   
	   
	   
	   System.out.println("Teste sua Matemática:");
	   System.out.println("Informe o primeiro Valor:");
	   int valorA =sc.nextInt(); 
	   
	   System.out.println("Informe o Segundo Valor:");
	   
	   int ValorB =sc.nextInt();
	   int soma = valorA + ValorB;
	   
	   
	   System.out.println("A soma Total é :" +soma) ;
	   
	
	
		  
	}    
}
