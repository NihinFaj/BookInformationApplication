/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Nihinlolamiwa Donaldson Fajemilehin)
 * @version (4th of October, 2018)
 */
public class Book
{
    // The author of the book
    private String author;
    // The title of the book
    private String title;
    // The number of pages of the book
    private int pages;
    // The reference number of the book
    private String refNumber;
    // The numner of times book has been borrowed
    private int borrowed;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }

    /**
     * Method to print book Author name
     */
    public void printAuthor()
    {
        System.out.println("Author name is " + author);
    }

    /**
     * Method to print book Title
     */
    public void printTitle()
    {
        System.out.println("Book title is " + title);
    }

    /**
     * Method to get book author name
     */
    public String getAuthor()
    {
        return author;
    }

    /**
     * Method to get book title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Method to get book pages
     */
    public int getPages()
    {
        return pages;
    }

    /**
     * Method to print the details of the book
     */
    public void printDetails()
    {
        System.out.println("Book author name is: " + author);
        System.out.println("Book title is: " + title);
        System.out.println("Number of book pages is: " + pages);
        if(refNumber.length() > 0) {
            System.out.println("Book reference number is: " + refNumber);
        }
        else { 
            System.out.println("Book reference number is: ZZZ");
        }
        System.out.println("The number of times book has been borrowed is: " + borrowed);
        System.out.println();
    }
    
    /**
     * Method to set book reference number
     * @param ref the reference of the book
     */
    public void setRefNumber(String ref)
    {
        if(ref.length() >= 3) {
            refNumber = ref;
        }
        else {
            System.out.println("Reference Number must be at least 3 characters");
        }
    }
    
    /**
     * Method to get book reference Number
     */
    public String getRefNumber()
    {
        return refNumber;
    }
    
    /**
     * Method to count how many times a book has been borrowed
     */
    public void borrow()
    {
        borrowed = borrowed + 1;
    }
    
    /**
     * Method to get the number of times a book has been borrowed
     */
    public int getBorrowed()
    {
        return borrowed;
    }
    
}
