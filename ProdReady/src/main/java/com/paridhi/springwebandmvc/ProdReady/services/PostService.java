package com.paridhi.springwebandmvc.ProdReady.services;

import com.paridhi.springwebandmvc.ProdReady.dto.PostDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {

    List<PostDTO> getAllPosts();

    PostDTO createNewPost(PostDTO inputPost);
}
