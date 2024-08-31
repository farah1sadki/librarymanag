package com.example.librarymanagement.service;
import com.example.librarymanagement.model.Book;
import com.example.librarymanagement.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class BookService
{
	@Autowired
	private BookRepository bookrepository ;
	
	public List<Book> getbooks()
	{
		return bookrepository.findAll();
	}
	
	public Optional<Book> getbookbyid(Long id)
	{
		return bookrepository.findById(id);
		
	}
	
	public Book savebook(Book book)
	{
		return bookrepository.save(book) ;
	}
	
	public void deletebook(Long id)
	{
		
		bookrepository.deleteById(id);
	}	

}
