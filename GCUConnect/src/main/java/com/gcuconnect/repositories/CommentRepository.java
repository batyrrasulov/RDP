package com.gcuconnect.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gcuconnect.models.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByUserId(Long userId);
    List<Comment> findByPostId(Long postId);
}