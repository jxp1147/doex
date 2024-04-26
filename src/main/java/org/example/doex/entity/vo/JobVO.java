package org.example.doex.entity.vo;

public class JobVO {

    private Integer id;

    private String jobName;

    private IndustryVO industry;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public IndustryVO getIndustry() {
        return industry;
    }

    public void setIndustry(IndustryVO industry) {
        this.industry = industry;
    }

    @Override
    public String toString() {
        return "JobsVO{" +
                "id=" + id +
                ", jobName='" + jobName + '\'' +
                ", industry=" + industry +
                '}';
    }

}
