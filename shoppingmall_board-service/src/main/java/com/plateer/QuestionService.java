package com.plateer;

import java.util.List;

import com.plateer.domain.dto.Question;
import com.plateer.domain.dto.Search;

public interface QuestionService {

    void createQuestion(Question question);

    List<Question> findAllQuestions();

    List<Question> findByUserName(String userName);

    Question questionDetail(int postId);

    void updateQuestion(Question question);

    void deleteQuestion(int postId);

    int getRecentQuestion();

	List<Question> searchQuestion(Search search);
}
