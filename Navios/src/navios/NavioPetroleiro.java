/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package navios;

/**
 *
 * @author 8ctia
 */
public class NavioPetroleiro extends Navio {
    
    float capCarga;
    
    public NavioPetroleiro(String matricula, String nome, float comprimento, float capCarga){
        super(matricula, nome, comprimento);
        this.capCarga = capCarga;
    }

    public float getCapCarga() {
        return capCarga;
    }

    public void setCapCarga(float capCarga) {
        this.capCarga = capCarga;
    }   
}
