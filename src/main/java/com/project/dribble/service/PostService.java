package com.project.dribble.service;

import com.project.dribble.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PostService {
    Post addPost(Post post) throws Exception;

    List<Post> getPost();
}
