
package JSONSchemaPOJO;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "para",
    "GlossSeeAlso"
})
@Generated("jsonschema2pojo")
public class GlossDef {

    @JsonProperty("para")
    private String para;
    @JsonProperty("GlossSeeAlso")
    private List<String> glossSeeAlso = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("para")
    public String getPara() {
        return para;
    }

    @JsonProperty("para")
    public void setPara(String para) {
        this.para = para;
    }

    public GlossDef withPara(String para) {
        this.para = para;
        return this;
    }

    @JsonProperty("GlossSeeAlso")
    public List<String> getGlossSeeAlso() {
        return glossSeeAlso;
    }

    @JsonProperty("GlossSeeAlso")
    public void setGlossSeeAlso(List<String> glossSeeAlso) {
        this.glossSeeAlso = glossSeeAlso;
    }

    public GlossDef withGlossSeeAlso(List<String> glossSeeAlso) {
        this.glossSeeAlso = glossSeeAlso;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public GlossDef withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GlossDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("para");
        sb.append('=');
        sb.append(((this.para == null)?"<null>":this.para));
        sb.append(',');
        sb.append("glossSeeAlso");
        sb.append('=');
        sb.append(((this.glossSeeAlso == null)?"<null>":this.glossSeeAlso));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.para == null)? 0 :this.para.hashCode()));
        result = ((result* 31)+((this.glossSeeAlso == null)? 0 :this.glossSeeAlso.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GlossDef) == false) {
            return false;
        }
        GlossDef rhs = ((GlossDef) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.para == rhs.para)||((this.para!= null)&&this.para.equals(rhs.para))))&&((this.glossSeeAlso == rhs.glossSeeAlso)||((this.glossSeeAlso!= null)&&this.glossSeeAlso.equals(rhs.glossSeeAlso))));
    }

}
