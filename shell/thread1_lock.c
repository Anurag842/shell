#include<stdlib.h>
#include<stdio.h>
#include<unistd.h>
#include<pthread.h>
pthread_mutex_t mutex;
int c;
void *f1()
{
    int i,temp;
    for(i=0;i<5;i++)
    {
        pthread_mutex_lock(&mutex);
        temp=c;
        temp++;
        sleep(1);
        c=temp;
        pthread_mutex_unlock(&mutex);
        printf("\n%d %d",i,c);
    }
}
int main()
{
    pthread_t pth1,pth2;
    pthread_create(&pth1,NULL,f1,NULL);
    pthread_create(&pth2,NULL,f1,NULL);
    pthread_join(pth1,NULL);
    pthread_join(pth2,NULL);
    return 0;
}
