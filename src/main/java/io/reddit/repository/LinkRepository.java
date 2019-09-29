package io.reddit.repository;

import io.reddit.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Prajesh Ananthan
 * Created on 29/9/2019.
 */

public interface LinkRepository extends JpaRepository<Link, Long> {

  Link findByTitle(String title);

}
