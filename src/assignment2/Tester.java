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
        
        /////////////////////// INVENTORY ///////////////////////////////////////////////
        LibraryBook book1 = new LibraryBook("Pride and Prejudice", "Jane Austen", "9788938204547", "1813", "Available");
        LibraryBook book2 = new LibraryBook("A Pocket Full of Rye", "Agatha Christie", "9788938204547", "1953", "Available");
        LibraryBook book3 = new LibraryBook("Ulysses", "James Joyce", "9781443414913", "1922", "Available");
        LibraryBook book4 = new LibraryBook("Nineteen Eighty-Four", "George Orwell", "9781471331435", "1949", "Available");
        LibraryBook book5 = new LibraryBook("War and Peace", "Leo Tolstoy", "9781602523692", "1869", "Available");
        
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        
        while (running == true){

            System.out.println("*MAIN MENU*");
            System.out.println("Select a book number to view its information:");
            System.out.println("1) " + book1);
            System.out.println("2) " + book2);
            System.out.println("3) " + book3);
            System.out.println("4) " + book4);
            System.out.println("5) " + book5);

            String in = sc.nextLine();

            switch (in) {
                case "1":
                    book1.printInfo();
                    System.out.println("\n Select an option:");
                    System.out.println("1) Rent Book");
                    System.out.println("2) Deliver Book");
                    System.out.println("3) Go Back to Main Menu");
                    
                    in = sc.nextLine();
                    
                    switch (in){
                        case "1":
                            //if
                    }
                    break;
                case "2":
                    book2.printInfo();
                    break;
                case "3":
                    book3.printInfo();
                    break;
                case "4":
                    book4.printInfo();
                    break;
                case "5":
                    book5.printInfo();
                    break;
            }
        }
    }    
}
