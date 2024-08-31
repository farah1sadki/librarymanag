package com.example.librarymanagement.model;
import jakarta.persistence.*;
@Entity
public class Book
{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String title;
@ManyToOne
@JoinColumn(name="author_id" , nullable=false)
private Author author;

public void setid(Long id)
{
   this.id=id;	
}
public Long getid()
{
   return id;	
}

public void setitle(String title)
{
   this.title=title;	
}
public String getitle()
{
   return title;	
}










}

