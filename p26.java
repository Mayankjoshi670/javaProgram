/*Q26.Define a class Word Example having the followingdescription: 
Data members/instance variables: 
private String strdata: to store a sentence. 
Parameterized Constructor WordExample(String) : Accept a 
sentence which may be terminated by either’.’, ‘? ’or’!’ only. The wordsmay be separated by 
more than one blank space and are in UPPER CASE. 
Member Methods: 
void countWord(): Find the number of wordsbeginning and 
ending with a vowel. 
void placeWord(): Place the words which begin andend with a vowel at the 
beginning, followed by the remaining words as they occur in the sentence 
*/

import java.util.* ; 
public class p26{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s ; 
    System.out.println("Enter a sentence");
    s = sc.nextLine() ; 
//  if you want to check weather it is in UPPER CASE or ends with  . ? ! you can i am not gono do this 
    countWords(s) ; 
    replaceWords(s) ; 
  }
  static void countWords(String s){
    String words[] = SplitString(s) ; 
    int cnt = 0 ; 
    System.out.println("words are ");
    for(int i = 0 ; i< words.length; i++){
        if(isVowel(words[i].charAt(0))&& isVowel(words[i].charAt(words[i].length() -1))){
            cnt++ ; 
            System.out.println(words[i]) ;
                  }
    }
    System.out.println( "No of words start and end with vowels are " + cnt) ;  
  }
 static  boolean isVowel(char ch){
    if( ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
      return true ; 
    }
    return false ;
  }





//  replace words
static void replaceWords(String s){
    String words[] = SplitString(s) ; 
    String result = "" ;
    String vowel = "" ; 
    String notVloel = "";
    for(int i = 0 ; i< words.length ; i++){
        if(isVowel(words[i].charAt(0))&& isVowel(words[i].charAt(words[i].length() -1))){
            vowel += words[i] + " " ; 
        }
        else{
            notVloel += words[i] + " " ; 
        }
    }
    result = vowel + notVloel ;
    System.out.println(result) ; 
 }

 static  String[] SplitString(String strdata){ 
 String newstr[]=strdata.substring(0,strdata.length()-1).split("\\s+"); 
 return newstr; 
 }
}


