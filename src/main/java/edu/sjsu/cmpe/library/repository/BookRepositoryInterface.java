package edu.sjsu.cmpe.library.repository;

import javax.ws.rs.core.Response;

import edu.sjsu.cmpe.library.domain.Book;

/**
 * Book repository interface.
 * 
 * What is repository pattern?
 * 
 * @see http://martinfowler.com/eaaCatalog/repository.html
 */
public interface BookRepositoryInterface {
    /**
     * Save a new book in the repository
     * 
     * @param newBook
     *            a book instance to be create in the repository
     * @return a newly created book instance with auto-generated ISBN
     */
    Book saveBook(Book newBook);

    /**
     * Retrieve an existing book by ISBN
     * 
     * @param isbn
     *            a valid ISBN
     * @return a book instance
     */
    Book getBookByISBN(Long isbn);
    /**
     * Delete an existing book by ISBN
     * 
     * @param isbn
     *            a valid ISBN
     * @return a deleted book instance with the ISBN
     */
    boolean delBookByISBN(Long isbn);
    
    boolean updateBookByISBN(Long isbn,String status);

   
        

    // TODO: add other operations here!
}
