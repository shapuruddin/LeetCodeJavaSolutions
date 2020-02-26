import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    
    System.out.println("jhhj"+getIndexsOfTargetSum(new int[]{2,7,11,15},22));
  }
  public static int[] getIndexsOfTargetSum(int[] arrayOfInteger,int target){
     int a_pointer = 0;
     int b_pointer = arrayOfInteger.length -1;
     while(a_pointer <= b_pointer){
         int sum = arrayOfInteger[a_pointer] + arrayOfInteger[b_pointer];
         if(sum > target){
             b_pointer -= 1;
         }else if(sum < target){
             a_pointer +=1;
         }
         else if(sum == target){
             System.out.println(a_pointer+1 +"   "+(b_pointer+1));
             return new int[]{a_pointer+1, b_pointer+1};
             
         }
     }
     return new int[]{a_pointer+1, b_pointer+1};
 }
 }
