import java.util.*;
public class guessthenum {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the generated number");
    int num = sc.nextInt();
    System.out.println("enter your guess number");
    int guess= sc.nextInt();
    int count = 0;
   while(guess!=num){
    if(num>guess){
        System.out.println("guess is too low");
    }
    else if (num<guess){
        System.out.println("guess is too high");
    }
    System.out.println("enter your number guess again");
       guess=sc.nextInt();
    count++;  
} 
System.out.println("congrats! you got it right");
System.out.println("the number of attempts the user took before correct guess is"+" "+count);
 }   
}
