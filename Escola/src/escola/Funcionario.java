/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

/**
 *
 * @author 0040481422033
 */
public class Funcionario extends Pessoa {
    protected double salHora;
    protected int quantHoras;

    public Funcionario() {
    }
    
    public Funcionario(double salHora, int quantHoras) {
        this.salHora = salHora;
        this.quantHoras = quantHoras;
    }

    public Funcionario(double salHora, int quantHoras, String rg, String nome) {
        super(rg, nome);
        this.salHora = salHora;
        this.quantHoras = quantHoras;
    }
    
    public void Mostrar(){
        System.out.println("RG: "+rg+"\nNome: "+nome+
                            "\nsalHora: "+salHora+"\nquantHoras: "+quantHoras+"\n");
    }
    
}
