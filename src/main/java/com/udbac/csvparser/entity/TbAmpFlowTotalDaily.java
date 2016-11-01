package com.udbac.csvparser.entity;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class TbAmpFlowTotalDaily {

    private String createDate;
    private String classfy;
    private String url;
    private String visits;
    private String pv;
    private String viewTime;

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getClassfy() {
        return classfy;
    }

    public void setClassfy(String classfy) {
        this.classfy = classfy;
    }

    public String getUrl() {
        return url;
    }

    /**
     * 转义sql中的 '
     *
     * @param url
     */
    public void setUrl(String url) {
        if (!StringUtils.isEmpty(url)) {
            if (url.contains("'")) {
                this.url = url.replace("'", "''");
                return;
            }
        }
        this.url = url;
    }

    public String getVisits() {
        return visits;
    }

    public void setVisits(String visits) {
        this.visits = visits;
    }

    public String getPv() {
        return pv;
    }

    public void setPv(String pv) {
        this.pv = pv;
    }

    public String getViewTime() {
        return viewTime;
    }

    public void setViewTime(String viewTime) {
        this.viewTime = viewTime;
    }

    @Override
    public String toString() {
        return "'" + createDate + "'" +
                ", '" + classfy + '\'' +
                ", '" + url + '\'' +
                ", " + visits +
                "," + pv +
                "," + viewTime;

    }

}
