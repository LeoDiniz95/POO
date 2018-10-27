package enterprise;

import java.util.Scanner;

/**
 *
 * @author 0040481422033
 */
public class Main {
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int quantLoop = 3;
        int quantLoop1 = quantLoop+2;
        
        
        Scanner s = new Scanner(System.in);
        
        Pessoa pessoa[];
        
        try{
            
        pessoa = new Pessoa[quantLoop];
        
            for(int i=0; i<quantLoop1; i++){
            
                System.out.println("Digite o nome: ");
                String nome = s.next();
                System.out.println("Digite o sobrenome: ");
                String sobrenome = s.next();
            
                pessoa[i] = new Pessoa(sobrenome,nome);
            }
        
            for(int i = 0;i<quantLoop1;i++){
                System.out.println("\n\n\n\n"+pessoa[i].getFullName());
            }
            
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array não criado ainda:\n"+e);
        }catch(ArrayStoreException e){
            System.out.println("Array não criado ainda:\n"+e);
        }
    }
    
}
