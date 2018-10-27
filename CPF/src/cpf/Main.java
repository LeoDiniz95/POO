/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpf;

import java.util.Scanner;

/**
 *
 * @author 0040481422033
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite o seu cpf");
        String cpf = s.next();
        
        int total   = 0;
        int peso    = 2;
        int dv1     = 0;
        int dv2     = 0;
        
        for (int i = 8; i>=0; i--){
            total += Integer.parseInt(cpf.substring( i, i+1)) * peso;
            peso++;
        }
        dv1 = total % 11;
        
        
        if  (dv1 < 2){
            dv1 = 0;
        }   else{
            dv1 = 11 - dv1;
        }
        
        peso = 2;
        total = 0;
        
        for (int i = 9; i>=0; i--){
            if(i == 9){
                total += dv1 * peso;
            }
            else{
                total += Integer.parseInt(cpf.substring( i, i+1)) * peso;
            }
            peso++;
        }
        
        dv2 = total % 11;
        
        
        if  (dv2 < 2){
            dv1 = 0;
        }   else{
            dv2 = 11 - dv2;
        }
        
        System.out.println("CPF: "+cpf);
        System.out.println("DV1: "+ dv1 +"\nDV2: "+ dv2);
        
        if( ( dv1 == Integer.parseInt(cpf.substring(9,10)) ) && ( dv2 == Integer.parseInt(cpf.substring(10,11)) ) ){
            System.out.println("Cpf True");
        }   else{
            System.out.println("Cpf False");
        }
            
        
     }
        
}
