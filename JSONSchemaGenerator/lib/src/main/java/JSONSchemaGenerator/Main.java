package JSONSchemaGenerator;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.jsonschema2pojo.DefaultGenerationConfig;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.Jackson2Annotator;
import org.jsonschema2pojo.SchemaGenerator;
import org.jsonschema2pojo.SchemaMapper;
import org.jsonschema2pojo.SchemaStore;
import org.jsonschema2pojo.SourceType;
import org.jsonschema2pojo.rules.RuleFactory;

import com.sun.codemodel.JCodeModel;
import JSONSchemaPOJO.*;


public class Main {
    private static final String INPUT_JSON_FILE = "C:/Users/margo/eclipse-workspace/JSONSchemaGen/lib/src/main/resources/JSON/jsonFile.json";
    private static final String PACKAGE_NAME = "JSONSchemaPOJO";
    private static final String OUTPUT_DIR = "C:/Users/margo/workspace/JSONSchemaGenerator/lib/src/main/resources";

    public static void main(String[] args) throws IOException {

        GenerationConfig generationConfig = new DefaultGenerationConfig() {
            @Override
            public boolean isGenerateBuilders() {
                return true;
            }

            public SourceType getSourceType() {
                return SourceType.JSON;
            }
        };

        Jackson2Annotator jackson2Annotator = new Jackson2Annotator(generationConfig);

        SchemaStore schemaStore = new SchemaStore();
        RuleFactory ruleFactory = new RuleFactory(generationConfig, jackson2Annotator, schemaStore);
        SchemaMapper mapper = new SchemaMapper(ruleFactory, new SchemaGenerator());

        JCodeModel jCodeModel = new JCodeModel();

        File inputJson = new File(INPUT_JSON_FILE);
        URL inputJsonURL = inputJson.toURI().toURL();

        mapper.generate(jCodeModel, "SchemaClass", PACKAGE_NAME, inputJsonURL);

        File outputPojoDirectory = new File(OUTPUT_DIR);
        outputPojoDirectory.mkdirs();
        jCodeModel.build(outputPojoDirectory);
        
		String jsonSchema = JsonSchemaUtil.getJsonSchema(SchemaClass.class);

		System.out.println(jsonSchema);
		
	}

}