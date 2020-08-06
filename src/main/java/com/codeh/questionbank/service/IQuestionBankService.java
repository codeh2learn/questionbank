package com.codeh.questionbank.service;

import com.codeh.questionbank.data.Category;
import com.codeh.questionbank.data.QuestionAnswers;

import java.util.List;

public interface IQuestionBankService {
    List<Category> fetchAllCategories();
    List<QuestionAnswers>  fetchAllQuestionsAndAnswers();
}
