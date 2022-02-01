/* 
WAP to Implement Singly Linked List with following operations
a) Create a linked list. b) Insertion of a node at first position, at any position and at end of list. c) Display the contents of the linked list.
*/

#include<stdio.h>
#include<stdlib.h>

struct node 
{
    int data;
    struct node *next;

};

struct node *head=NULL;

void begininsert();
void insertend();
void insertloc();
void display();
void create();

void create()
{
    struct node *ptr, *temp;

    if (temp == NULL) 
    {
        printf("\nOUT OF MEMORY SPACE");
        return;
    }
    temp = (struct node*) malloc(sizeof(struct node));
    printf("\nenter element: ");
    scanf("%d", &temp->data);
    if (head == NULL)
    {
        head = temp;
    }
    else
    {
        ptr = head;
        while(ptr -> next != NULL)
        {
            ptr = ptr->next;
        }
        ptr -> next = temp;
    }
       printf("\nNODE INSERTED.\n");
}

void begininsert()
{
    struct node *temp = (struct node*) malloc (sizeof(struct node));
    if (temp == NULL)
    {
        printf("out of memory space.\n");
        return;
    }
   
        printf("enter data into node:");
        scanf("%d",&temp->data);
        temp -> next = NULL;
        if(head == NULL) head = temp;
        else
        {
            temp-> next = head;
            head = temp;
        }
        printf("\nNODE INSERTED.\n");
}

void insertend()
{
    struct node *ptr, *temp = (struct node*)malloc (sizeof(struct node));
    if (temp == NULL) 
    {
        printf("out of memory\n");
        return;
    }
    printf("enter element: ");
    scanf("%d", &temp->data);
    temp -> next = NULL;
    if(head == NULL) head = temp;
    else
    {
        ptr = head;
        while(ptr->next != NULL)
        {
            ptr = ptr->next;
        }
        ptr->next = temp;
    }
      printf("\nNODE INSERTED.\n");

}

void insertloc()
{
    struct node *ptr, *temp = (struct node*) malloc (sizeof(struct node));
    if (temp == NULL)
    {
        printf("outof memory space: ");
        return;
    }
    printf("enter element: ");
    scanf("%d", &temp->data);
    temp -> next = NULL;
    int i = 0, loc;
    printf("enter position for insertion: ");
    scanf("%d", &loc);
    if (loc == 0)
    {
        temp -> next = head;
        head = temp;
        printf("\nNODE INSERTED.\n");
    }
    else
    {
        ptr =  head;
        for(i = 0; i< loc -1; i++)
        {
            ptr = ptr->next;
            if(ptr->next == NULL)
            {
                printf("position dosen't exist on the list");
                return;
            }
        }
        temp -> next = ptr -> next;
        ptr -> next = temp;
        printf("\nNODE INSERTED.\n");

    }

}
void display()
{
    struct node *ptr;
    ptr = head;
    printf("LIST: ");
    while(ptr != NULL)
    {
        printf("%d ", ptr->data);
        ptr=ptr -> next;
    }
}

void main()
{  
    while(1)
    {
    int choice;
    printf("                MAIN MENU");
    printf("\n\n1.CREATE A LIST. \n2.INSERT AT THE BEGINIG OF THE LIST. \n3.INSERT AT THE END OF THE LIST. \n4.INSERT AT A GIVEN POSITION\n5.DISPLAY THE LIST. \n6.EXIT.");
    printf("\n\nenter your choice: ");
    scanf(" %d", &choice);
    switch(choice)
    {
        case 1:
        create();
        break;

        case 2:
        begininsert();
        break;

        case 3:
        insertend();
        break;
        
        case 4:
        insertloc();
        break;

        case 5:
        display();
        break;
        
        case 6:
        exit(0);
        break;

        default: 
        printf("ENTER A VALID OPTION. ");
        break;

    }
    }

}