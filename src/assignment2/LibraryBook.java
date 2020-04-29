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
    private String availability;
    
    ////////////////////////// CONSTRUCTORS ////////////////////////////////////////
    public LibraryBook(){}
    
    public LibraryBook(String title, String author, String ISBN, String yearOfPublishing, String availability){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearOfPublishing = yearOfPublishing;
        this.availability = availability;
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
    
    ///////////////////////////// ACCESSOR ////////////////////////////////////////
    public String getAvailability(){
        return availability;
    }
}
