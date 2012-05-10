
package utils;

import java.util.logging.Level;
import java.util.logging.Logger;
import view.MainFrame;
import view.xPanel;

public class InsertSort extends Sorter{

    @Override
    public void sort(int[] sa) {       
        initA(sa);
        int min;
        for(int i=0; i<a.length; i++){
            min=i;
            for(int j=i+1; j<a.length; j++){
                compareCount++;
                if( compareMore(a[min], a[j]) )      min=j;
            }
            if (min!=i) {  
                swap(i,min);
            }             
        }
    }

}
