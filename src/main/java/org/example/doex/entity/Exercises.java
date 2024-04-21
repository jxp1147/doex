package org.example.doex.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author jxp
 * @since 2024-04-22
 */
@ApiModel(value = "Exercises对象", description = "")
public class Exercises implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
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
