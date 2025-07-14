package linkedList;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    public Node(){
        next=null;
    }
}

class list extends Node{
    Node head, temp;

    public list(){
        head =null;
        temp=null;
    }

    void create(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of elements you want in linked list:- ");
        int size=sc.nextInt();
        for (int i=0; i<size; i++){
            System.out.print("Enter data:- ");
            int val=sc.nextInt();
            Node newnode=new Node();
            newnode.data=val;
            if (head==null){
                head=newnode;
                temp= head;
            }
            else{
                temp.next=newnode;
                temp=temp.next;
            }
        }
    }

    void display(){
        System.out.println("\nSimple Linked List:- ");
        temp= head;
        while (temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.print("Null\n");
    }

    void insertStart(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the data you want to insert at the start:- ");
        int val=sc.nextInt();
        Node newnode=new Node();
        newnode.data=val;
        newnode.next=head;
        head=newnode;
    }

    void insertEnd(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the data you want to insert at the end:- ");
        int val=sc.nextInt();
        Node newnode=new Node();
        newnode.data=val;
        temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }

}
public class simpleLinkedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=1, choice;
        list l=new list();
        while (p==1){
            System.out.print("Choices:- \n" +
                    "1. Create\n"+
                    "2. Display\n"+
                    "3. Insert at Start\n"+
                    "4. Insert at End\n");
            System.out.print("Enter choice number:- ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    l.create();
                    break;
                case 2:
                    l.display();
                    break;
                case 3:
                    l.insertStart();
                    break;
                case 4:
                    l.insertEnd();
                    break;
                default:
                    System.out.println("Invalid choice\n");
                    break;
            }
            System.out.print("\nDo you want to continue? (1/0):-  ");
            p=sc.nextInt();
        }
    }
}
