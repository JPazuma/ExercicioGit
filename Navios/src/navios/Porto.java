/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package navios;

import java.util.ArrayList;

/**
 *
 * @author 8ctia
 */
public class Porto {
    
    ArrayList<Navio> navios;
    ArrayList<NavioPortaContentores> naviosPortaContentores;
    ArrayList<NavioPetroleiro> naviosPetroleiro;
    
    public boolean newNavio(String matricula, String nome, float comprimento){
        Navio navio = new Navio(matricula, nome, comprimento);
        for(int i = 0; i < navios.size(); i++){
            if(matricula.equals(navios.get(i).getMatricula())){
                System.out.println("Matricula existente");
                return false;
            }
        }
        navios.add(navio);
        return true;
    }
    
    public int ContentoresMaximos(){
        int resultado = 0;
        for(int i = 0; i < naviosPortaContentores.size(); i++){
            resultado += naviosPortaContentores.get(i).getNumMaxContentores();
        }
        return resultado;
    }
    
    public float capacidadeTotal(){
        float resultado = 0;
        for(int i = 0; i < naviosPortaContentores.size(); i++){
            resultado += naviosPortaContentores.get(i).getNumMaxContentores();
        }
        resultado *=10;
        for(int i =0; i> naviosPetroleiro.size(); i++){
            resultado += naviosPetroleiro.get(i).getCapCarga();
        }
        return resultado;
    }
}
