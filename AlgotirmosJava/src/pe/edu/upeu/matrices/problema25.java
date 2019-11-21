/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.matrices;

import java.util.Scanner;

/**
 *
 * @author Laboratorio 7
 */
public class problema25 {
    
    
   static Scanner cs=new Scanner(System.in);
   
    public static void imprimirMatriz(int[][] M){
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
               if(j==0 && i!=0){System.out.println("");}
                System.out.print("\t"+M[i][j]+"|");
            }
        }
        System.out.println("");
    }
    
    public static int[][] transformada25(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();
        
        for (int j = 0; j < dim; j++) {
                if(j%2==0) {
                for (int i = 0; i<dim; i++) {
                M[j][i]=numInit;
                numInit++;}
   
            }else{
                for (int i = dim-1; i >=0; i--) {
                    M[j][i]=numInit;
                numInit++;
                }
            
            }
        }
            return M;
                
            
    }
    
    
    public static void main(String[] args) {
        imprimirMatriz(transformada25());
    }
    
}
