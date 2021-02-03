import java.util.Scanner;

public class Newsort {
	static void selectionSort(int[] arr) {  
	     for (int i = 0; i < arr.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < arr.length; j++){  
	                if (arr[j] < arr[index]){  
	                    index = j;
	                }  
	            }  
	            int smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber;  
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
    selectionSort(array);
    System.out.println("Array After Bubble Sort");  
    for(int i=0; i < array.length; i++){  
            System.out.print(array[i] + " ");  
    }  

}  

}
