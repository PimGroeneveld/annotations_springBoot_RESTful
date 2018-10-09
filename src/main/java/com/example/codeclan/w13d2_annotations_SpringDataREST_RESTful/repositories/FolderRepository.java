package com.example.codeclan.w13d2_annotations_SpringDataREST_RESTful.repositories;

import com.example.codeclan.w13d2_annotations_SpringDataREST_RESTful.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
