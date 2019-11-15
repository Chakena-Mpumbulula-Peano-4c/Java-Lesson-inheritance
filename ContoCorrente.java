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
public class ContoCorrente {
    protected String conto;
   protected int contocorrente;

    public ContoCorrente(String conto, int contocorrente) {
        this.conto = conto;
        this.contocorrente = contocorrente;
    }

    public ContoCorrente(String conto) {
        this.conto = conto;
        contocorrente=0;
    }

    
    public String getConto() {
        return conto;
    }

    public int getContocorrente() {
        return contocorrente;
    }

    public void setConto(String conto) {
        this.conto = conto;
    }

    public void setContocorrente(int contocorrente) {
        this.contocorrente = contocorrente;
    }
    
    void deposito(int denaro){
    this.contocorrente= denaro+this.contocorrente;
    }
    void prelievo(int denaro){
    if(this.contocorrente>=denaro){
        
        this.contocorrente = this.contocorrente-denaro;
    }else {
    System.out.println("non puo prelevare");
    }
    }        
    
}
