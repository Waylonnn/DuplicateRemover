import java.util.Scanner;

public class DuplicateRemover {
    public static void main(String[] args) {
        String string;
        String temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter string you wish to have duplicates removed from:");
        string = scan.nextLine();
        String newString = "";
        for(int i = 0; i < string.length(); i++){
            temp = string.substring(i, i + 1);
            if(!newString.contains(temp)){
                newString += temp;
            }
        }
        System.out.println(newString);
    }
}