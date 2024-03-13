package com.interinfo.dada_server.model;

import java.util.Date;

public class DadaVersion {
    private Double releaseVersion;

    private Date releaseDate;

    private String releaseDescription;

    public Double getReleaseVersion() {
        return releaseVersion;
    }

    public void setReleaseVersion(Double releaseVersion) {
        this.releaseVersion = releaseVersion;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getReleaseDescription() {
        return releaseDescription;
    }

    public void setReleaseDescription(String releaseDescription) {
        this.releaseDescription = releaseDescription;
    }
}
