/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livros;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author 0040481422033
 */
public class LivroDeBiblioteca extends Livro{
    private String dtemp;
    private String dtdev;
    private int emprestadopara;

    public LivroDeBiblioteca() {
    }

    public LivroDeBiblioteca(String dtemp, String dtdev, int emprestadopara, String autor, String editora, String ano, String titulo) {
        super(autor, editora, ano, titulo);
        this.dtemp = dtemp;
        this.dtdev = dtdev;
        this.emprestadopara = emprestadopara;
    }
    
    /**************************************
     *              Getters               *
     **************************************/

    public String getDtemp() {
        return dtemp;
    }

    public String getDtdev() {
        return dtdev;
    }

    public int getEmprestadopara() {
        return emprestadopara;
    }

    /**************************************
     *              Setters               *
     **************************************/
    public void setDtemp(String dtemp) {
        if(dtemp != null)
            this.dtemp = dtemp;
    }

    public void setDtdev(String dtdev) {
        if(dtdev != null)
            this.dtdev = dtdev;
    }

    public void setEmprestadopara(int emprestadopara) {
        this.emprestadopara = emprestadopara;
    }
    
    public void emprestimo(){
        
        if( dtemp != null )
             if(! dtemp.equals("")){
                System.out.println("Livro emprestado");
                return;
            }
            Date data = new Date();
            DateFormat data1 = DateFormat.getDateInstance();
            dtemp = data1.format(data);
            Calendar cal;
            cal = Calendar.getInstance();
            //call.add(5, 5);
            cal.add(Calendar.DAY_OF_MONTH, 5);
            dtdev = data1.format(cal.getTime()); //dtemp + 5;
    }
    
    public void imprimeDados(){
        System.out.println(super.getAno());
        System.out.println(super.getAutor());
        System.out.println(super.getEditora());
        System.out.println(super.getTitulo());
        System.out.println(dtemp);
        System.out.println(dtdev);
        System.out.println(emprestadopara);
    }
    
}
