package com.example.librarymanagement.controller;

import com.example.librarymanagement.model.Borrower;
import com.example.librarymanagement.service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/borrowers")
public class BorrowerController {
    @Autowired
    private BorrowerService borrowerService;

    @GetMapping
    public List<Borrower> getAllBorrowers() {
        return borrowerService.getAllBorrowers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Borrower> getBorrowerById(@PathVariable Long id) {
        Optional<Borrower> borrower = borrowerService.getBorrowerById(id);
        return borrower.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Borrower> createBorrower(@RequestBody Borrower borrower) {
        return new ResponseEntity<>(borrowerService.saveBorrower(borrower), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Borrower> updateBorrower(@PathVariable Long id, @RequestBody Borrower borrower) {
        if (!borrowerService.getBorrowerById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        borrower.setid(id);
        return ResponseEntity.ok(borrowerService.saveBorrower(borrower));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBorrower(@PathVariable Long id) {
        if (!borrowerService.getBorrowerById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        borrowerService.deleteBorrower(id);
        return ResponseEntity.noContent().build();
    }
}
