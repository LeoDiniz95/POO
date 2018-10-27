/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empregado;

/**
 *
 * @author 0040481422033
 */
public class Empregado {

    String nome;
    String departamento;
    double horaMes;
    double salarioHora;
    double horaExtra;

    public Empregado() {
    }

    public Empregado(String nome, String departamento, double horaMes, double salarioHora, double horaExtra) {
        this.nome = nome;
        this.departamento = departamento;
        this.horaMes = horaMes;
        this.salarioHora = salarioHora;
        this.horaExtra = horaExtra;
    }
    
    public double calculaSalarioMensal(){
        return salarioHora*horaMes;
    }

    public String mostraDados(){
        return "Nome: "+nome+"\nDepartamento: "+departamento+"\nSalario Hora: "+salarioHora+
                "\nHora trabalhadas no mes: "+horaMes+"\nHoras Extras: "+horaExtra +"\nSalario mes: "+ (salarioHora*horaMes) +
                "\nRecebido em Horas Extras: "+(salarioHora*1.60)+ "\nSalario total: "+
                ((salarioHora*1.6*horaExtra) + salarioHora*horaMes);
    }
    
}
