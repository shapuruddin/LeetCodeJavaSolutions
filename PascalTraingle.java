import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    System.out.println(generatePascalTraingle(5));
  }
  
  public static List<List<Integer>> generatePascalTraingle(int numberOfRows){
      List<List<Integer>> pascalTraingle = new ArrayList<>();
      
      if(numberOfRows == 0) return pascalTraingle;
      List<Integer> firstRow = new ArrayList<>();
      firstRow.add(1);
      pascalTraingle.add(firstRow);
      
      for(int i = 1; i < numberOfRows; i++ ){
          List<Integer> previousRow = pascalTraingle.get(i-1);
          List<Integer> currentRow = new ArrayList<>();
          currentRow.add(1);
          for(int j = 1; j < i; j++){
              currentRow.add(previousRow.get(j-1) + previousRow.get(j));
          }
          currentRow.add(1);
          pascalTraingle.add(currentRow);
      }
     return pascalTraingle; 
  }
}
