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
public class Alunos extends Pessoa{
    protected String RA, turno, status;

    public Alunos() {
    }
    
    public Alunos(String RA, String turno) {
        this.RA = RA;
        this.turno = turno;
        this.status = "Ativo";
    }

    public Alunos(String RA, String turno, String rg, String nome) {
        super(rg, nome);
        this.RA = RA;
        this.turno = turno;
        this.status = "Ativo";
    }
    
    
    public void Trancar(){
        if(status == "Ativo"){
            status = "Suspenso";
        }
    }
    
    public void Destrancar(){
        if(status == "Suspenso"){
            status = "Ativo";
        }
    }
    
    public void Formar(){
        if(status == "Ativo"){
            status = "Egresso";
        }
    }
    
    public void Desistir(){
        
        if(status !="Egresso"){
            if(status == "Ativo" || status =="Suspenso"){
                status = "Desistente";
            }
        }
    }
    
    public void Mostrar(){
        System.out.println("RG: "+rg+"\nRA: "+RA+"\nNome: "+nome+
                            "\nTurno: "+turno+"\nStatus: "+status+"\n");
    }
    
}
