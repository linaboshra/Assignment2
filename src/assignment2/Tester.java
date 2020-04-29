/*
 * Copyright (C) 2020 Lina Boshra
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package assignment2;

import java.util.Scanner;

/**
 * This program runs the Library class.
 * 
 * @author Lina's PC
 */
public class Tester {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("*MAIN MENU*");
        System.out.println("Select an option:");
        System.out.println("1) Check Inventory");
        System.out.println("2) Rent Book");
        System.out.println("3) Deliver Book");
        
        String in = sc.nextLine();
    }
}
