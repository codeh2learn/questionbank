package com.codeh.questionbank.service;

import com.codeh.questionbank.data.Category;
import com.codeh.questionbank.data.CategoryRepository;
import com.codeh.questionbank.data.QuestionAnswers;
import com.codeh.questionbank.data.QuestionAnswersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionBankService implements IQuestionBankService {

    @Autowired
    private QuestionAnswersRepository questionAnswersRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> fetchAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public List<QuestionAnswers> fetchAllQuestionsAndAnswers() {
        return questionAnswersRepository.findAll();
    }
}
