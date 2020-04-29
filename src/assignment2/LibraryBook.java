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

/**
 * This class encapsulates the concept of a library rental system.
 * 
 * @author Lina's PC
 */
public class LibraryBook {
    
    //////////////////////////// ATTRIBUTES ////////////////////////////////////////
    private String title;
    private String author;
    private String ISBN;
    private String yearOfPublishing;
    private static int booksTotal = 5;
    private static int booksRented = 0;
    private static int booksAvailable = 0;
    private static String availability = "Available";
    
    ////////////////////////// CONSTRUCTORS ////////////////////////////////////////
    public LibraryBook(){}
    
    public LibraryBook(String title, String author, String ISBN, String yearOfPublishing){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearOfPublishing = yearOfPublishing;
    }
    
    /////////////////////// MUTATORS ///////////////////////////////////////////////
    public void rentBook(){
        booksRented ++;
        booksAvailable --;
    }
    
    public void deliverBook(){
        booksRented --;
        booksAvailable ++;
    }
    
    /////////////////////// INVENTORY ///////////////////////////////////////////////
    LibraryBook book1 = new LibraryBook("Pride and Prejudice", "Jane Austen", "9788938204547", "1813");
    LibraryBook book2 = new LibraryBook("A Pocket Full of Rye", "Agatha Christie", "9788938204547", "1953");
    LibraryBook book3 = new LibraryBook("Ulysses", "James Joyce", "9781443414913", "1922");
    LibraryBook book4 = new LibraryBook("Nineteen Eighty-Four", "George Orwell", "9781471331435", "1949");
    LibraryBook book5 = new LibraryBook("War and Peace", "Leo Tolstoy", "9781602523692", "1869");
    
    ////////////////// TOSTRING METHOD /////////////////////////////////////////////
    public String toString(){
        return(title);
    }
    
    ////////////////// PRINT METHODS ///////////////////////////////////////////////
    public void printInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Year of publishing: " + yearOfPublishing);
        System.out.println("Availability: " + availability);
    }
    
}
