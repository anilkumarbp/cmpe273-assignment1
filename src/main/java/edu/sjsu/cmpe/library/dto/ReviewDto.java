package edu.sjsu.cmpe.library.dto;

import static com.google.common.base.Preconditions.checkArgument;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import edu.sjsu.cmpe.library.domain.Book;

@JsonPropertyOrder(alphabetic = true)
public class ReviewDto extends LinksDto {
    private Book book;

    /**
     * @param book
     */
    public  ReviewDto(Book book) {
	super();
	this.book = book;
    }

    /**
     * @return the book
     */
    public Book getReview() {
    	
	return book;
    }

    /**
     * @param book
     *            the book to set
     */
    public void setReview(Book book) {
	this.book = book;
    }
}
