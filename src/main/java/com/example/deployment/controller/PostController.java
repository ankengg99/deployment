package com.example.deployment.controller;

import com.example.deployment.model.Post;
import com.example.deployment.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/post")
public class PostController {
    @Autowired
    PostService service;
    @PostMapping
    public String addPost(@RequestBody Post post){
        return service.savePost(post);
    }
    @GetMapping(value="/get-post")
    public List<Post> getPost(){
        return service.getAllPost();
    }
}
