package Testing;

import java.util.HashMap;

public class FindDuplicates {
	public static void main(String[] args)
    {
        int arr1[] = {22,6,8,22,77,6};
        int n = arr1.length;
        printDuplicatenumbers(arr1, n);
    }
    private static void printDuplicatenumbers(int[] arr1, int n)
    {
        java.util.Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        boolean duplicate = false;
        for(int i = 0; i < n; i++){
            if(map.containsKey(arr1[i])){
                count = map.get(arr1[i]);
                map.put(arr1[i], count + 1);
            }
            else{
                map.put(arr1[i], 1);
            }
        }
        for(java.util.Map.Entry<Integer, Integer> entry : map.entrySet())
        {
           
            if(entry.getValue() > 1){
                System.out.print(entry.getKey()+ " ");
                duplicate = true;
            }
        }
        
        if(!duplicate){
            System.out.println("-1");
        }
    }
}




