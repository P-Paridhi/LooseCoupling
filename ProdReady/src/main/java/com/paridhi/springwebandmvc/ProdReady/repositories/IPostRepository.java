package com.paridhi.springwebandmvc.ProdReady.repositories;

import com.paridhi.springwebandmvc.ProdReady.entities.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPostRepository extends JpaRepository<PostEntity, Long> {

}
