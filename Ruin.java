import java.util.Scanner; 
public class Ruin {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter amount of money you will start with.");
    double startAmount = in.nextDouble();
    System.out.println("Enter win chance.");
    double winChance = in.nextDouble();
    System.out.println("Enter win limit.");
    int winLimit = in.nextInt();
    int win = 0;
    int lose = 0;
    int numDays = 0;
    
    while(startAmount >= winLimit || startAmount <= 0); {
        double random = Math.random();
       if(winChance <= random){
        startAmount++;
        win++;
       }
     else  {
        startAmount--;
        lose--;
    } numDays++;
}
while (numDays <0) {
    if(win > 0){
    System.out.println("Day:" + numDays + "WIN"); 

    } else {
         System.out.println("Day:" + numDays + "LOSE");
         }
    }
    }
    }



