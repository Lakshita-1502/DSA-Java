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

    void insertByIndex(int index){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the data you want to insert after "+index+" position:- ");
        int val=sc.nextInt();
        Node newnode=new Node();
        newnode.data=val;
        temp=head;
        for (int i=1; i<index; i++){
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }

    void insertByData(int value){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the data you want to insert after "+value+":- ");
        int val=sc.nextInt();
        Node newnode=new Node();
        newnode.data=val;
        temp=head;
        while (temp.data!=value){
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }

    void deleteStart(){
        if (head==null){
            System.out.print("Linked list is empty");
            return;
        }
        temp=head;
        head=head.next;
        temp.next=null;
    }

    void deleteEnd(){
        if (head==null){
            System.out.print("Linked list is empty");
            return;
        }
        temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

    void deleteByIndex(int index){
        if (head==null){
            System.out.print("Linked list is empty");
            return;
        }
        temp=head;
        for (int i=1; i<index; i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }

    void deleteByData(int value){
        if (head==null){
            System.out.print("Linked list is empty");
            return;
        }
        temp=head;
        while (temp.data!=value){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
}

public class simpleLinkedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=1, choice, index, value;
        list l=new list();
        while (p==1){
            System.out.print("Choices:- \n" +
                    "1. Create\n"+
                    "2. Display\n"+
                    "3. Insert at Start\n"+
                    "4. Insert at End\n"+
                    "5. Insert after Index\n"+
                    "6. Insert after Data\n"+
                    "7. Delete at Start\n"+
                    "8. Delete at End\n"+
                    "9. Delete after Index\n"+
                    "10. Delete after Data\n");
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
                case 5:
                    System.out.print("Enter the index after which you want to insert:- ");
                    index=sc.nextInt();
                    l.insertByIndex(index);
                    break;
                case 6:
                    System.out.print("Enter the data after which you want to insert:- ");
                    value=sc.nextInt();
                    l.insertByData(value);
                    break;
                case 7:
                    l.deleteStart();
                    break;
                case 8:
                    l.deleteEnd();
                    break;
                case 9:
                    System.out.print("Enter the index after which you want to delete:- ");
                    index=sc.nextInt();
                    l.deleteByIndex(index);
                    break;
                case 10:
                    System.out.print("Enter the data after which you want to delete:- ");
                    value=sc.nextInt();
                    l.deleteByData(value);
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
