#include<stdio.h>
#include<stdlib.h>  // For exit() function

#define SIZE 20

struct queue
{
    int item[SIZE];
    int rear;
    int front;
};

typedef struct queue qu;

// Function declarations
void insert(qu*);
void delet(qu*);  // Changed from delete
void display(qu*);

int main()  // Changed from void main() to int main()
{
    int ch;
    qu q;  // Create actual queue object
    qu *q_ptr = &q;  // Pointer to queue
    
    // Initialize queue
    q.rear = -1;
    q.front = 0;
    
    // Removed clrscr() - not standard C/C++
    
    printf("Menu for program:\n");
    printf("1:insert\n2:delete\n3:display\n4:exit\n");
    
    do {
        printf("Enter your choice: ");
        scanf("%d", &ch);
        
        switch(ch)
        {
            case 1:
                insert(q_ptr);
                break;
            case 2:
                delet(q_ptr);
                break;
            case 3:
                display(q_ptr);
                break;
            case 4:
                exit(0);
                break;
            default:
                printf("Your choice is wrong\n");
        }
    } while(ch < 5);
    
    return 0;  // Added return statement
}

/*insert function*/
void insert(qu *q)
{
    int d;
    
    printf("Enter data to be inserted: ");
    scanf("%d", &d);
    
    if(q->rear == SIZE-1)
    {
        printf("Queue is full\n");
    }
    else
    {
        q->rear++;
        q->item[q->rear] = d;
    }
}

/*delete function*/
void delet(qu *q)
{
    int d;
    
    if(q->rear < q->front)
    {
        printf("Queue is empty\n");
    }
    else
    {
        d = q->item[q->front];
        q->front++;
        printf("Deleted item is: %d\n", d);
    }
}

/*display function*/
void display(qu *q)
{
    int i;
    
    if(q->rear < q->front)
    {
        printf("Queue is empty\n");
    }
    else
    {
        printf("Queue elements: ");
        for(i = q->front; i <= q->rear; i++)
        {
            printf("%d\t", q->item[i]);
        }
        printf("\n");
    }
}
