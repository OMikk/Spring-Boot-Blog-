package com.blog.repository;

import com.blog.model.Post;
import com.blog.model.User;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

// Postauksien etsiminen ja sorttaus

public interface PostRepository extends JpaRepository<Post, Long> {
   
	Page<Post> findByUserOrderByCreateDateDesc(User user, Pageable pageable);

    Page<Post> findAllByOrderByCreateDateDesc(Pageable pageable);

    Optional<Post> findById(Long id);
}
