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
public class Musico {
    
    Instrumento instrumento;

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }
    
    
    public void tocarInstrumento(){
        this.instrumento.tocar();
    }
    
    public void afinarInstrumento(){
        this.instrumento.afinar();
    }
    
}
