
package utils;

import java.util.logging.Level;
import java.util.logging.Logger;
import view.MainFrame;
import view.gRect;
import view.xPanel;

public class ShellSort extends Sorter{
    
   @Override
   public void sort(int[] sa) {       
        initA(sa);
        
        int i, j, k, min, m=0, b=a.length;
        int[] d =  { 1, 4, 10, 23, 57, 145 , 356, 911};
        while (d[m] < b) m++;
        
        while (--m >= 0)
        {
            k = d[m];                // шаг
            for (i=0; i<b; i++){     
                min = i;
                for ( j = i+k; j < b;j+=k) {
                    if( compareMore(a[min], a[j]) )      min=j;
                }
                 
                if (min!=i) {  
                    swap(i,min);
                }   
            }
        }
        
   }  
}
