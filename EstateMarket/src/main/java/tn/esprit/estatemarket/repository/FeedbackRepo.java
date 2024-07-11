package tn.esprit.estatemarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.estatemarket.entities.Feedback;
import tn.esprit.estatemarket.entities.User;

import java.util.Set;

public interface FeedbackRepo extends JpaRepository<Feedback, Long> {
//    Set<Feedback> findAllByUser(Long id);
//
//
    Set<Feedback> findAllByUser(User user);

}