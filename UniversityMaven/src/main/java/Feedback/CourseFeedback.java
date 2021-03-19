/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feedback;

import info5100.university.example.CourseCatalog.Course;

/**
 *
 * @author maneesh
 */
public class CourseFeedback {
    Course course;
    int assignmnetRating;
    int quizRating;
    int informationRating;
    int qualityRating;
    double avaerageRating = 0; //Final rating

    public CourseFeedback() {
         assignmnetRating = 0;
         quizRating = 0;
         informationRating = 0;
         qualityRating = 0;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getAssignmnetRating() {
        return assignmnetRating;
    }

    public void setAssignmnetRating(int assignmnetRating) {
        this.assignmnetRating = assignmnetRating;
    }

    public int getQuizRating() {
        return quizRating;
    }

    public void setQuizRating(int quizRating) {
        this.quizRating = quizRating;
    }

    public int getInformationRating() {
        return informationRating;
    }

    public void setInformationRating(int informationRating) {
        this.informationRating = informationRating;
    }

    public int getQualityRating() {
        return qualityRating;
    }

    public void setQualityRating(int qualityRating) {
        this.qualityRating = qualityRating;
    }
    
    public void getAverageRating(){
       avaerageRating = (assignmnetRating + qualityRating + informationRating + quizRating)/ 4;
    }
    
    
    
    
    
    
}
