#include <stdio.h>
#include <stdlib.h>

struct student 
{
    int roll, age;
    char *name;
};
typedef struct student studentt;
studentt student[5];
void printroll(int i)
{
    printf("\nstudent %d:",i);
    printf("\nName: %s", student[i].name);
    printf("\nAge: %d", student[i].age);
    printf("\nRoll: %d ",student[i].roll);
}
void main ()
{   int x;
    printf("\nEnter details: \n");
    for (int i = 0; i<5; i++)
    {
        printf("\nroll no: ");
        scanf("%d", &student[i].roll);
        printf("\nage: ");
        scanf("%d", &student[i].age);
        student[i].name = malloc(1024);
        printf("\nname: ");
        scanf("%1023s", student[i].name);
    }
    printf("\nEnter roll number to view details: ");
    scanf("%d", &x);
    printroll(x-1);
}