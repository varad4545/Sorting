
import java.util.Scanner;  
public class Bubblesort {
	
    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){   
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         } 

    }
public static void main(String[] args) {  
	int n;  
	Scanner sc=new Scanner(System.in);  
	n=sc.nextInt();  
	int[] array = new int[n];  
 
	for(int i=0; i<n; i++)  
	{   
	array[i]=sc.nextInt();  
	} 
	  System.out.println("Array before Bubble Sort");  
	  for(int i=0; i < array.length; i++){  
          System.out.print(array[i] + " ");  
    }
	  System.out.print("\n");
    bubbleSort(array);
    System.out.println("Array After Bubble Sort");  
    for(int i=0; i < array.length; i++){  
            System.out.print(array[i] + " ");  
    }  

}  
} 
