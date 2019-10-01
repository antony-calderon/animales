
package animales;

import javax.swing.JOptionPane;


final class Reptiles extends Animales{
    private String colorPiel;
    private String tieneExtremidades;

    
    public String getColorPiel() {
        return colorPiel;
    }

    
    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }
    
    public String getTieneExtremidades() {
        return tieneExtremidades;
    }

    
    public void setTieneExtremidades(String tieneExtremidades) {
        this.tieneExtremidades = tieneExtremidades;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        JOptionPane.showMessageDialog(null, "El color de piel es: "+getColorPiel()+"\n"+
                "¿Tiene extremidades?: "+getTieneExtremidades());
    }
    @Override
    public void alimentacion(){
        JOptionPane.showMessageDialog(null, "Los reptiles se alimentan principalmente de carne");
    }

    
    
    
}
