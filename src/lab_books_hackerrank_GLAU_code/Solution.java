import java.io.*;
import java.util.*;



public class Solution {

    public static void main(String[] args) {
        // Book b = new Book();
        Scanner input=new Scanner(System.in);
        int no_of_entry= input.nextInt();
        if (no_of_entry==0){
            System.out.println("N/A");
        }
        else{
            String [] books=new String[no_of_entry];
            String [] authors=new String[no_of_entry];
            String [] isbns=new String[no_of_entry];
            input.nextLine();
            for(int i=0;i<no_of_entry;i++){

                String book_name= input.nextLine();
                String author_name= input.nextLine().trim();
                String ISBN_no=input.nextLine();
                books[i]=book_name;
                authors[i]=author_name;
                isbns[i]=ISBN_no;
            }
            for(int i=0;i<no_of_entry;i++){
                System.out.println("-----------------------------");
                System.out.println("Book Name:\t"+books[i]);
                System.out.println("Author Name:\t"+authors[i]);
                System.out.println("ISBN:\t"+isbns[i]);

                System.out.println("-----------------------------");
            }
        }
    }
}