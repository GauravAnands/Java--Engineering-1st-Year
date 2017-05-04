/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author HOME
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class TidyNumber {
     static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(new File("n.in")));
        int nu=Integer.parseInt(br.readLine());
        List<Arrays> ls=new ArrayList<Arrays>();
        for(int i=0;i<nu;i++){
           String g=br.readLine(); 
           int val=Integer.parseInt(g) ;
           char[] arr=g.toCharArray();
           char[]arr1=g.toCharArray();
           Arrays.sort(arr1);
            
           while(!Arrays.equals(arr1, arr)){
                arr=  Integer.toString(--val).toCharArray();
                val++;
                arr1=Integer.toString(--val).toCharArray();
                Arrays.sort(arr1);
                //System.out.println(String.valueOf(arr)+" "+String.valueOf(arr1));
            //System.out.println();
           }
           
           System.out.println("Case #"+(i+1)+": "+String.valueOf(arr));
            
        }
        
    }
    
    
    
}
