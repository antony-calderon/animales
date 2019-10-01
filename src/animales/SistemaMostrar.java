
package animales;


public class SistemaMostrar {
    Animales an;
    Aves av;
    Mamiferos ma;
    Reptiles re;

    
    public static void main(String[] args) {
        // TODO code application logic here
        SistemaMostrar sis=new SistemaMostrar();
        sis.funcion();
        
    }
    public void funcion(){
        an=new Animales();
        av=new Aves();
        ma=new Mamiferos();
        re=new Reptiles();
        
        av.setNumeroPatas(2);
        av.setColorPico("Amarillo");
        av.setColorPlumaje("Azul");
        av.imprimir();
        av.alimentacion();
        
        ma.setNumeroPatas(4);
        ma.setColorPelaje("negro");
        ma.setTieneCola("si");       
        ma.imprimir();
        ma.alimentacion();
        
        re.setNumeroPatas(0);
        re.setColorPiel("cafe");
        re.setTieneExtremidades("no");
        re.imprimir();
        re.alimentacion();
    }
    
}
