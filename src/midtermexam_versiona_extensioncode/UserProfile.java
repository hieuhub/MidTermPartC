/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 * The user profile for the OnlineVids system. The user has a userID
 * and a favourite genre that must be one of the choices in the
 * genres array. This code is to be used for SYST 17796 midterm exam.
 * Students are reminded to add themselves as modifiers when editing the
 * code.
 * @author dancye, 2019
 */
public class UserProfile 
{
    
    private String userID;//the userID
    private String genre;// the user's preferred genre of movie
    private String[] genres = {"Comedy", "Drama", "Action", "Mystery"};//available genres of movies
    
    /**
     * A constructor that takes in the userID and the favourite genre
     * @param givenID the ID to assign to this user
     * @param givenGenre the users favourite genre
     */
    public UserProfile(String givenID, String givenGenre)
    {
        userID = givenID;
        genre= givenGenre;
    }

    /**
     * A getter for the userID
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * A getter for the genre
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }
}//end class



class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Choose your favorite genre:");
        displayGenres();

        int genreChoice;
        do {
            System.out.print("Enter the number of your favorite genre: ");
            genreChoice = scanner.nextInt();
        } while (genreChoice < 1 || genreChoice > 5);

        String favoriteGenre = getGenreByChoice(genreChoice);

        
        //Create an userProfile object with new information from the user 
        UserProfile userProfile = new UserProfile(name, favoriteGenre);
        System.out.println("Your user profile was created!");
    }
    //this method display the list of genres
    private static void displayGenres() {
        System.out.println("1. Action");
        System.out.println("2. Adventure");
        System.out.println("3. Comedy");
        System.out.println("4. Drama");
        System.out.println("5. Sci-Fi");
    }
    //this method uses switch case for user to choose a genre
    private static String getGenreByChoice(int choice) {
        switch (choice) {
            case 1:
                return "Action";
            case 2:
                return "Adventure";
            case 3:
                return "Comedy";
            case 4:
                return "Drama";
            case 5:
                return "Sci-fi";
            default:
                return null;
        }
    }
}
