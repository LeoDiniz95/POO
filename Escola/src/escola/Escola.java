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
public class Escola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Alunos aluno1 = new Alunos("555444","noite","44.668.444-9","Jorge Amado");
        Funcionario funcionario1 = new Funcionario(70.50, 240, "75.222.333.4", "Dona da Limpeza");
        Professor professor1 = new Professor("Exatas",55.00, 160,"60.855.124-5", "Jaqueline AA");
        
        professor1.Mostrar();
        funcionario1.Mostrar();
        aluno1.Mostrar();
        
        aluno1.Trancar();
        
        aluno1.Mostrar();
    }
    
}
