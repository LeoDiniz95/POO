/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 0040481422033
 */
public class ContaPoupanca extends Conta{

    @Override
    public void ImprimeExtrato() {
        
        System.out.println("##################################");
        System.out.println("###     Extrato da Conta       ###");
        System.out.println("##################################");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        
        System.out.format("Saldo: %.2f\n",getSaldo());
        System.out.println("Data: "+sdf.format(date));
    }
    
}
