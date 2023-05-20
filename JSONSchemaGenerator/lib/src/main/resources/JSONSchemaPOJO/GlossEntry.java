
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
    "ID",
    "SortAs",
    "GlossTerm",
    "Acronym",
    "Abbrev",
    "GlossDef",
    "GlossSee"
})
@Generated("jsonschema2pojo")
public class GlossEntry {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("SortAs")
    private String sortAs;
    @JsonProperty("GlossTerm")
    private String glossTerm;
    @JsonProperty("Acronym")
    private String acronym;
    @JsonProperty("Abbrev")
    private String abbrev;
    @JsonProperty("GlossDef")
    private GlossDef glossDef;
    @JsonProperty("GlossSee")
    private String glossSee;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    public GlossEntry withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("SortAs")
    public String getSortAs() {
        return sortAs;
    }

    @JsonProperty("SortAs")
    public void setSortAs(String sortAs) {
        this.sortAs = sortAs;
    }

    public GlossEntry withSortAs(String sortAs) {
        this.sortAs = sortAs;
        return this;
    }

    @JsonProperty("GlossTerm")
    public String getGlossTerm() {
        return glossTerm;
    }

    @JsonProperty("GlossTerm")
    public void setGlossTerm(String glossTerm) {
        this.glossTerm = glossTerm;
    }

    public GlossEntry withGlossTerm(String glossTerm) {
        this.glossTerm = glossTerm;
        return this;
    }

    @JsonProperty("Acronym")
    public String getAcronym() {
        return acronym;
    }

    @JsonProperty("Acronym")
    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public GlossEntry withAcronym(String acronym) {
        this.acronym = acronym;
        return this;
    }

    @JsonProperty("Abbrev")
    public String getAbbrev() {
        return abbrev;
    }

    @JsonProperty("Abbrev")
    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }

    public GlossEntry withAbbrev(String abbrev) {
        this.abbrev = abbrev;
        return this;
    }

    @JsonProperty("GlossDef")
    public GlossDef getGlossDef() {
        return glossDef;
    }

    @JsonProperty("GlossDef")
    public void setGlossDef(GlossDef glossDef) {
        this.glossDef = glossDef;
    }

    public GlossEntry withGlossDef(GlossDef glossDef) {
        this.glossDef = glossDef;
        return this;
    }

    @JsonProperty("GlossSee")
    public String getGlossSee() {
        return glossSee;
    }

    @JsonProperty("GlossSee")
    public void setGlossSee(String glossSee) {
        this.glossSee = glossSee;
    }

    public GlossEntry withGlossSee(String glossSee) {
        this.glossSee = glossSee;
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

    public GlossEntry withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GlossEntry.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("sortAs");
        sb.append('=');
        sb.append(((this.sortAs == null)?"<null>":this.sortAs));
        sb.append(',');
        sb.append("glossTerm");
        sb.append('=');
        sb.append(((this.glossTerm == null)?"<null>":this.glossTerm));
        sb.append(',');
        sb.append("acronym");
        sb.append('=');
        sb.append(((this.acronym == null)?"<null>":this.acronym));
        sb.append(',');
        sb.append("abbrev");
        sb.append('=');
        sb.append(((this.abbrev == null)?"<null>":this.abbrev));
        sb.append(',');
        sb.append("glossDef");
        sb.append('=');
        sb.append(((this.glossDef == null)?"<null>":this.glossDef));
        sb.append(',');
        sb.append("glossSee");
        sb.append('=');
        sb.append(((this.glossSee == null)?"<null>":this.glossSee));
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
        result = ((result* 31)+((this.glossTerm == null)? 0 :this.glossTerm.hashCode()));
        result = ((result* 31)+((this.acronym == null)? 0 :this.acronym.hashCode()));
        result = ((result* 31)+((this.glossDef == null)? 0 :this.glossDef.hashCode()));
        result = ((result* 31)+((this.glossSee == null)? 0 :this.glossSee.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.abbrev == null)? 0 :this.abbrev.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sortAs == null)? 0 :this.sortAs.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GlossEntry) == false) {
            return false;
        }
        GlossEntry rhs = ((GlossEntry) other);
        return (((((((((this.glossTerm == rhs.glossTerm)||((this.glossTerm!= null)&&this.glossTerm.equals(rhs.glossTerm)))&&((this.acronym == rhs.acronym)||((this.acronym!= null)&&this.acronym.equals(rhs.acronym))))&&((this.glossDef == rhs.glossDef)||((this.glossDef!= null)&&this.glossDef.equals(rhs.glossDef))))&&((this.glossSee == rhs.glossSee)||((this.glossSee!= null)&&this.glossSee.equals(rhs.glossSee))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.abbrev == rhs.abbrev)||((this.abbrev!= null)&&this.abbrev.equals(rhs.abbrev))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sortAs == rhs.sortAs)||((this.sortAs!= null)&&this.sortAs.equals(rhs.sortAs))));
    }

}
