/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
        
package taller_grafos;

import java.util.LinkedList;
import java.util.ArrayList;
/**
 *
 * @author AlejandroDurango
 */
public class Grafo 
{
    private final boolean Matrix1[][];
    private int totalEdges;
    private final LinkedList<Integer> Listauno[];
    private final LinkedList<Integer> Lista_bordes;
    private final int nodos_totales;
    
    
    public Grafo(int n)
    {
        
        this.totalEdges = 0;
        this.Matrix1 = new boolean [n][n];
        this.Listauno = new LinkedList[n];
        this.nodos_totales = n;
        this.Lista_bordes = new LinkedList<>();
        for (int i = 0; i < this.nodos_totales; i++) 
        {
            this.Listauno[i] = new LinkedList<>();
        }
    }
    
    /**
     * Crear nuevo arco
     * @param source: punto de origen
     * @param destination: punto de destino
     */
    public void agregarborde(int source, int destination)
    {
        this.Matrix1[source][destination] = true;
        this.Listauno[source].add(destination);
        this.Lista_bordes.add(source);
        this.Lista_bordes.add(destination);
        this.totalEdges += 1;
    }
    
    public void eliminarborde(int source, int destination) throws Exception
    {
        if(!Matrix1[source][destination])
        {
            throw new Exception("Este arco no existe");
        }
        else
        {
            this.Matrix1[source][destination] = false;
        }
    }
    
    public String MostrarMatrix1()
    {
        String table = "";
        for (int i = 0; i < this.nodos_totales; i++) 
        {
            for (int j = 0; j < this.nodos_totales; j++) 
            {
                table += this.Matrix1[i][j]?1:0;
            }
            
            table += "\n";
        }
        return table;
    }
    public String mostarlistauno()
    {
        String List = "";
        for (int i = 0; i < this.nodos_totales; i++) 
        {
            List += i+ ": ";
            for (Integer k : this.Listauno[i]) 
            {
                List += k + " ";
            }
            List += "\n";
        }
        return List;
    }

    
    public String mostar_listado_de_bordes()
    {
        String EList = "";
        int cont = 0;
        for (int i = 0; i < this.totalEdges; i++) 
        {
            EList += i+": ";
            for (int j = 0; j < 2; j++) 
            {
                if(cont<this.Lista_bordes.size())
                {
                    EList += this.Lista_bordes.get(cont) + " ";
                    cont += 1;
                }
                else
                {
                    break;
                }
            }
            EList += "\n";
        }   
        return EList;
    }

    public void ValidarInOut()
    {
        int contadorFilas, contadorColumnas;
        int[] recorridoFilas = new int[this.nodos_totales];
        int[] recorridoColumnas = new int[this.nodos_totales];
        for (int i = 0; i < this.nodos_totales; i++) 
        {
            contadorFilas = 0;
            for (int j = 0; j < this.nodos_totales; j++) 
            {
                if(this.Matrix1[i][j])
                {
                    contadorFilas += 1;
                }
            }
            recorridoFilas[i] = contadorFilas;
        }
        
        for (int j = 0; j < this.nodos_totales; j++) 
        {
            contadorColumnas = 0;
            for (int i = 0; i < this.nodos_totales; i++) 
            {
                if(this.Matrix1[i][j])
                {
                    contadorColumnas += 1;
                }
            }
            recorridoColumnas[j] = contadorColumnas;
        }
        
        int verificacion = 0;
        for (int i = 0; i < this.nodos_totales; i++) 
        {
            if(recorridoFilas[i] == recorridoColumnas[i])
            {
                verificacion += 1;
            }
        }
        if(verificacion == this.nodos_totales)
        {
            System.out.println("True, el número de entradas por nodo es igual al número de salida del mismo");
        }
        else
        {
            System.out.println("False, el número de entradas por nodo no es igual al número de salida del mismo");
        }
    }
}
