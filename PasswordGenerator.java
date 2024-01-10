import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator{
    public static void main(String[] args) {
    
    Scanner kb = new Scanner(System.in);
    Random rand = new Random();
    
    System.out.print("How many characters would you like? (min. 100): ");
    int numChars = kb.nextInt();
    
    if(numChars > 0 && numChars <= 100){
     
      char[] temp = new char[numChars];

        
      char numbers[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
      char uppercaseLetters[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',  'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
      char lowercaseLetters[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',  's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
      char mixedCharacters[] = {'@', '#', '%', '^', '&', '*', '$', '!'};
      
      
         
      for(int i = 0; i < numChars; i++){
      
         int generateChoice = rand.nextInt(4) + 1;
         
         if(generateChoice == 1){
            int generateRandom = rand.nextInt(numbers.length);
            temp[i] = numbers[generateRandom];
         }
         if(generateChoice == 2){
            int generateRandom = rand.nextInt(uppercaseLetters.length);
            temp[i] = uppercaseLetters[generateRandom];
         }
         if(generateChoice == 3){
            int generateRandom = rand.nextInt(lowercaseLetters.length);
            temp[i] = lowercaseLetters[generateRandom];
         }
         if(generateChoice == 4){
            int generateRandom = rand.nextInt(mixedCharacters.length);
            temp[i] = mixedCharacters[generateRandom];
         }
      
      }   
      
      System.out.println();
      System.out.print("Generated Password: ");
      for(int j = 0; j < temp.length; j++){
         System.out.print(temp[j]);
      }   
         
         
         
    }
    else if(numChars <= 0){
         System.out.println("Error: You Have To Enter At Least One Character");
    }
    else{
         System.out.print("Error: You Exceeded the Limit");
    }

    
    





        }
    }

