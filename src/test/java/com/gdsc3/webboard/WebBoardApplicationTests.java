package com.gdsc3.webboard;

import com.gdsc3.webboard.answer.Answer;
import com.gdsc3.webboard.answer.AnswerRepository;
import com.gdsc3.webboard.question.Question;
import com.gdsc3.webboard.question.QuestionRepository;
import com.gdsc3.webboard.question.QuestionService;
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
	private QuestionService questionService;

	@Autowired
	private AnswerRepository answerRepository;

	@Test
	void testJpa() {
		for (int i = 1; i <= 300; i++) {
			String subject = String.format("테스트 데이터입니다:[%03d]", i);
			String content = "내용무";
			this.questionService.create(subject, content);
		}
	}


}
