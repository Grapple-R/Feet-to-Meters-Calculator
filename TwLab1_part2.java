/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TwLab1_part2;

/**
 *
 * @author Taurin
 */
import java.util.Scanner;
public class TwLab1_part2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

		// Create constant value
		final double feet_to_meters = 0.305;

		// Prompt user to enter a number in feet
		System.out.println("Enter amount of feet");
		double feet = input.nextDouble();

		// Convert feet into meters
		double meters = feet * feet_to_meters;

		// Display results
		System.out.println(feet + " feet is equal to " + meters + " meters");
}
}