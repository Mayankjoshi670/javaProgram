/*
39	File Handling in Java:
Write a java file handling program to count and display the number of palindromes present in a text file "myfile.txt".
Example: If the file "myfile.txt" contains the following lines, My name is NITIN
Hello aaa and bbb wordHow are You
ARORA is my friendOutput will be => 4
 */import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class p39 {

    public static void main(String[] args) throws IOException {
        String fileName = "myfile.txt";
        int cnt = 0;

        BufferedReader buff = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = buff.readLine()) != null) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (isPalindrome(word)) {
                    System.out.println(word);
                    cnt++;
                }
            }
        }
        buff.close();
        System.out.println("Total number of palindrome words are " + cnt);
    }

    private static boolean isPalindrome(String word) {
        String cleanWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int length = cleanWord.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanWord.charAt(i) != cleanWord.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
