using namespace std;

struct Node{
    Node* next;
    Node* prev;
    int data; 
};


class LinkedList{
    public:
        int length;
        Node* cursor; 
        Node* front;
        int index; 
        LinkedList();
        ~LinkedList();
        void add(int data);
        void print();
}

LinkedList::LinkedList(){
    this->length = 0;
    this->index = -1;
    this->front = NULL;
}

LinkedList::~LinkedList(){
    cout << "List Deleted" << endl;
}


