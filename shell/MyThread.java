class FirstThread extends Thread{
FirstThread(){super("Child Thread"); System.out.println("Child thread starting"); start();}

public void run(){ for(int i=0;i<5;i++){
System.out.println(this.getName() + " "+i);
try{sleep(500);}catch(InterruptedException e){System.out.println(e);}
}// for
}// run
}//class //  ………………………………………………………………………..

class MyThread{public static void main(String str[]){ 
 FirstThread t1=new FirstThread();
for(int i=100;i<105;i++){

System.out.println(Thread.currentThread().getName() + " " +i); try{Thread.sleep(500);}
catch(InterruptedException e){System.out.println(e);}

}// for 
  System.out.println("Exit main");}   //main 
 } //Main //  ………………………………………………………………………………………..

