package com.example.librarymanagement.model;
import jakarta.persistence.*;
import java.util.Set;

@Entity

public class Author
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	@OneToMany(mappedBy="author")
	private Set<Book> books;

	public void setId(Long id) 
	{
		 this.id=id;
		
		
	}
	public Long getid()
	{
		return id;
	}
	
	public void setname(String name) 
	{
		 this.name=name;
		
		
	}
	public String getname()
	{
		return name;
	}
	
	
	
}