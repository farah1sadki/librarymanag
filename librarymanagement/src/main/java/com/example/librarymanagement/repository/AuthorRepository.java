package com.example.librarymanagement.repository;
import com.example.librarymanagement.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AuthorRepository extends JpaRepository<Author,Long> 
{

}
