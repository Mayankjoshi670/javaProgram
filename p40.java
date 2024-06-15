/*
Multithreaded programming:
Write a program MultiThreads that creates two threads-one thread with the name CSthread and the other thread named ITthread.

Each thread should
display its respective name and execute after a gap of 500 milliseconds. Each thread should also display a number indicating the number of times it got a
chance to execute.
 */

import java.util.*  ; 
 class MyThread extends Thread{
    public String threadName ; 
    public MyThread(String name){
        threadName = name ; 
    }
    public void run(){
        for(int i = 0 ; i< 5 ; i++){
            System.out.println(threadName + "is executing") ; 
        try{
            Thread.sleep(500) ; 
        }
        catch( InterruptedException  e){
            System.out.println(threadName + "has stoped") ; 
        }
        }
    }
 }
 public class p40{

    public static void main(String []props){
        MyThread CSthread = new MyThread("CSthread") ; 
        MyThread ITthread = new MyThread("ITThread") ; 
        CSthread.start() ; 
        ITthread.start() ; 
    }

}