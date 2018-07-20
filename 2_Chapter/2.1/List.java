class List{
    private class Node{
        //Fields
        int data;
        Node next;
        Node prev;

        //Constructor
        Node(int data){this.data = data; next = null; prev = null;}
        Node(int data, Node prev, Node next){
            this.data = data; this.prev = prev; this.next = next;}

        public String toString(){
            return String.valueOf(data);
        }
    }
    //Fields
    private Node front;
    private Node back;
    private Node cursor;
    private int length;
    private int index; 

    //Constructor
    List(){
        front=back=cursor=null;
        length = 0;
        index = -1;
    }
       
    //Access Functions
    int length(){ return length; }
    int index(){ return index; }
    
    //get data at cursor
    int get(){
        return cursor.data;
    }

    //Manipulation Procedures
    void clear(){
        this.cursor=this.front=this.back = null;
        this.length=0;
        this.index=-1;
    }

    void moveFront(){
        this.cursor = this.front;
        this.index = 0;
    }

    //Move cursor to the next spot
    void moveNext(){
        if(this.index + 1 == this.length){
            this.cursor = null;
            this.index = -1;
         }
         else{
            this.cursor = this.cursor.next;
            this.index++;
         }
    }

    //Add  node after the current cursor
    void append(int data){
        Node temp = new Node(data, this.back, null);
        if(this.front ==  null){
            this.front = temp;
            this.back = temp;
        }
        else{
            this.back.next = temp;
            this.back = temp;
        }
        this.length++;
    }

    //Delete front Node
    void deleteFront(){
        Node temp = front;
        if(this.length>1){
            this.front = temp.next;
            this.front.prev = null;
            temp.next = null;
        }
        this.length--;
    }

    //Delete last Node
    void deleteBack(){
        Node temp = this.back;
        this.back = temp.prev;
        this.back.next = null;
        temp.prev = null;
        this.length--;
    }

    //Delete where the cursor is located at
    void delete(){
        if(this.cursor == this.back) deleteBack();
        else if(this.cursor == this.front) deleteFront();
        else{
            this.cursor.prev.next = this.cursor.next;
            this.cursor.next.prev = this.cursor.prev;
            this.cursor = this.cursor.prev;
            this.index--;
            this.length--; 
        }
    }

    //Print out the list
    public String toString(){
        Node temp = this.front;
        String print = "";
        while (temp != null){
            print = print + String.valueOf(temp.data) + " ";
            temp = temp.next;
        }
        return print;
   }
}
