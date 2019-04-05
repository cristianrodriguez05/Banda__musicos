/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banda__musicos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author acer1
 */
public class Banda {

    public ArrayList<Musico> musicos;
    public Banda() {
        this.musicos = new ArrayList<>();
    }

    public Instrumento generarInstrumento() {

        Random rn = new Random();

        switch (rn.nextInt(6)) {

            case 0:
                return new Guitarra();
                
            case 1:
                return new Trompeta();

            case 2:
                return new Violin();

            case 3:
                return new Bateria();
                
            case 4:
                return new Piano();

            default:
                return new Bajo();

        }
    }
        
    
    public void tocarBanda() {
        Iterator it = musicos.iterator();
        while (it.hasNext()) {
            Musico m = (Musico) it.next();
            
            m.tocarInstrumento();
        }
    }
    
    public void afinarBanda() {
        Iterator it = musicos.iterator();
        while (it.hasNext()) {
            Musico m = (Musico) it.next();
            
            m.afinarInstrumento();
        }
    }
    
    
    public void crearBanda (int cantidadMusicos) {
        System.out.println("La presentación se realiza con " + cantidadMusicos + " musicos e instrumentos");
        for (int c=0; c<cantidadMusicos;c++){
            musicos.add(new Musico());
        }
       
        Iterator it = musicos.iterator();
        while(it.hasNext()){
            Musico m = (Musico) it.next();
            m.setInstrumento(this.generarInstrumento());
        }
    }

    
}


