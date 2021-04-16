package com.example.quizz;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Entity (name = "question")
public class Question {
    @Id
    @SequenceGenerator(
            name = "question_sequence",
            sequenceName = "question_sequence",
            initialValue = 100,
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "question_sequence"
    )
    @Column(
            name = "qid",
            updatable = false
    )
    private Long qid;
    @Column(
            name = "owner_id",
            nullable = false
    )
    private Long owner;
    @Column(
            name = "question_text",
            columnDefinition = "text"
    )
    private String qText;
    @Column(
            name = "answer_text",
            columnDefinition = "text"
    )
    private String ansText;
    @Column(
            name = "date_created",
            nullable = false
    )
    private LocalDate dateCreated;
    @Column(
            name = "time_created",
            nullable = false
    )
    private LocalTime timeCreated;

    public Question(Long owner, String qText, String ansText, LocalDate dateCreated, LocalTime timeCreated) {
        this.owner = owner;
        this.qText = qText;
        this.ansText = ansText;
        this.dateCreated = dateCreated;
        this.timeCreated = timeCreated;
    }

    public Long getId() {
        return qid;
    }

    public void setId(Long id) {
        this.qid = id;
    }

    public Long getOwner() {
        return owner;
    }

    public void setOwner(Long owner) {
        this.owner = owner;
    }

    public String getqText() {
        return qText;
    }

    public void setqText(String qText) {
        this.qText = qText;
    }

    public String getAnsText() {
        return ansText;
    }

    public void setAnsText(String ansText) {
        this.ansText = ansText;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalTime getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(LocalTime timeCreated) {
        this.timeCreated = timeCreated;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + qid +
                ", owner=" + owner +
                ", qText='" + qText + '\'' +
                ", ansText='" + ansText + '\'' +
                ", dateCreated=" + dateCreated +
                ", timeCreated=" + timeCreated +
        '}';
    }
}
