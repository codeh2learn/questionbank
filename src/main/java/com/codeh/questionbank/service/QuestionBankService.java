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
        return categoryRepository.findAllByOrderByCategoryId();
    }

    @Override
    public List<QuestionAnswers> fetchAllQuestionsAndAnswers() {
        return questionAnswersRepository.findAllByOrderByQuestionId();
    }

    @Override
    public void saveCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void saveQuestion(QuestionAnswers question) {
        questionAnswersRepository.save(question);
    }

    @Override
    public void deleteQuestion(String questionId) {
        questionAnswersRepository.deleteById(Integer.valueOf(questionId));
    }

    @Override
    public void deleteCategory(String categoryId) {
        categoryRepository.deleteById(Integer.valueOf(categoryId));
    }

    @Override
    public Category fetchCategory(String categoryId) {
        return categoryRepository.findById(Integer.valueOf(categoryId)).orElse(null);
    }

    @Override
    public QuestionAnswers fetchQuestionAnswer(String questionId) {
        return questionAnswersRepository.findById(Integer.valueOf(questionId)).orElse(null);
    }
}
