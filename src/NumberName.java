/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tofiq Quadri
 */
public class NumberName {
    
    public static void main(String args[])
    {
      String name[]={" Zero "," One "," Two "," Three "," Four "," Five "," Six "," Seven "," Eight "," Nine "}; 
    
      int a=19809,b=0,rem=0,div=0,i=0;
      
      b=a;
      div=a;
      
      while(div != 0)
      {
         rem = div % 10;
         div=div/10;
         
         i++;
      }
      
      div=a;
      a=0;
      
      while(div != 0)
      {
         rem = div % 10;
         div=div/10;
      
          if(i == 1)
             a=(a + rem);
          else
             a=(a + rem)*10;  
          i--;
      }
      
      div=a;
      
      StringBuilder sb = new StringBuilder("");
      
      while(div != 0)
      {
         rem = div % 10;
         div=div/10;
         
         switch(rem)
         {
             case 0:sb.append(name[rem]);
                     break;
             case 1:sb.append(name[rem]);
                     break;
             case 2:sb.append(name[rem]);
                     break;
             case 3:sb.append(name[rem]);
                     break;
             case 4:sb.append(name[rem]);
                     break;
             case 5:sb.append(name[rem]);
                     break;
             case 6:sb.append(name[rem]);
                     break;
             case 7:sb.append(name[rem]);
                     break;
             case 8:sb.append(name[rem]);
                     break;                     
             case 9:sb.append(name[rem]);
                     break;         
         }
      }
      
      System.out.println(sb.toString());
    }
    
}
