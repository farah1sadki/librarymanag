package com.example.librarymanagement.model;
import jakarta.persistence.*;
@Entity
public class Borrower
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	private String name;
	//getters et setters 
	public void setid(Long id)
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
