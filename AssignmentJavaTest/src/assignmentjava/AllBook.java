/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentjava;

/**
 *
 * @author Admin
 */
public class AllBook {

    private int ID;
    private String bookName;
    private String author;
    private int year;
    private boolean status;
    private String recommendedAge;
    private static int idx = 0;

    public AllBook(String bookName, String author, int year, String recommendedAge, boolean status) {
        this.ID = ++idx;
        this.bookName = bookName;
        this.author = author;
        this.year = year;
        this.recommendedAge = recommendedAge;
        this.status = status;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the bookName
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * @param bookName the bookName to set
     */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return the recommendedAge
     */
    public String getRecommendedAge() {
        return recommendedAge;
    }

    /**
     * @param recommendedAge the recommendedAge to set
     */
    public void setRecommendedAge(String recommendedAge) {
        this.recommendedAge = recommendedAge;
    }
    
    public static int getidx() {
        return idx;
    }
}
