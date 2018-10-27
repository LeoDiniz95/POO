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
public class Professor extends Funcionario {
    protected String areaAtuacao;

    public Professor() {
    }
    
    public Professor(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public Professor(String areaAtuacao, double salHora, int quantHoras) {
        super(salHora, quantHoras);
        this.areaAtuacao = areaAtuacao;
    }

    public Professor(String areaAtuacao, double salHora, int quantHoras, String rg, String nome) {
        super(salHora, quantHoras, rg, nome);
        this.areaAtuacao = areaAtuacao;
    }
    
    public void Mostrar(){
        System.out.println("RG: "+rg+"\nNome: "+nome+
                            "\nsalHora: "+salHora+"\nquantHoras: "+quantHoras+
                            "\nÁrea de Atuação:"+areaAtuacao+"\n");
    }
    
}
