/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banda__musicos;

import java.util.Random;

/**
 *
 * @author acer1
 */
public class Banda__musicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Banda b = new Banda();
        Random rn = new Random();
        
        int cantidadMusicos = rn.nextInt(15);
        
        b.crearBanda(cantidadMusicos);
        b.afinarBanda();
        b.tocarBanda();
        
    }
    
}
