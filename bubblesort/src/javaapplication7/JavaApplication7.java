
package javaapplication7;


public class JavaApplication7 {

    public static void main(String[] args) {
        int arr[] ={30,60,37,2,48,20,5};  
                 
                System.out.println("Array Before Bubble Sort");  
                for(int a=0; a < arr.length; a++){  
                        System.out.print(arr[a] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(arr); 
                 
                System.out.println("Array After Bubble Sort");  
                for(int a=0; a < arr.length; a++){  
                        System.out.print(arr[a] + " ");  
                }  
        
    }
    
      
    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int a=0; a < n; a++){  
                 for(int i=1; i < (n-a); i++){  
                          if(arr[i-1] > arr[i]){  
                                 
                                 temp = arr[i-1];  
                                 arr[i-1] = arr[i];  
                                 arr[i] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
    
    }

