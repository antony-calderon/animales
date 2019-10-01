
package animales;

import javax.swing.JOptionPane;


final class Mamiferos extends Animales{
    private String colorPelaje;
    private String tieneCola;

    
    public String getColorPelaje() {
        return colorPelaje;
    }

    
    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }
    
    public String getTieneCola() {
        return tieneCola;
    }

    
    public void setTieneCola(String tieneCola) {
        this.tieneCola = tieneCola;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        JOptionPane.showMessageDialog(null, "El color del pelaje es: "+getColorPelaje()+"\n"+
                "¿Tiene cola?: "+getTieneCola());    
    }
    @Override
    public void alimentacion(){
        JOptionPane.showMessageDialog(null, "Los mamiferos toman leche materna");
    }

    
    
    
}
