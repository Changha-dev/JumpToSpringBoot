package com.gdsc3.webboard.question;

import com.gdsc3.webboard.question.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
