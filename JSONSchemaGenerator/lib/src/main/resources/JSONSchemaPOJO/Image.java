
package JSONSchemaPOJO;

import java.util.LinkedHashMap;
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
    "src",
    "name",
    "hOffset",
    "vOffset",
    "alignment"
})
@Generated("jsonschema2pojo")
public class Image {

    @JsonProperty("src")
    private String src;
    @JsonProperty("name")
    private String name;
    @JsonProperty("hOffset")
    private Integer hOffset;
    @JsonProperty("vOffset")
    private Integer vOffset;
    @JsonProperty("alignment")
    private String alignment;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("src")
    public String getSrc() {
        return src;
    }

    @JsonProperty("src")
    public void setSrc(String src) {
        this.src = src;
    }

    public Image withSrc(String src) {
        this.src = src;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Image withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("hOffset")
    public Integer gethOffset() {
        return hOffset;
    }

    @JsonProperty("hOffset")
    public void sethOffset(Integer hOffset) {
        this.hOffset = hOffset;
    }

    public Image withhOffset(Integer hOffset) {
        this.hOffset = hOffset;
        return this;
    }

    @JsonProperty("vOffset")
    public Integer getvOffset() {
        return vOffset;
    }

    @JsonProperty("vOffset")
    public void setvOffset(Integer vOffset) {
        this.vOffset = vOffset;
    }

    public Image withvOffset(Integer vOffset) {
        this.vOffset = vOffset;
        return this;
    }

    @JsonProperty("alignment")
    public String getAlignment() {
        return alignment;
    }

    @JsonProperty("alignment")
    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public Image withAlignment(String alignment) {
        this.alignment = alignment;
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

    public Image withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Image.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("src");
        sb.append('=');
        sb.append(((this.src == null)?"<null>":this.src));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("hOffset");
        sb.append('=');
        sb.append(((this.hOffset == null)?"<null>":this.hOffset));
        sb.append(',');
        sb.append("vOffset");
        sb.append('=');
        sb.append(((this.vOffset == null)?"<null>":this.vOffset));
        sb.append(',');
        sb.append("alignment");
        sb.append('=');
        sb.append(((this.alignment == null)?"<null>":this.alignment));
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
        result = ((result* 31)+((this.vOffset == null)? 0 :this.vOffset.hashCode()));
        result = ((result* 31)+((this.src == null)? 0 :this.src.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.alignment == null)? 0 :this.alignment.hashCode()));
        result = ((result* 31)+((this.hOffset == null)? 0 :this.hOffset.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Image) == false) {
            return false;
        }
        Image rhs = ((Image) other);
        return (((((((this.vOffset == rhs.vOffset)||((this.vOffset!= null)&&this.vOffset.equals(rhs.vOffset)))&&((this.src == rhs.src)||((this.src!= null)&&this.src.equals(rhs.src))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.alignment == rhs.alignment)||((this.alignment!= null)&&this.alignment.equals(rhs.alignment))))&&((this.hOffset == rhs.hOffset)||((this.hOffset!= null)&&this.hOffset.equals(rhs.hOffset))));
    }

}
