/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livros;

import java.util.Scanner;

/**
 *
 * @author 0040481422033
 */
public class Livros {
    
    
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        /*System.out.println("Digite o titulo do livro");
        String titulo = s.next();
        System.out.println("Digite o nome do autor");
        String autor = s.next();
        System.out.println("Digite o ano de lancamento do livro");
        String ano = s.next();
        System.out.println("Digite a editora do livro");
        String editora = s.next();
        LivroDeBiblioteca lb = new LivroDeBiblioteca(null, null, 0 , autor, editora, ano, nome);*/
        
        LivroDeBiblioteca lb = new LivroDeBiblioteca(null, null, 0 , "autor", "editora", "ano", "titulo");
        Livro l = new Livro("autor", "editora", "ano", "titulo");
        lb.imprimeDados();
        System.out.println("");
        lb.emprestimo();
        lb.imprimeDados();
        /*lb.emprestimo();
        lb.imprimeDados();*/
        
    }
}
