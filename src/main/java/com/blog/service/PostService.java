package com.blog.service;

import com.blog.model.Post;
import com.blog.model.User;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface PostService {

    Optional<Post> findForId(Long id);

    Post save(Post post);

    // Postauksen etsintä annetulta käyttäjältä date sorttauksella
    
    Page<Post> findByUserOrderedByDatePageable(User user, int page);

    // Kaikkien postauksien etsintä date sorttauksella
    
    Page<Post> findAllOrderedByDatePageable(int page);

    void delete(Post post);
}
