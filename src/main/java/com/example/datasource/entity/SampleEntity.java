package com.example.datasource.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sampletable")
public class SampleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sampleid;

    @Column(name = "samplename", nullable = false)
    private String samplename;

    @Column(name = "samplescore")
    private int samplescore;

    // Constructors, getters, and setters

    public SampleEntity() {
    }

    public SampleEntity(Long sampleid, String samplename, int samplescore) {
        this.sampleid=sampleid;
        this.samplename = samplename;
        this.samplescore = samplescore;
    }

    public Long getSampleid() {
        return sampleid;
    }

    public void setSampleid(Long sampleid) {
        this.sampleid = sampleid;
    }

    public String getSamplename() {
        return samplename;
    }

    public void setSamplename(String samplename) {
        this.samplename = samplename;
    }

    public int getSamplescore() {
        return samplescore;
    }

    public void setSamplescore(int samplescore) {
        this.samplescore = samplescore;
    }

    @Override
    public String toString(){
        return "{ Sample ID:"+sampleid+", Sample Name:"+samplename+",Sample Score:"+samplescore +"}";
    }
}
