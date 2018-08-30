
package com.example.sunil.radius;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ApiResponseData {

    @SerializedName("facilities")
    @Expose
    private List<Facility> facilities = null;
    @SerializedName("exclusions")
    @Expose
    private List<List<Exclusion>> exclusions = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ApiResponseData() {
    }

    /**
     * 
     * @param exclusions
     * @param facilities
     */
    public ApiResponseData(List<Facility> facilities, List<List<Exclusion>> exclusions) {
        super();
        this.facilities = facilities;
        this.exclusions = exclusions;
    }

    public List<Facility> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<Facility> facilities) {
        this.facilities = facilities;
    }

    public List<List<Exclusion>> getExclusions() {
        return exclusions;
    }

    public void setExclusions(List<List<Exclusion>> exclusions) {
        this.exclusions = exclusions;
    }

}
