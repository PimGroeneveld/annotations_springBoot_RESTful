package com.example.codeclan.w13d2_annotations_SpringDataREST_RESTful.repositories;

import com.example.codeclan.w13d2_annotations_SpringDataREST_RESTful.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
