class Main{
    public static void main (String[] args){
    
        List list = new List();
        for(int i = 0; i<10; i++){
            list.append(i);
        }
        
        System.out.println(list.toString());
        kthlast(list, 2);

    }
    //Implement an algorithm to find the kth to last
    //element of a singly linked list
    public static void kthlast(List l, int k){
        l.moveFront();
        for(int i = 0; i< l.length() - k; i++){
            l.moveNext();
            System.out.println(l.get());
        }
        l.delete();
        System.out.println(l.toString());
    }
}
