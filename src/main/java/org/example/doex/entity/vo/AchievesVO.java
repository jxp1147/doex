package org.example.doex.entity.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jxp
 * @since 2024-04-22
 */
public class AchievesVO {
    private Integer id;

    private String achieveName;

    @Override
    public String toString() {
        return "Achieves{" +
            "id=" + id +
            ", achieveName=" + achieveName +
        "}";
    }
}
