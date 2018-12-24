class Target01{

 synchronized
 void callme(String s)
{System.out.print("[ "+s);
try{Thread.sleep(5000);}catch(InterruptedException e){}
System.out.println(" ]"+" 2017");
}
}////////////////////////////




class Locking{
public static void main(String str[])
{ final Target01 thing1=new Target01();


new Thread(){
public void run(){thing1.callme("FFF");}}.start();

new Thread(){
public void run(){thing1.callme("SSS");}}.start();


}
}
