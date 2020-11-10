import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int[] seatNumbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,15};//seat numbers

    String[] names = new String[14];//makes a string of 15

    Scanner myObj = new Scanner(System.in);//the scanner to get the names

    for (int i = 0; i < seatNumbers.length; i++) {

      System.out.println("what is your name? ");
      names[i] = myObj.nextLine();//prints what is your name and then lets you type into it.

    }
    int i = 0;
    while (i < seatNumbers.length) {
      
      System.out.println(names[i] + " sits in seat " + seatNumbers[i]);
      i++;//make sure this is last in this loop
    }

  }
}
