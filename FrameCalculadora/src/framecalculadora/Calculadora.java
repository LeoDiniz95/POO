/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framecalculadora;

/**
 *
 * @author 0040481422033
 */
public class Calculadora {

    double primeiraVariavel, segundaVariavel, total;
    char operacao;
    
    public Calculadora() {
    }

    public Calculadora(double primeiraVariavel, double segundaVariavel, char operacao) {
        this.primeiraVariavel = primeiraVariavel;
        this.segundaVariavel = segundaVariavel;
        this.operacao = operacao;
    }
    
    public double getTotal() {
        //DecimalFormat format = new DecimalFormat("0.0#");
        
        return total;
    }
    
    /******************************************
    * MÉTODO QUE CALCULA A OPERCACAO DESEJADA *
    ******************************************/
    public double CalculandoOperacoes(){
        //  SOMA
        if(operacao == '+'){
            total = primeiraVariavel + segundaVariavel;
            return getTotal();
        }
        //   SUBTRAÇÃO
        else if(operacao == '-'){
            total = primeiraVariavel - segundaVariavel;
            return getTotal();
        }
        //   MULTIPLICAÇÃO
        else if (operacao == '*'){
            total = primeiraVariavel * segundaVariavel;
            return getTotal();
        }
        //    DIVISÃO
        else if(operacao == '/'){
            //Caso ocorra uma divisao por zero, ele trata o erro
              if(segundaVariavel != 0){
                  total = primeiraVariavel / segundaVariavel;
                  return getTotal();
              }else{
                  System.out.println("Não é possível dividir por zero");
              }
        }
        //  CASO SEJA PEDIDA UMA OPERAÇÃO QUE NÃO EXISTE
        else{
            System.out.println("Operacao inexistente");
        }
        return 0;
    }
    
}
