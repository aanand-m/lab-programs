#include <stdio.h>
#include <stdlib.h>
# define max 5

int queue[max], front, rear;

void initialize();
void display();
void insert(int x);
int delete();
int isEmpty();
int isFull();
void initialize()
{
    front = -1;
    rear = -1;
}

void insert(int x)
{
    if(front == -1) front++;
    if (isFull()) 
    {
        printf("\nQUEUE OVERFLOW!");
        return;
    }
    if(rear == max - 1) rear = 0;
    else
    {    
        rear++;
        queue[rear] = x;
    }
    
}

int delete()
{
    if (isEmpty())
    {
        printf("\nQUEUE UNDERFLOW: ");
    }
    int temp = queue[front];
    if(front == rear)
    {
        front = -1;
        rear = -1;
    }
    else if (front == max -1) front = 0;
    else front++;
    return temp;
}

int isEmpty()
{
    if (front == -1) return 1;
    else return 0;
}

int isFull()
{
    if ((front = rear + 1) || (front = 0 && rear == max - 1)) return 1;
    else return 0;
}

void display()
{
    if(isEmpty()) 
    {
        printf("\nQUEUE IS EMPTY!");
        return;
    }
    if(front <= rear )
    {
        printf("elements of queue: ");
        for(int i = front; i <= rear ; i++)
        {
            printf("%d ",queue[i]);
        }
    }
    if (front > rear)
    {
        printf("elements of queue: ");
        for(int i = front; i <= (max-1) ; i++)
        {
            printf("%d ",queue[i]);
        }
        for(int j = 0; j <= rear ; j++)
        {
            printf("%d ",queue[j]);
        }
    }
}

void main ()
{
    int choice,x;
    initialize();
    while(1)
    {
    printf("\nCHOOSE ONE OF THE OPTIONS TO PERFORM THE FOLLOWING OPTIONS: ");
    printf("\n1. INSERT AN ELEMENT \n2. DELETE AN ELEMENT \n3. DISPLAY ALL THE ELEMENTS \n4. REVEAL NUMBER OF ELEMENTS OF IN THE QUEUE\n5.REVEAL FRONT ELEMENT \n6. QUIT\n\n");
    scanf("%d", &choice);
    if(choice == 6) break;
    switch(choice)
    {
        case 1:
        printf("\nENTER AN ELEMENT: ");
        scanf("%d", &x);
        insert(x);
        break;
        case 2:
        printf("\nELEMENT DELETED: %d ",delete());
        break;
        case 3:
        display();
        break;
        default: 
        printf("WRONG CHOICE :(\n");
    }
}
}