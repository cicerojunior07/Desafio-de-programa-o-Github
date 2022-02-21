import java.util.Scanner; // 1. importando a classe Scanner

public class Main {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner
    int n;
    System.out.printf("Informe o valor de N: ");
    n = ler.nextInt(); // Entrada de dados (lendo um valor inteiro)
    ler.close();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if(j >= (n-i-1)){ 
          System.out.print('*');
        }else{
          System.out.print(" ");
        }
      }
      System.out.print("\n");
    }
  }
}