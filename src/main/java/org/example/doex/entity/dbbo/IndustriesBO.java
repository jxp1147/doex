package org.example.doex.entity.dbbo;

public class IndustriesBO {
    private Integer id;

    private String industryName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName;
    }

    @Override
    public String toString() {
        return "Industries{" +
            "id=" + id +
            ", industryName=" + industryName +
        "}";
    }
}