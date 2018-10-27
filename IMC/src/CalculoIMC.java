
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0040481422033
 */
public class CalculoIMC {
    
    private double formula, peso, altura;

    
    /************************************
    *            CONSTRUTORES           *
    ************************************/
    public CalculoIMC() {
    }

    public CalculoIMC(double formula, double peso, double altura) {
        this.formula    = formula;
        this.peso       = peso;
        this.altura     = altura;
    }
    
    public CalculoIMC(double peso, double altura){
        this.peso       =   peso;
        this.altura     =   altura;
    }
    
    /************************************
    *             SETTERS               *
    ************************************/
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setFormula(double formula) {
        this.formula = formula;
    }

    /************************************
    *             GETTERS               *
    ************************************/
    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double getFormula() {
        return formula;
    }
    
    
    /*******************************************
    *             CÁLCULO DO IMC               *
    *******************************************/
    public void Calculo(){
        
        DecimalFormat format = new DecimalFormat("0.0#");
        
        //Tenham colocado o peso ou a altura com número negativo.
        if( peso < 0){
            peso  =  0;
        }else if( altura < 0){
            altura = 0;
        }
        
        /**
        * Se altura for igual a 0 não será possível realizar o cálculo,
        * pois não existe divisão por 0.
        **/
        if( altura != 0){
            //formula = peso/(altura*altura);
            formula = peso/Math.pow(altura,2);// Calculo do IMC da pessoa
            
            //Resultados de acordo com a formula
            if(formula <= 18.4){
                
                System.out.println("Abaixo do peso.\nResultado: "+ format.format(formula));
                
            }else if(formula > 18.4 && formula <= 24.9){
                
                System.out.println("Peso ideal.\nResultado: "+ format.format(formula));
                
            }else if(formula > 24.9 && formula <= 29.9){
                
                System.out.println("Acima do peso.\nResultado: "+ format.format(formula));
                
            }else if(formula > 29.9 && formula <= 34.9){
                
                System.out.println("Obesidade leve.\nResultado: "+ format.format(formula));
                
            }else{
                System.out.println("Obesidade.\n Resultado: "+formula);
            }
        }else
        {
            System.out.println("Não é possível fazer o cálculo, pois a altura foi digitada igual a '0' sendo\n"
                    + "que ela é utilizada na divisão.");
        }
        
    }
    
    
}
