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
        LibraryBook book1 = new LibraryBook("Pride and Prejudice", "Jane Austen", "9788938204547", "1813");
        LibraryBook book2 = new LibraryBook("A Pocket Full of Rye", "Agatha Christie", "9788938204547", "1953");
        LibraryBook book3 = new LibraryBook("Ulysses", "James Joyce", "9781443414913", "1922");
        LibraryBook book4 = new LibraryBook("Nineteen Eighty-Four", "George Orwell", "9781471331435", "1949");
        LibraryBook book5 = new LibraryBook("War and Peace", "Leo Tolstoy", "9781602523692", "1869");
        
        Scanner sc = new Scanner(System.in);

        System.out.println("*MAIN MENU*");
        System.out.println("Select an option:");
        System.out.println("1) Check Inventory");
        System.out.println("2) Rent Book");
        System.out.println("3) Deliver Book");
        
        String in = sc.nextLine();
        
        switch (in) {
            case "1":
                System.out.println("Select a book number to view its information");
                System.out.println(book1);
                System.out.println(book2);
                break;
            case "2":
                System.out.println("");
                break;
            case "3":
                System.out.println("");
                break;
        }
    }
}
