import java.util.Scanner;
public class App{
    public static void main(String[] args) {
       
        int n1;
        int n2;
        int soma;
         
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: "); 

        n1 = teclado.nextInt();

        System.out.print("Agora, digite o segundo valor: "); 

        n2 = teclado.nextInt();
        
        soma= n1 + n2;

        System.out.print("O Resultado da soma é: " + soma);
    


        teclado.close();

    }




}