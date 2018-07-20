import java.util.*;

public class Main{
    public static void main (String[] args){

    Random rand = new Random();
    Map<Integer, Integer> hash = new HashMap<Integer, Integer>();
    List list = new List();

    //Adding ints to the list
    for(int i = 0; i < 20; i++){
        list.append(i%9);
    }

    System.out.println(list.toString());
    //0 1 2 3 0 

    list.moveFront();
    for(int i = 0; i <list.length(); i++){
        System.out.println("list.len :" + list.length());
        if(hash.containsValue(list.get())){
            i--;
            System.out.println("if " +  i);
            list.delete();
            System.out.println(hash);
            System.out.println(list);
        }
        else{
            System.out.println("else " +  i);
            hash.put(list.index(), list.get());
            System.out.println(hash);
        }
        list.moveNext();
    }
    System.out.println(list.toString());

    }

}
