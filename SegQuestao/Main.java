import java.util.Scanner; // 1. importando a classe Scanner
public class Main {

    public static void main(String[] args){
        
        
        String senha;
     
        Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner
        System.out.println("Digite a senha");
        senha = ler.nextLine();
        ler.close();

        char letra;
        String texto1="!@#$%^&*()-+";
        int i,resultado,tamanho,faltam;
  
        tamanho = senha.length();
        //verificar se a senha dada tem a ocorrencia pelo menos uma vez dos criterios pedidos
        int ninuscula=0, maiuscula=0,numeros=0, caractEspeciais=0;
        for(i=0;i<tamanho;i++){
            letra=senha.charAt(i);
            if('A'<=letra && letra<='Z'){
                maiuscula=1;
            }
            else if('a'<=letra && letra<='z'){
                ninuscula=1;
            }
            else if('0'<=letra && letra<='9'){
                numeros=1;
            }
            else if(texto1.indexOf(letra)>= 0){
                caractEspeciais=1;
            }

        }
        int xxx;
        
        faltam=4-(ninuscula+maiuscula+numeros+caractEspeciais);        
        xxx=tamanho-(ninuscula+maiuscula+numeros+caractEspeciais);    
       
        if(xxx>2){
          xxx=2;
        }
        resultado=faltam+(2-xxx);

        //resultado=1+(6-4-0);  Ya2
        //resultado=3+(6-4-2);  123
        //resultado=3+(6-4-2);  123456
        System.out.print("Resultado= "+resultado+"\n");
    }
}

