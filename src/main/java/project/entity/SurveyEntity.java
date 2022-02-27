package project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "SURVEY_ENT")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SurveyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long surveyId;
    private String surveyTitle;
    private String surveyDescription;
    private String surveyQuestion;  // several questions
    private String surveyAnswers; // closed-end answers, 4 options
    private Date surveyCreationDate;
    // private surveyLink   // unique link, surveyID and a hash
    private int yearOfBirth;

}
