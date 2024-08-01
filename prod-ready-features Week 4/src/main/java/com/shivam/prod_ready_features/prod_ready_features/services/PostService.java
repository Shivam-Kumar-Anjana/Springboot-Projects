package com.shivam.prod_ready_features.prod_ready_features.services;

import com.shivam.prod_ready_features.prod_ready_features.dto.PostDto;
import com.shivam.prod_ready_features.prod_ready_features.repositories.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PostService {

    List<PostDto> getAllPosts();

    PostDto createNewPost(PostDto inputPost);

    PostDto getPostById(Long postId);

    PostDto updatePost(PostDto inputPost, Long postId);
}
