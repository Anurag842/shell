class MultiThread implements Runnable{Thread t;
MultiThread(){t=new Thread(this); t.start();}
public void run(){
System.out.println("Initialize "+ t.getName());
for(int i=0;i<5;i++){
System.out.println(t +" "+i);
}
System.out.println("Exit "+ t.getName());
}//run
}//class  …………………………………………

class ManyThreads{
public static void main(String str[]){
//System.out.println("No of th at begin: "+Thread.activeCount());
MultiThread t1,t3,t5;
t1=new MultiThread();;t3=new MultiThread();
t5=new MultiThread();
System.out.println("No of th at begin: "+Thread.activeCount());

}//main 
    }// Main
