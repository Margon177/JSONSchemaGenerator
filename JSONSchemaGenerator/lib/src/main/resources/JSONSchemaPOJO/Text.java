
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
    "data",
    "size",
    "style",
    "name",
    "hOffset",
    "vOffset",
    "alignment",
    "onMouseUp"
})
@Generated("jsonschema2pojo")
public class Text {

    @JsonProperty("data")
    private String data;
    @JsonProperty("size")
    private Integer size;
    @JsonProperty("style")
    private String style;
    @JsonProperty("name")
    private String name;
    @JsonProperty("hOffset")
    private Integer hOffset;
    @JsonProperty("vOffset")
    private Integer vOffset;
    @JsonProperty("alignment")
    private String alignment;
    @JsonProperty("onMouseUp")
    private String onMouseUp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("data")
    public String getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(String data) {
        this.data = data;
    }

    public Text withData(String data) {
        this.data = data;
        return this;
    }

    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    public Text withSize(Integer size) {
        this.size = size;
        return this;
    }

    @JsonProperty("style")
    public String getStyle() {
        return style;
    }

    @JsonProperty("style")
    public void setStyle(String style) {
        this.style = style;
    }

    public Text withStyle(String style) {
        this.style = style;
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

    public Text withName(String name) {
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

    public Text withhOffset(Integer hOffset) {
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

    public Text withvOffset(Integer vOffset) {
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

    public Text withAlignment(String alignment) {
        this.alignment = alignment;
        return this;
    }

    @JsonProperty("onMouseUp")
    public String getOnMouseUp() {
        return onMouseUp;
    }

    @JsonProperty("onMouseUp")
    public void setOnMouseUp(String onMouseUp) {
        this.onMouseUp = onMouseUp;
    }

    public Text withOnMouseUp(String onMouseUp) {
        this.onMouseUp = onMouseUp;
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

    public Text withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Text.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
        sb.append(',');
        sb.append("size");
        sb.append('=');
        sb.append(((this.size == null)?"<null>":this.size));
        sb.append(',');
        sb.append("style");
        sb.append('=');
        sb.append(((this.style == null)?"<null>":this.style));
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
        sb.append("onMouseUp");
        sb.append('=');
        sb.append(((this.onMouseUp == null)?"<null>":this.onMouseUp));
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
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        result = ((result* 31)+((this.size == null)? 0 :this.size.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.style == null)? 0 :this.style.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.alignment == null)? 0 :this.alignment.hashCode()));
        result = ((result* 31)+((this.onMouseUp == null)? 0 :this.onMouseUp.hashCode()));
        result = ((result* 31)+((this.hOffset == null)? 0 :this.hOffset.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Text) == false) {
            return false;
        }
        Text rhs = ((Text) other);
        return ((((((((((this.vOffset == rhs.vOffset)||((this.vOffset!= null)&&this.vOffset.equals(rhs.vOffset)))&&((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data))))&&((this.size == rhs.size)||((this.size!= null)&&this.size.equals(rhs.size))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.style == rhs.style)||((this.style!= null)&&this.style.equals(rhs.style))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.alignment == rhs.alignment)||((this.alignment!= null)&&this.alignment.equals(rhs.alignment))))&&((this.onMouseUp == rhs.onMouseUp)||((this.onMouseUp!= null)&&this.onMouseUp.equals(rhs.onMouseUp))))&&((this.hOffset == rhs.hOffset)||((this.hOffset!= null)&&this.hOffset.equals(rhs.hOffset))));
    }

}
