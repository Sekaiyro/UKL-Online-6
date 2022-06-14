/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklonline6;

/**
 *
 * @author ASUS
 */
public class Uklonline6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Adrian Pramana Wijaya 04 XRPL2
        int A[][]={{2,3},{3,1}};
        int B[][]={{5},{1}};
        int H[][]={{0},{0}};
       
        for(int i=0;i<2;i++){
        for(int j=0;j<1;j++){
        for(int k=0;k<2;k++){
           H[i][j]=H[i][j]+A[i][k]*B[k][j];
        
        } 
        
     }
        }
    for(int i=0;i<2;i++){
 for(int j=0;j<1;j++){
 System.out.print(H[i][j]+"\t");
 }
 System.out.println();
 }   
    
    }
        
    
}
    
    

