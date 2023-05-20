
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
    "debug",
    "window",
    "image",
    "text"
})
@Generated("jsonschema2pojo")
public class Widget {

    @JsonProperty("debug")
    private String debug;
    @JsonProperty("window")
    private Window window;
    @JsonProperty("image")
    private Image image;
    @JsonProperty("text")
    private Text text;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("debug")
    public String getDebug() {
        return debug;
    }

    @JsonProperty("debug")
    public void setDebug(String debug) {
        this.debug = debug;
    }

    public Widget withDebug(String debug) {
        this.debug = debug;
        return this;
    }

    @JsonProperty("window")
    public Window getWindow() {
        return window;
    }

    @JsonProperty("window")
    public void setWindow(Window window) {
        this.window = window;
    }

    public Widget withWindow(Window window) {
        this.window = window;
        return this;
    }

    @JsonProperty("image")
    public Image getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(Image image) {
        this.image = image;
    }

    public Widget withImage(Image image) {
        this.image = image;
        return this;
    }

    @JsonProperty("text")
    public Text getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(Text text) {
        this.text = text;
    }

    public Widget withText(Text text) {
        this.text = text;
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

    public Widget withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Widget.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("debug");
        sb.append('=');
        sb.append(((this.debug == null)?"<null>":this.debug));
        sb.append(',');
        sb.append("window");
        sb.append('=');
        sb.append(((this.window == null)?"<null>":this.window));
        sb.append(',');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null)?"<null>":this.image));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
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
        result = ((result* 31)+((this.image == null)? 0 :this.image.hashCode()));
        result = ((result* 31)+((this.debug == null)? 0 :this.debug.hashCode()));
        result = ((result* 31)+((this.window == null)? 0 :this.window.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Widget) == false) {
            return false;
        }
        Widget rhs = ((Widget) other);
        return ((((((this.image == rhs.image)||((this.image!= null)&&this.image.equals(rhs.image)))&&((this.debug == rhs.debug)||((this.debug!= null)&&this.debug.equals(rhs.debug))))&&((this.window == rhs.window)||((this.window!= null)&&this.window.equals(rhs.window))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
