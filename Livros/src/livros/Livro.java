/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livros;

/**
 *
 * @author 0040481422033
 */
public class Livro {

    private String autor;
    private String editora;
    private String ano;
    private String titulo;
    
    public Livro(){
    }

    public Livro(String autor, String editora, String ano, String titulo) {
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
        this.titulo = titulo;
    }
    
    /*********************************************
    **************** Getters *********************
    *********************************************/
    
    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public String getAno() {
        return ano;
    }

    public String getTitulo() {
        return titulo;
    }
    
    /*********************************************
    **************** Setters *********************
    *********************************************/

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    
}
