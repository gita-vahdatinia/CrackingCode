class RotateMatrix{
  public static void main(String[] args){
    char[][] array = {{'a','b','c','d'},{'e','f','g','h'},{'i','j','k','l'},
      {'m','n','o','p'}};

      arrayprint(array);
      rotatematrix(array);
      System.out.println();
      arrayprint(array);
    }
      public static void arrayprint(char[][] array){
        for(int i = 0; i<array.length; i++){
          for(int j=0; j<array.length; j++){

            System.out.print(array[i][j]+ "   ");
          }
            System.out.println();
        }
      }
      public static void rotatematrix(char[][] array){
        int n = array.length;
        for(int i = 0; i<n/2; i++){
          int first = i;
          int last = n - 1 - i;
          for (int j = first; j<last; j++){
            int offset = j - first;
            char top = array[first][j];
            array[first][j] = array[last-offset][first];
            array[last-offset][first] = array[last][last-offset];
            array[last][last-offset]=array[j][last];
            array[j][last] = top;

          }
        }
      }

}
