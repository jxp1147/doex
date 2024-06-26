package org.example.doex.entity.dbbo;


public class ExerciseBO {

    private Integer id;

    private Integer industryId;

    private Integer jobId;

    private String exerciseContent;

    private String exerciseAnswer;

    private Integer ownerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getIndustryId() {
        return industryId;
    }

    public void setIndustryId(Integer industryId) {
        this.industryId = industryId;
    }
    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }
    public String getExerciseContent() {
        return exerciseContent;
    }

    public void setExerciseContent(String exerciseContent) {
        this.exerciseContent = exerciseContent;
    }
    public String getExerciseAnswer() {
        return exerciseAnswer;
    }

    public void setExerciseAnswer(String exerciseAnswer) {
        this.exerciseAnswer = exerciseAnswer;
    }
    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public String toString() {
        return "Exercises{" +
            "id=" + id +
            ", industryId=" + industryId +
            ", jobId=" + jobId +
            ", exerciseContent=" + exerciseContent +
            ", exerciseAnswer=" + exerciseAnswer +
            ", ownerId=" + ownerId +
        "}";
    }
}
