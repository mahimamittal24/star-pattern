/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgnew;

/**
 *
 * @author hp
 */
class A
{
   void fun()
   {
       int i,j;
        for(i=1;i<=3;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
   }
}
public class New {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      A obj=new A();
      obj.fun();
      // TODO code application logic here
    }
    
}
