package com.example.Faculty.Repository;


import com.example.Faculty.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Facultyrepo extends JpaRepository<Faculty,Integer> {
}
