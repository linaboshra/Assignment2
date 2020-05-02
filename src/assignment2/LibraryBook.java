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
 * @author Lina Boshra
 */
public class LibraryBook {
    
    //////////////////////////// ATTRIBUTES ////////////////////////////////////////
    private String title;
    private String author;
    private String ISBN;
    private String yearOfPublishing;
    private String availability;
    private static int booksRented = 0;
    private static int booksAvailable = 5;
    
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
    
    public void setAvailabile(){
        availability = "Available";
    }
    
    public void setRented(){
        availability = "Rented";
    }
    
    ////////////////// TOSTRING METHOD /////////////////////////////////////////////
    public String toString(){
        return(title);
    }
    
    ////////////////// PRINT METHODS ///////////////////////////////////////////////
    public void printInfo(){
        System.out.println("\nTitle: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Year of publishing: " + yearOfPublishing);
        System.out.println("Availability: " + availability);
    }
    
    public void printOptions(){
        System.out.println("\n Select an option:");
        System.out.println("1) Rent Book");
        System.out.println("2) Deliver Book");
        System.out.println("3) Go Back to Main Menu");
    }
    
    ///////////////////////////// ACCESSORS ///////////////////////////////////////
    public String getAvailability(){
        return availability;
    }
    
    public int getBooksRented(){
        return booksRented;
    }
    
    public int getBooksAvailable(){
        return booksAvailable;
    }
    
    ///////////////////////////// ISBN CHECK ///////////////////////////////////////
    public boolean isISBNvalid(){
        int length = ISBN.length();
        int sum = 0;
    
        if (length != 13){
         return false;
        } else{
            int check = ISBN.charAt(12);
            for (int i = 0; i < 12; i ++){
                int digit = ISBN.charAt(i);
                if (i % 2 == 0){
                    sum += digit;
                } else{
                    sum += (digit * 3);
                }
            }
            int result = sum % 10;
            return 10 - result == check;
        }   
    }
}
