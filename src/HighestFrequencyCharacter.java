import java.util.Scanner;
public class HighestFrequencyCharacter {
    public static void main(String[] args) {
        int highCount = 0;
        int count;
        String highString = "";
        String string;
        String currentLetter;
        System.out.println("Enter a String: ");
        Scanner scan = new Scanner(System.in);
        string = scan.nextLine();
        for (int i = 0; i < string.length(); i++){
            count = 0;
            currentLetter = string.substring(i, i + 1);
            for(int j = 0; j < string.length(); j++){
                if(currentLetter.equals(string.substring(j, j + 1))){
                    count++;
                }
            }
            if(count > highCount){
                highCount = count;
                highString = string.substring(i, i + 1);
            }
        }
        System.out.println("'" + highString + "' - Frequency: " + highCount);
    }
}
