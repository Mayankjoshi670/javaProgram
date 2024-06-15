/*
Write a java program for to solve producer consumer problem in which a
producer produces a value and consumer consume the value before producer generate the next value
 */

import java.util.* ;
class demo{
    int i  ; 
    boolean produced = false ;
    public void synchronized producer(int i ){
        if(produced){
            try{
                wait() ; 
            }
            catch(){}
        }
        i = 10 ; 
        System.out.println("Producer") ; 
        notify() ; 
    }
    public void synchronized consumer(int i ){
        if(!produced){
            try{
                wait() ; 
            }
            catch(){}
        }
        i = 10 ; 
        System.out.println("Producer") ; 
        notify() ;
    }
}