package io.reddit.repository;

import io.reddit.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Prajesh Ananthan
 * Created on 29/9/2019.
 */

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
