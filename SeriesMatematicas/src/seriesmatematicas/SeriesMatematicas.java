/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriesmatematicas;

/**
 *
 * @author 0040481422033
 */
public class SeriesMatematicas {
    int x, y;
    int resultado = 0;

    public SeriesMatematicas() {
    }
    

    public SeriesMatematicas(int x, int y) {
        this.x = x;
        this.y = y;
        resultado = x;
    }
    
    public int elevadoA(){
        int i = 1;
        
        if(y > 0){
            while(i < y){
                resultado *= x;
                i++;
            }
            return resultado;
        }else{
            resultado = 1;
            return resultado;
        }
    }
    
    public void imprimeResultado(){
        System.out.println(resultado);
    }
}
