package org.example.doex.entity.vo;


public class ExerciseVO {

    private Integer id;

    private IndustryVO industry;

    private JobVO job;

    private String exerciseContent;

    private String exerciseAnswer;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setIndustry(IndustryVO industry) {
        this.industry = industry;
    }

    public void setJob(JobVO job) {
        this.job = job;
    }

    public void setExerciseContent(String exerciseContent) {
        this.exerciseContent = exerciseContent;
    }

    public void setExerciseAnswer(String exerciseAnswer) {
        this.exerciseAnswer = exerciseAnswer;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Integer getId() {
        return id;
    }

    public IndustryVO getIndustry() {
        return industry;
    }

    public JobVO getJob() {
        return job;
    }

    public String getExerciseContent() {
        return exerciseContent;
    }

    public String getExerciseAnswer() {
        return exerciseAnswer;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    private Integer ownerId;

    @Override
    public String toString() {
        return "ExercisesVO{" +
                "id=" + id +
                ", industry=" + industry +
                ", job=" + job +
                ", exerciseContent='" + exerciseContent + '\'' +
                ", exerciseAnswer='" + exerciseAnswer + '\'' +
                ", ownerId=" + ownerId +
                '}';
    }
}
