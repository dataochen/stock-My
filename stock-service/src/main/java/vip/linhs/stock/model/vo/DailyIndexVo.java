package vip.linhs.stock.model.vo;

import vip.linhs.stock.model.po.DailyIndex;

public class DailyIndexVo extends DailyIndex {

    private static final long serialVersionUID = 1L;

    private String name;
    private String abbreviation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

}
