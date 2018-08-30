
package com.example.sunil.radius;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Facility {

    @SerializedName("facility_id")
    @Expose
    private String facilityId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("options")
    @Expose
    private List<Option> options = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Facility() {
    }

    /**
     * 
     * @param name
     * @param facilityId
     * @param options
     */
    public Facility(String facilityId, String name, List<Option> options) {
        super();
        this.facilityId = facilityId;
        this.name = name;
        this.options = options;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

}
