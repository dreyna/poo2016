/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidad.Libro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author programacion
 */
public class Operaciones {
    private List<Libro> lista;
  
    public Operaciones() {
        lista = new ArrayList<>();
    }
    public void addLibro(Libro l){
    lista.add(l);
    }

    public List<Libro> getLista() {
        return lista;
    }
   public int prestamo(String cod){
       int sum=0;
        for(int i=0;i<lista.size();i++){
            if(lista.get(i).getCod().equals(cod)){
                if(lista.get(i).getNejemplares()!=lista.get(i).getEprestados()){
                   sum = lista.get(i).getEprestados()+1;             
                }
            }
        }
        return sum;
   }
    public int devolver(String cod){
       int sum=0;
        for(int i=0;i<lista.size();i++){
            if(lista.get(i).getCod().equals(cod)){
                if(lista.get(i).getEprestados()>0){
                   sum = lista.get(i).getEprestados()-1;             
                }
            }
        }
        return sum;
   }
    public String codigo(int n){
        String q="";
        if(n==0){
            q = "L-00"+n;            
        }
        if(n>0 && n<10){
            q = "L-00"+n;
        }
        if(n>9 && n<100){
            q = "L-0"+n;
        }
        return q;
    }
    public void modificar(Libro l,int w){
    lista.set(w, l);   
    }
}
