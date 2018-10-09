package com.example.codeclan.w13d2_annotations_SpringDataREST_RESTful.controllers;

import com.example.codeclan.w13d2_annotations_SpringDataREST_RESTful.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/folders")
public class FolderController {

    @Autowired
    FolderRepository folderRepository;
}
