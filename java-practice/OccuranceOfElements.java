import java.util.*;
public class OccuranceOfElements
{
    public static void main(String args[])
    {
        ArrayList<Integer> arr =new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements in the array: ");
        int n=sc.nextInt();
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
        {
            arr.add(sc.nextInt());
        }
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for(int num : arr) 
        {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        System.out.println(countMap);
        sc.close();
    }
}