import java.util.Scanner;

class MovieRating {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
      
    System.out.println("Please enter the movie title?:");
    String title = scan.nextLine();

    System.out.println("Please enter the running time in minutes.:");
    int time = scan.nextInt();

    System.out.println("Please enter ratings from the movie review website.");
    int web1 = scan.nextInt();
    int web2 = scan.nextInt();
    int web3 = scan.nextInt();

    System.out.println("Please enter ratings from the focus group.:");
    double group1 = scan.nextDouble();
    double group2 = scan.nextDouble();

    System.out.println("Please enter the average movie critic rating.");
    double critic = scan.nextDouble();

    double AvgWeb = (double)(web1 + web2 + web3)/3;

    double AvgGroup = (double)(group1 + group2)/2;

    int rate = (int)(AvgWeb * .2 + AvgGroup *.3 + critic * .5);
    System.out.println("Title: " + title);
    System.out.println("Running time:" + time / 60 + "h" + time % 60);
    System.out.println("Average website rating:" + AvgWeb);
    System.out.println("Average focus group rating:" + AvgGroup);
    System.out.println("Average movie critic rating:" + critic);
    System.out.println("Overall movie rating:" + rate);



    }
}