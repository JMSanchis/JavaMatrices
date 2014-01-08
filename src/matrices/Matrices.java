
package matrices;

import java.util.Scanner;

public class Matrices {
    
   final static int size=3;
    public static void main(String[] args) {
       int[][] matriz=new int[size][size];
      //llamar método con crtl + space
       
       rellenarMatriz(matriz);
       //rellenarDiagonalPrincipal(matriz);
       //mostrarMatriz(matriz);
       //mostrarDiagonal(matriz);
       //mostrarDiagonalSecundaria(matriz);
       if(esCuadrada(matriz)){
           System.out.println("Es cuadrada");
       }else{
           System.out.println("No es cuadrada");
       }
       
       
   }
    public static void rellenarMatriz(int[][] m){
        //recorremos por filas
        for(int i=0;i<m.length;i++){
          //recorremos por columnas
            for(int j=0;j<m[i].length;j++){
             Scanner sc=new Scanner(System.in);
             System.out.println("Dame un elemento");
             m[i][j]=sc.nextInt();
            }           
       }
    }
    //metodo para mostrar matriz
    public static void mostrarMatriz(int[][]m){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
    }
    //metodo para mostrar diagonal
    public static void mostrarDiagonal(int[][] m){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if (i==j){
                    System.out.println(m[i][j]);
                }
            }
        }
    }
    //metodo para mostrar diagonal secundaria
    public static void mostrarDiagonalSecundaria (int[][] m){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                if(m.length-1-i==j){
                    System.out.println(m[i][j]+"");
                    
                }
                    
            }
        }
    }
    public static void rellenarDiagonalPrincipal (int[][] m){
        for(int i=0;i<m.length;i++){
            m[i][i]=1;
            
            //otra opción, con dos bucles (menos optimizada)
            
            //for(int j=0;j<m[0].length;j++){
            //if(i==j){
            //m[i][j]=1;
                
              }
            }
    public static boolean esCuadrada (int[][] m){
        return m.length==m[0].length;
            }
 }
 
    
    
    

