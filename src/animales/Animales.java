
package animales;

import javax.swing.JOptionPane;


public class Animales {
    private int NumeroPatas;

    
    public int getNumeroPatas() {
        return NumeroPatas;
    }

    
    public void setNumeroPatas(int NumeroPatas) {
        this.NumeroPatas = NumeroPatas;
    }
    
    public void imprimir(){
        JOptionPane.showMessageDialog(null, "Numero de patas: "+getNumeroPatas());
    }
    
    public void alimentacion(){
        JOptionPane.showMessageDialog(null, "Todos los animales comen");
    }
}
