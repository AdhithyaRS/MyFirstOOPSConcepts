package functionalInterface;

import oops.Calc;

public class SSort{
    void sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min_idx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;}
            }
                    int temp=arr[min_idx];
                    arr[min_idx]=arr[i];
                    arr[i]=temp;
        
                }
            }
        
        void print(int arr[]){
            int n=arr.length;
            for(int i=0;i<n;i++){
                System.out.print(arr[i]);
                System.out.println();
            }
        }

    public static void main(String ar[]){
            SSort s=new SSort();
            int arr[]={65,25,12,22,11};
            s.print(arr);
            System.out.println("UNSORTED ARRAY");
            s.sort(arr);
            System.out.println("Sorted array");
            s.print(arr);
            Calc objCalc = new Calc();
            System.out.println(objCalc.add(345, 4405));
            
            
 
        }
            }