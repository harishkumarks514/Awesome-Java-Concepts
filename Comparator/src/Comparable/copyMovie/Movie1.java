package Comparable.copyMovie;

// USING THE COMPARETO METHOD


//Java program to demonstrate 
//the use of Comparable for sorting
import java.util.ArrayList;
import java.util.Collections;

//Movie class implements Comparable 
//interface to define default sorting
class Movie1 implements Comparable<Movie1> {
 private String n; // Movie Name
 private double r; // Movie Rating
 private int y; // Release year of the movie

 // Constructor 
 public Movie1(String n, double r, int y) {
     this.n = n;
     this.r = r;
     this.y = y;
 }

 // Implementation of the compareTo method 
 // for default sorting by year
 public int compareTo(Movie1 m) {
   
     // Sort movies in ascending 
     // order of year
     return this.y - m.y; 
 }

 // Getter and Setter method 
 public String getName() {
     return n;
 }

 public double getRating() {
     return r;
 }

 public int getYear() {
     return y;
 }
}

  class temp {
 public static void main(String[] args) {
   
     // Create a list of movies
     ArrayList<Movie1> l = new ArrayList<>();
     l.add(new Movie1("Star Wars", 8.7, 1977));
     l.add(new Movie1("Empire Strikes Back", 8.8, 1980));
     l.add(new Movie1("Return of the Jedi", 8.4, 1983));

     // Sort movies using Comparable's 
     // compareTo method by year
     Collections.sort(l);

     // Display the sorted list of movies
     System.out.println("Movies after sorting by year:");
     for (Movie1 m : l) {
       
         System.out.println(m.getName() + " " + m.getRating() + " " + m.getYear());
     }
 }
}