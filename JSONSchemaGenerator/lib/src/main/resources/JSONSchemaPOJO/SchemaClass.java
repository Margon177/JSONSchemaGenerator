
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
    "glossary",
    "widget"
})
@Generated("jsonschema2pojo")
public class SchemaClass {

    @JsonProperty("glossary")
    private Glossary glossary;
    @JsonProperty("widget")
    private Widget widget;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("glossary")
    public Glossary getGlossary() {
        return glossary;
    }

    @JsonProperty("glossary")
    public void setGlossary(Glossary glossary) {
        this.glossary = glossary;
    }

    public SchemaClass withGlossary(Glossary glossary) {
        this.glossary = glossary;
        return this;
    }

    @JsonProperty("widget")
    public Widget getWidget() {
        return widget;
    }

    @JsonProperty("widget")
    public void setWidget(Widget widget) {
        this.widget = widget;
    }

    public SchemaClass withWidget(Widget widget) {
        this.widget = widget;
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

    public SchemaClass withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SchemaClass.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("glossary");
        sb.append('=');
        sb.append(((this.glossary == null)?"<null>":this.glossary));
        sb.append(',');
        sb.append("widget");
        sb.append('=');
        sb.append(((this.widget == null)?"<null>":this.widget));
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
        result = ((result* 31)+((this.glossary == null)? 0 :this.glossary.hashCode()));
        result = ((result* 31)+((this.widget == null)? 0 :this.widget.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SchemaClass) == false) {
            return false;
        }
        SchemaClass rhs = ((SchemaClass) other);
        return ((((this.glossary == rhs.glossary)||((this.glossary!= null)&&this.glossary.equals(rhs.glossary)))&&((this.widget == rhs.widget)||((this.widget!= null)&&this.widget.equals(rhs.widget))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
