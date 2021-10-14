
package mergesort;
import java.util.*;

public class Mergesort {

    
    public static void main(String[] args) {
        
        Integer[] a = { 2, 6, 3, 5, 1 };
        mergeSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static Comparable[] mergeSort(Comparable[] list) 
    {
        
        if (list.length <= 1) {
            return list;
        }
         
       
        Comparable[] first = new Comparable[list.length / 2];
        Comparable[] second = new Comparable[list.length - first.length];
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);
         
   
        mergeSort(first);
        mergeSort(second);
         
      
        merge(first, second, list);
        return list;
    }
     
   
    private static void merge(Comparable[] first, Comparable[] second, Comparable[] result) 
    {
        
        int ifirst = 0;
         
     
        int isecond = 0;
         
      
        int iMerged = 0;
         
        
        while (ifirst < first.length && isecond < second.length) 
        {
            if (first[ifirst].compareTo(second[isecond]) < 0) 
            {
                result[iMerged] = first[ifirst];
                ifirst++;
            } 
            else
            {
                result[iMerged] = second[isecond];
                isecond++;
            }
            iMerged++;
        }
        
        System.arraycopy(first, ifirst, result, iMerged, first.length - ifirst);
        System.arraycopy(second, isecond, result, iMerged, second.length - isecond);
    }
    
}
