package io.tech.SpringHostApp;

import java.util.ArrayList;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class MyController {
	
	@GetMapping("/get")
	public ArrayList<Model> data () throws JsonMappingException, JsonProcessingException{
		
		ObjectMapper mapper = new ObjectMapper();
		ArrayList<Model> datas = mapper.readValue(Data.data, ArrayList.class);
		
		return datas;
	}

}
