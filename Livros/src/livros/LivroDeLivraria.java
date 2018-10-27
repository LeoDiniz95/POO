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
public class LivroDeLivraria extends Livro{
    private float precovenda;

    public LivroDeLivraria() {
    }

    public LivroDeLivraria(float precovenda, String autor, String editora, String ano, String titulo) {
        super(autor, editora, ano, titulo);
        this.precovenda = precovenda;
    }

    public float getPrecovenda() {
        return precovenda;
    }

    public void setPrecovenda(float precovenda) {
        this.precovenda = precovenda;
    }
    
}
