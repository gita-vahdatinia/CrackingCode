//
//  main.cpp
//  full_Linkedlist
//
//  Created by Katelyn Suhr on 7/19/18.
//  Copyright © 2018 Katelyn Suhr. All rights reserved.
//

#include <iostream>
using namespace std;


struct Node{
    int data;
    Node *next;
};

class linked_list
{
private:
    Node *head, *tail;
    int length;
    
public:
    //constructor
    linked_list()
    {
        head = NULL;
        tail = NULL;
        length = 0;
    }
    
    int size(){
        return length;
    }
    
    void add_node(int n){
        Node *p = new Node;
        p->data = n;
        p->next = NULL;
        
        if(head == NULL)
        {
            head = p;
            tail = p;
        }
        else{
            tail->next = p;
            tail = tail->next;
        }
        length++;
    }
    
    Node *gethead(){
        return head;
    }
    
    static void display(Node *head)
    {
        if(head == NULL){
            cout << "NULL" << endl;
        }
        else
        {
            cout << head->data << endl;
            display(head->next);
        }
        
    }
    
    
    int findKthElement(Node *head, int k, int size){
        Node *start = head;     
        for(int i = 0; i< k; i++){
            start = start->next;
        }
        for(Node* end = start; end!= NULL; end=end->next){
            head = head->next;
        }
        return head->data;
    };

int main(int argc, const char * argv[]) {
    // insert code here...
    linked_list a;
    a.add_node(1);
    a.add_node(3); //return 3
    a.add_node(50);
    a.add_node(8);
    a.add_node(10);
   // a.display(a.gethead());
   // cout << "size: "<< a.size()<< endl;
    
    cout << a.findKthElement(a.gethead(), 2, a.size())<< endl;
    return 0;
}

