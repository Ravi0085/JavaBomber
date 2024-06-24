package muqsd;
import java.util.Random;
import java.util.Scanner;
public class Game {
	public static void main(String[] args) {
		Random rand=new Random();
		var a=rand.nextInt(10)+1;
		Scanner scan=new Scanner(System.in);
		int count=1;
		for(int i=1;i<=5;i++) {
			System.out.println("Guess a Number b/w 1 to 200");
			var b=scan.nextInt();
			count++;
			if(a==b) {
				System.out.println("Woho You Win!!!");	}
			else if(b>a) {
				System.out.println("Greater Number. Please Try again");	}
			else if(b<a) {
				System.out.println("Smaller Number. Please Try again");}
			if(count==5) {
				System.out.println("Looser!!!");}}}}
