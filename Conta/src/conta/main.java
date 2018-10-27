/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;

/**
 *
 * @author 0040481422033
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaPoupanca cp = new ContaPoupanca();
        
        cp.setSaldo(15.53);
        
        cp.ImprimeExtrato();
    }
    
}
