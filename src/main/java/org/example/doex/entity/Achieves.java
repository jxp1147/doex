package org.example.doex.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author jxp
 * @since 2024-04-22
 */
@Setter
@Getter
@ApiModel(value = "Achieves对象", description = "")
public class Achieves implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
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
