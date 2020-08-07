package com.codeh.questionbank.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface QuestionAnswersRepository extends JpaRepository<QuestionAnswers, Integer>, JpaSpecificationExecutor<QuestionAnswers> {
        List<QuestionAnswers> findAllByOrderByQuestionId();
}