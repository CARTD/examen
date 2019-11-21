/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.matrices;

import java.util.Scanner;

import static pe.edu.upeu.matrices.edwar.transformada36;
import static pe.edu.upeu.matrices.problema25.transformada25;

/**
 *
 * @author Laboratorio 7
 */
public class resta {
   public static int[][] rellenarMatriz(int x, int y){
        Scanner cs=new Scanner(System.in);
        int[][] M=new int[x][y];
        for(int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                System.out.println("Ingrese su valor de M["+i+"]["+j+"]=");
                M[i][j]=cs.nextInt();
            }
        }        
        return M;
    }

    public static int[][] suma2MatricesSimetricos(int[][] A, int[][] B){
        int [][] NM=new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                NM[i][j]=A[i][j]-B[i][j];
            }
        }
        return NM;
    }
    
    public static void imprimirMatriz(int[][] M){
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
               if(j==0 && i!=0){System.out.println("");}
                System.out.print("\t"+M[i][j]+"|");
            }
        }
        System.out.println("");
    
        int sumNum=0;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                if(M[i][j]%3==0){
                sumNum=sumNum+M[i][j];
                }
            }
        }
        System.out.println("resta:"+sumNum);
    }
    public static void main(String[] args) {
        imprimirMatriz(suma2MatricesSimetricos(transformada36(), transformada25()));
    }
}

