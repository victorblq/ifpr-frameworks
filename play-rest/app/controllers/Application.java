package controllers;

import com.fasterxml.jackson.databind.JsonNode;

import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import rest.RestClient;
import views.html.index;

public class Application extends Controller 
{

    public Result index() 
    {
        return ok(index.render("Your new application is ready."));
    }
    
    public Result list()
    {
    	JsonNode json = RestClient.getInstance().list();
    	
    	return ok(json);
    }
    
    public Result create()
    {
    	DynamicForm requestData = Form.form().bindFromRequest();
    	String nome = requestData.get("nome");
    	String sobrenome = requestData.get("sobrenome");
    	String idade = requestData.get("idade");
    	
    	String json = RestClient.getInstance().create(nome, sobrenome, idade);
    	
    	return ok(json);
    }

}
