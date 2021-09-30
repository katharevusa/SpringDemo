package com.example.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Tutorial;

//save(), findOne(), findById(), findAll(), count(), delete(), deleteById()

//We also define custom finder methods:
//– findByPublished(): returns all Tutorials with published having value as input published.
//– findByTitleContaining(): returns all Tutorials which title contains input title.
//
//The implementation is plugged in by Spring Data JPA automatically.

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
  List<Tutorial> findByPublished(boolean published);
  List<Tutorial> findByTitleContaining(String title);
}
