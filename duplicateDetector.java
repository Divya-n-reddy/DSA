import java.util.HashSet;
import java.util.Scanner;
public class duplicateDetector {
    public  boolean duplicate(int[] nums){
        if(nums==null||nums.length==0){
            return false;
        }
        else{
            HashSet<Integer> set1=new HashSet<>();
            for(int num:nums){
                if(set1.contains(num)){
                    return true;
                }
                    set1.add(num);
            }
            return false;
        }
    }
    public static void main(String[] args){
        duplicateDetector dd=new duplicateDetector();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter elements of array");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(dd.duplicate(nums));
    }
    
}
