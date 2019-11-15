/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbancario;


/**
 *
 * @author mpumbulula.chakenane
 */
public class TestBancario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContoCorrente cc = new ContoCorrente("nome", 1400);
        System.out.println(cc + " - "  + cc.getConto() + " - " + cc.getContocorrente());
        ContoEsteso c1 = new ContoEsteso("nome", 100);
        System.out.println(c1 + " - "  + c1.getFido()+ " - " + c1.getFido());
        
        cc.prelievo(400); //bilancio di cc =1400 deposito 400
        //mi aspetto che il bilancio è 1800
        System.out.println("il bilancio di cc è " + cc.getContocorrente());
        
        
        
        
        
    }
    
}
