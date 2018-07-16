import java.util.*;

public class ZeroMatrix{
  public static void main(String[] args){
    int[][] arr = {{1 , 2, 0, 2, 4, 1, 3, 4, 0},
            {1 , 2, 4, 2, 2, 1, 3, 4, 3},
            {1 , 2, 4, 2, 2, 1, 3, 4, 3},
            {1 , 0, 4, 2, 2, 1, 3, 4, 3},
            {1 , 2, 4, 2, 2, 0, 3, 4, 3},
            {1 , 2, 4, 2, 2, 1, 3, 4, 3},};
    System.out.println(Arrays.deepToString(arr).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
    System.out.println();
    findZeros(arr);
  }
  public static void findZeros(int[][] arr){
    Queue<Integer> rows = new LinkedList<>();
    Queue<Integer> cols = new LinkedList<>();
    for(int i = 0; i<arr.length; i++){
      for(int j = 0; j<arr[i].length; j++){
        if (arr[i][j] == 0){
          rows.add(i);
          cols.add(j);
        }
      }
    }
    replaceMatrix(rows, cols, arr);
  }
  public static void replaceMatrix(Queue<Integer> row, Queue<Integer> col,
                                  int[][] arr){
    for(int i = 0; i<arr.length; i++){
      for(int j = 0; j<arr[i].length; j++){
        if(row.contains(i) || col.contains(j)){
          arr[i][j] = 0;
        }
      }
    }
    System.out.println(Arrays.deepToString(arr).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
  }

}
