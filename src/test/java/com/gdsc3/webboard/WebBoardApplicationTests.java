package com.gdsc3.webboard;

import com.gdsc3.webboard.answer.Answer;
import com.gdsc3.webboard.answer.AnswerRepository;
import com.gdsc3.webboard.question.Question;
import com.gdsc3.webboard.question.QuestionRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


@SpringBootTest
class WebBoardApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;

	@Autowired
	private AnswerRepository answerRepository;

	@Test
	void testJpa() {

//		Question q1 = new Question();
//		q1.setSubject("스프링부트 모델 질문입니다.");
//		q1.setContent("id는 자동으로 생성되나요?");
//		q1.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q1);  // 첫번째 질문 저장

		Optional<Question> oq = this.questionRepository.findById(1L);
		Question q = oq.get();

		Answer a = new Answer();
		a.setContent("네 자동으로 생성됩니다.");
		a.setQuestion(q);
		a.setCreateDate(LocalDateTime.now());
		this.answerRepository.save(a);




	}


}
