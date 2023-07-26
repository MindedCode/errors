// Error all function not call

#include<stdio.h>
#include<stdlib.h>

struct ListNode{
    int data;
    struct ListNode *next;
};

void traverse(struct ListNode *ptr){
    
    while(ptr != NULL){
        printf("%d ", ptr->data);
        ptr = ptr->next;
    }
}

struct ListNode *insertAtFirst(struct ListNode *conn, int nData){
    struct ListNode *ptr = (struct ListNode *)malloc(sizeof(struct ListNode));
    
    ptr->next = conn;
    ptr->data = nData;
    printf("\nInsert first position :\n");
    return ptr;
    
    // ptr->data = nData;
    // ptr->next = conn;
    // conn = ptr;
    // return conn;
}

struct ListNode *insertAtBw(struct ListNode *conn, int nData, int posi){
    
    struct ListNode *ptr = (struct ListNode *)malloc(sizeof(struct ListNode));
    struct ListNode *p = conn;
    
    int i=0; 
    while(i != posi-1){
        p = p->next;
        i++;
    }
    ptr->data = nData;
    ptr->next = p->next;
    p->next = ptr;
    printf("\nInsert at Between :\n");
    return conn;
}

struct ListNode *insertAtEnd(struct ListNode *conn, int nData){
    
    struct ListNode *ptr = (struct ListNode *)malloc(sizeof(struct ListNode));
    ptr->data = nData;
    struct ListNode *p = conn;
    
    while(p->next != NULL){
        p = p->next;
    }
    p->next = ptr;
    ptr->next = NULL;
    
    // ptr->next = NULL;
    // p->next = ptr;
    
    printf("\nInsert at End:\n");
    return conn;
}

struct ListNode *delAtFirst(struct ListNode *conn){
    printf("\nDeleted first Node-------------\nDeleted element: %d\n", conn->data);
    struct ListNode *ptr = conn;
    conn = conn->next;
    // ptr->next = conn;
    free(ptr);
    printf("\n");
    return conn;
}

struct ListNode *delAtBetw(struct ListNode *conn, int index){
    struct ListNode *p = conn;
    struct ListNode *q = conn->next;
    int i=0; 
    while(i != index-1){
        p = p->next;            //p = p->next; q = q->next;
        i++;
    }
    p->next = q->next;
    // p = p->next;
    // q = q->next;
    printf("\nBetween deleted list-----------\nDeleted: %d index, Deleted element: %d\n", index, q->data);
    free(q);
    printf("\n");
    return conn;
}

struct ListNode *delAtLast(struct ListNode *conn){
    struct ListNode *p = conn;
    struct ListNode *q = conn->next;
    
    int i=0; 
    while(q->next != NULL){
        p = p->next;    //p = p->next;  error aayegi
        q = q->next;
        i++;
    }
    p->next = NULL;
    printf("\nDeleted last Node: ------------------\nDeleted element: %d\n", q->data);
    free(q);
    printf("\n");
    return conn;
}

struct ListNode *delAtElement(struct ListNode *conn, int value){
    struct ListNode *p = conn;
    struct ListNode *q = conn->next;
     
    while(q->data != value && q->next != NULL){
        p = p->next;            //p = p->next; q = q->next;
    }
    // value = 0;
    if(q->data == value){
        p->next = q->next;
        free(q);
    }
    else printf("\nthis element is not in the list : %d", value);
    
    // printf("Between deleted list-----------\nDeleted: %d index, Deleted element: %d\n", index, q->data);
    
    printf("\n");
    return conn;
}



int main(){
    
    struct ListNode *conn = (struct ListNode *)malloc(sizeof(struct ListNode));
    struct ListNode *sec = (struct ListNode *)malloc(sizeof(struct ListNode));
    struct ListNode *third = (struct ListNode *)malloc(sizeof(struct ListNode));
    struct ListNode *fourth = (struct ListNode *)malloc(sizeof(struct ListNode));
    
    // connecting nodes
    (*conn).data = 11;
    conn->next = sec;
    
    sec->data = 12;
    sec->next = third;
    
    third->data = 13;
    third->next = fourth;
    
    fourth->data = 14;
    fourth->next = NULL;
    
    // call functions==========================
    printf("Original List: ");
    traverse(conn);
    printf("\n");
    
    int element = 15;
    conn = insertAtFirst(conn, element);
    traverse(conn);
    
    
    printf("\n");
    int index = 1;  // 0 index ke liye nhi chalega
    conn = insertAtBw(conn, element, index);
    traverse(conn);
    
    
    printf("\n");
    conn = insertAtEnd(conn, element);
    traverse(conn);
    
    
    
    printf("\n");
    conn = delAtFirst(conn);
    traverse(conn);
    
    
    printf("\n");
    conn = delAtBetw(conn, 2);
    printf("Remaining List :");
    traverse(conn);
    
    printf("\n");
    conn = delAtLast(conn);
    printf("Remaining List :");
    traverse(conn);
    
    printf("\n");
    conn = delAtElement(conn, 12);      //sec->data
    printf("Remaining List :");
    traverse(conn);
}


Output is:

// Original List: 11 12 13 14 

// Insert first position :
// 15 11 12 13 14 

// Insert at Between :
// 15 15 11 12 13 14 

// Insert at End:
// 15 15 11 12 13 14 15 

// Deleted first Node-------------
// Deleted element: 15

// 15 11 12 13 14 15 

// Between deleted list-----------
// Deleted: 2 index, Deleted element: 11

