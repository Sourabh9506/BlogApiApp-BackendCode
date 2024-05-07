package com.codewithdurgesh.blog.repositories;

import com.codewithdurgesh.blog.entities.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepo extends CrudRepository<Comment, Integer> {
}
