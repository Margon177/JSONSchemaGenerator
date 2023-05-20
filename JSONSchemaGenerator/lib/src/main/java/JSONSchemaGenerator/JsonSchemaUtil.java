package JSONSchemaGenerator;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.JsonSchemaGenerator;

public class JsonSchemaUtil {

	public static String getJsonSchema(Class<?> type) throws JsonProcessingException {
		ObjectMapper jacksonObjectMapper = new ObjectMapper();
		JsonSchemaGenerator schemaGen = new JsonSchemaGenerator(jacksonObjectMapper);
		JsonSchema schema = schemaGen.generateSchema(type);
		String schemaString = jacksonObjectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(schema);
		return schemaString;
	}
}
