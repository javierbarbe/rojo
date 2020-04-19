/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemons;

import java.util.Objects;

/**
 *
 * @author alumnot
 */
public class Fuego extends Pokemon implements Ataques {
 
 private int aleatorio=(int)(Math.random()*10);   
 private String salvaje;  
 private int poder;
    
 private String genera(){
   switch (aleatorio){
       case 1:salvaje="Charmander";poder=100;break;
       case 2:salvaje="Vulpix    ";poder=30;break;
       case 6:salvaje="Vulpix    ";poder=50;break;
       case 7:salvaje="Ponita    ";poder=20;break;
       case 3:salvaje="Ponita    ";poder=50;break;
       case 4:salvaje="Magmar    ";poder=100;break;
       case 8:salvaje="Charmander";poder=150;break;
       case 9:salvaje="Vulpix    ";poder=10;break;
       case 10:salvaje="Ponita    ";poder=10;break;
       case 5:salvaje="Moltres   ";poder=200;break;
       case 0:salvaje="Magmar    ";poder=120;break;
   }
   return salvaje;
 }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.salvaje);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fuego other = (Fuego) obj;
        if (!Objects.equals(this.salvaje, other.salvaje)) {
            return false;
        }
        return true;
    }
 
 
 
  public  Fuego(){
  
      
      
  setNombre(genera());
  setDefensa(gen()+poder);
  setLevel(experiencia());
  setNivel(1+up());
  setPs(200+(poder/4));
  setTipo("fuego");
  setAtaque(gen()+poder); 
  
  }
  
  private int gen(){
  return (int)(Math.random()*100);
  }
 
  
  
  public double experiencia(){
  double exp=(Math.random()*100);    
  return this.level+exp;
  
  }
  
  public int up(){
  if(this.level>=4000){
  this.nivel+=1;this.level=0;
  }
  return this.nivel;
  
  }
  
  
  
  
  
/////en modo poke test habra una movida que restara ps
   public int  atack(){
    return getAtaque();
      
       
  }
    @Override
    public int placaje(){
    int at=20;
    return at;
    }
    
    
    
    
    
    
    
    
}