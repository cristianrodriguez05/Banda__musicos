/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banda__musicos;

/**
 *
 * @author acer1
 */
public class Guitarra implements Instrumento{
      
    @Override
    public void tocar() {
        System.out.println("Tocando Guitarra");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando Guitarra");
    }
    
}
