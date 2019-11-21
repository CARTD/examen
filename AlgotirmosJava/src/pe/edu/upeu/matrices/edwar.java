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
public class edwar {
    
    
    
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
    
    public static int[][] transformada36(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();
        
        for (int c = 0; c < dim/2; c++) {
            for (int li =dim-1-c;li>c; li--) {
                M[li][dim-1-c]=numInit;
                numInit++;
           
                
            }
            for (int liz = dim-1-c; liz>c; liz--) {
                M[c][liz]=numInit;
                numInit++;
            
                
        }   
             for (int ls=c; ls<dim-1-c; ls++) {
                M[ls][c]=numInit;
                numInit++;
            
        }   
             for (int ld = c; ld<dim-1-c; ld++) {
                M[dim-1-c][ld]=numInit;
                numInit++;
            
            }
        }
        if (dim %2!=0) {
            M[dim/2][dim/2]=numInit;
        
    }
        return M;
    }
    
    
    public static void main(String[] args) {
        imprimirMatriz(transformada36());
    }
}
   



