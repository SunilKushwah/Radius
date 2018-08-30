
package com.example.sunil.radius;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Exclusion {

    @SerializedName("facility_id")
    @Expose
    private String facilityId;
    @SerializedName("options_id")
    @Expose
    private String optionsId;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Exclusion() {
    }

    /**
     * 
     * @param optionsId
     * @param facilityId
     */
    public Exclusion(String facilityId, String optionsId) {
        super();
        this.facilityId = facilityId;
        this.optionsId = optionsId;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getOptionsId() {
        return optionsId;
    }

    public void setOptionsId(String optionsId) {
        this.optionsId = optionsId;
    }

}
