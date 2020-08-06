package com.codeh.questionbank.data;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "question_answers")
public class QuestionAnswers implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id", insertable = false, nullable = false)
    private Integer questionId;

    @OneToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Category category;

    @Column(name = "question")
    private String question;

    @Column(name = "answer")
    private String answer;

    @CreationTimestamp
    @Column(name = "created_ts", nullable = false)
    private LocalDateTime createdTs;

    @UpdateTimestamp
    @Column(name = "last_updated_ts", nullable = false)
    private LocalDateTime lastUpdatedTs;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public LocalDateTime getCreatedTs() {
        return createdTs;
    }

    public void setCreatedTs(LocalDateTime createdTs) {
        this.createdTs = createdTs;
    }

    public LocalDateTime getLastUpdatedTs() {
        return lastUpdatedTs;
    }

    public void setLastUpdatedTs(LocalDateTime lastUpdatedTs) {
        this.lastUpdatedTs = lastUpdatedTs;
    }

    @Override
    public String toString() {
        return "QuestionAnswers{" +
                "questionId=" + questionId +
                ", category=" + category +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", createdTs=" + createdTs +
                ", lastUpdatedTs=" + lastUpdatedTs +
                '}';
    }
}