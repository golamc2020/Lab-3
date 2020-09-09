package day1;

import java.util.Scanner;

public class Lab3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		
		boolean shouldContinue = true;
		String response;

		while(shouldContinue==true) {
			System.out.println("Enter an integer: ");
			int num=scnr.nextInt();
				{
					if(num%2==1) {
						System.out.println(num+" and odd");
					}else if((num%2==0)&&(num<=25)) {
						System.out.println(num+", even and less than 25");
					}else if((num%2==0)&&(num>=26)&&(num<=60)) {
						System.out.println(num+" and even");
					}else if((num%2==0)&&(num>60)) {
						System.out.println(num+" and even");
					}else if((num%2==1)&&(num>60)) {
						System.out.println(num+", odd and over 60");
				}else {
					System.out.println("you entered an invalid number");
				}

			}
				System.out.println("Would you like to roll again? y/n");
				response = scnr.next();
				shouldContinue = response.equalsIgnoreCase("y");

		}
		
		System.out.println("Goodbye!");
			}
		}
