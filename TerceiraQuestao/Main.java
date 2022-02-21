import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        String palavra;
        Scanner ler = new Scanner(System.in); 
        System.out.println("Entre com a palavra Palavra");
        palavra = ler.nextLine();
        ler.close();
        VerificarAnagrama(palavra);
    }
    static void VerificarAnagrama(String palavra){

        HashMap<String, Integer> map= new HashMap<>();
  
        int tam= palavra.length();
        for(int i = 0; i < tam; i++){
            for(int j = i; j < tam; j++){
                char[] valC = palavra.substring(i, j+1).toCharArray();
                Arrays.sort(valC);
                String val = new String(valC);
                if (map.containsKey(val)) 
                  map.put(val, map.get(val)+1);
                else 
                  map.put(val, 1);
            }
        }
        int anagrama = 0;
        for(String key: map.keySet()){
            int n = map.get(key);
            anagrama += (n * (n-1))/2;
        }
        System.out.println(anagrama);
    }
}