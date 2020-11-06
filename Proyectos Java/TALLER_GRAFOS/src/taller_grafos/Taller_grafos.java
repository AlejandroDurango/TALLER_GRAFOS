/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_grafos;

/**
 *
 * @author lejod
 */
public class Taller_grafos {

    public static void main(String[] args) {
       
        //Ejemplo 1 del taller
        Grafo grafito = new Grafo (4);
        grafito.agregarborde(0, 1);
        grafito.agregarborde(1, 2);
        grafito.agregarborde(2, 0);
        grafito.agregarborde(2, 3);
        grafito.agregarborde(3, 2);
        
        System.out.println("Matriz de adyacencia");
        System.out.println(grafito.MostrarMatrix1());
        System.out.println("--------");
        System.out.println("Lista de adyacencia");
        System.out.println(grafito.mostarlistauno());
        System.out.println("--------");
        System.out.println("Lista de arcos");
        System.out.println(grafito.mostar_listado_de_bordes());
        System.out.println("--------");
        grafito.ValidarInOut();
        
        System.out.println("------------------------------");
        
        //Ejemplo 2 del taller
        Grafo grafito2 = new Grafo(7);
        grafito2.agregarborde(0, 1);
        grafito2.agregarborde(1, 0);
        grafito2.agregarborde(2, 3);
        grafito2.agregarborde(3, 2);
        grafito2.agregarborde(4, 6);
        grafito2.agregarborde(5, 4);
        grafito2.agregarborde(6, 5);
        
        System.out.println("Matriz de adyacencia");
        System.out.println(grafito2.MostrarMatrix1());
        System.out.println("--------");
        System.out.println("Lista de adyacencia");
        System.out.println(grafito2.mostarlistauno());
        System.out.println("--------");
        System.out.println("Lista de arcos");
        System.out.println(grafito2.mostar_listado_de_bordes());
        System.out.println("--------");
        grafito2.ValidarInOut();
        
        System.out.println("------------------------------");
        
        //Ejemplo 3 del taller
        Grafo grafito3 = new Grafo(3);
        grafito3.agregarborde(0, 1);
        grafito3.agregarborde(2, 0);
        
        System.out.println("Matriz de adyacencia");
        System.out.println(grafito3.MostrarMatrix1());
        System.out.println("--------");
        System.out.println("Lista de adyacencia");
        System.out.println(grafito3.mostarlistauno());
        System.out.println("--------");
        System.out.println("Lista de arcos");
        System.out.println(grafito3.mostar_listado_de_bordes());
        System.out.println("--------");
        grafito3.ValidarInOut();
        
    }
    
}
