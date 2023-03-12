package com.example.deployment.service;

import com.example.deployment.dao.PostRepo;
import com.example.deployment.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    PostRepo postRepo;

    public String savePost(Post post) {
        postRepo.save(post);
        return "saved";
    }

    public List<Post> getAllPost() {
        return postRepo.findAll();
    }
}
