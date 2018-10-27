package enterprise;

/**
 *
 * @author 0040481422033
 */
public class Pessoa {
    
    protected String nome, sobrenome;
    
    public Pessoa(String vsobrenome, String vnome){
        nome = vnome;
        sobrenome = vsobrenome;
    }
    
    public Pessoa(Pessoa ps){
        sobrenome = ps.sobrenome;
        nome = ps.nome;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public String getFullName(){
        return sobrenome+", "+nome;
    }
}