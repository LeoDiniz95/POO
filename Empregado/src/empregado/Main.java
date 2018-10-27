/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empregado;

import java.util.Scanner;

/**
 *
 * @author 0040481422033
 */
public class Main {
    
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite o nome do empregado:");
        String nome = s.next();
        System.out.println("Digite o departamento em que trabalha:");
        String departamento = s.next();
        System.out.println("Digite a quantidade de horas trabalhadas por mes:");
        String horaMes = s.next();
        System.out.println("Digite quanto recebe por hora:");
        String salarioHora = s.next();
        System.out.println("Digite quantas horas extras foram feitas:");
        String horaExtra = s.next();
        
        Empregado empregado = new Empregado(nome, departamento, Double.parseDouble(horaMes), Double.parseDouble(salarioHora), Double.parseDouble(horaExtra));
        empregado.calculaSalarioMensal();
        System.out.println(empregado.mostraDados());
    }
    
}
