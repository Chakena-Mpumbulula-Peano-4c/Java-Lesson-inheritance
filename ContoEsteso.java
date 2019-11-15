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
public class ContoEsteso extends ContoCorrente {
    int fido ;

    public ContoEsteso(String conto) {
        super(conto);
        this.fido=1000;
    }

    public ContoEsteso(String conto, int contocorrente) {
        super(conto, contocorrente);
        this.fido=1000;
    }

    public ContoEsteso(int fido, String conto, int contocorrente) {
        super(conto, contocorrente);
        this.fido = fido;
    }

    public int getFido() {
        return fido;
    }

    public void setFido(int fido) {
        this.fido = fido;
    }

    @Override
    void prelievo(int denaro) {
        super.prelievo(denaro); //To change body of generated methods, choose Tools | Templates.
   if(this.contocorrente + fido>= denaro){
        
        this.contocorrente = this.contocorrente-denaro ;
    }else {
    System.out.println("non puo prelevare");
    }
    }
    
    // 500 su conto + 500 di fido 
    //prelevo 750 ?
    //750 < 500 + 500 (1000 = contocorrente + fido)
    //contocorrente = ?? 
    //prelevo 500?
    // 500 < contocorrente + fido ???
   
}
