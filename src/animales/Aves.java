
package animales;

import javax.swing.JOptionPane;


final class Aves extends Animales{
    private String colorPlumaje;
    private String colorPico;

    
    public String getColorPlumaje() {
        return colorPlumaje;
    }

    
    public void setColorPlumaje(String colorPlumaje) {
        this.colorPlumaje = colorPlumaje;
    }
    
    public String getColorPico() {
        return colorPico;
    }

    
    public void setColorPico(String colorPico) {
        this.colorPico = colorPico;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        JOptionPane.showMessageDialog(null, "color del plumaje: "+getColorPlumaje()+"\n"+
                "Color pico: "+getColorPico());
    }
    @Override
    public void alimentacion(){
        JOptionPane.showMessageDialog(null, "Las aves se alimentan de alpiste");
    }

    
    
    
    
}
