
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class FourSum {
    public static void main(String[] args) {
        int [] array = {12,4,18,22,1,54,3,21,8};
        int len = array.length;
        int numPairs = len*((len-1)/2);
        PairSum [] pairs = new PairSum[numPairs];
        int index = 0;
        for(int i = 0; i < len-1; i++){
            for(int j = i+1; j < len; j++){
                pairs[index] = new PairSum(array[i],array[j]);
                index+= 1;
            }
        }
        Arrays.sort(pairs);
        int target = 32;
        TwoSum(pairs, target);
    }
    public static void TwoSum(PairSum [] array, int target){
        int len = array.length;
        int left = 0;
        int right = len -1;
        while(left < right){
            int currentSum = array[left].getSum()+array[right].getSum();
            if(currentSum == target && !array[left].isSame(array[right])){
                System.out.println(array[left].getFirst()+" "+array[left].getSecond()+" "+array[right].getFirst()+" "+array[right].getSecond());
                left += 1;
                right -= 1;
            }
            else if( currentSum < target){
                left += 1;
            }
            else{
                right -= 1;
            }
        }
        
    }
    
    
}
