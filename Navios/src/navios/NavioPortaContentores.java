/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package navios;

/**
 *
 * @author 8ctia
 */
public class NavioPortaContentores extends Navio {
    
    int numMaxContentores;
    //fgdfg
    public NavioPortaContentores(String matricula, String nome, float comprimento, int numMaxContentores){
        super(matricula, nome, comprimento);
        this.numMaxContentores = numMaxContentores;
    }

    public int getNumMaxContentores() {
        return numMaxContentores;
    }

    public void setNumMaxContentores(int numMaxContentores) {
        this.numMaxContentores = numMaxContentores;
    }
}
