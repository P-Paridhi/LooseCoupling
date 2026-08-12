package com.paridhi.springwebandmvc.ProdReady.services;

import com.paridhi.springwebandmvc.ProdReady.dto.PostDTO;
import com.paridhi.springwebandmvc.ProdReady.repositories.IPostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService{

    private final IPostRepository postRepository;

    @Override
    public List<PostDTO> getAllPosts(){
        return null;
    }

    @Override
    public PostDTO createNewPost(PostDTO postDTO){
        return null;
    }
}
