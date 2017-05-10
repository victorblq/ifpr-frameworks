package controllers;

import models.Pessoa;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class PessoaController extends Controller
{

	public Result listPessoa()
	{
		return ok( Json.toJson(Pessoa.listPessoa()));
	}
	
	public Result createPessoa( String nome )
	{
		Pessoa pessoa = new Pessoa();
		
		pessoa.nome = nome;
		pessoa.save();
		
		return ok("Pessoa " + pessoa.nome + " adicionada");
	}
	
	public Result findById(Long id)
	{
		Pessoa pessoa = Pessoa.findById( id );
		return ok( Json.toJson( pessoa ) );
	}
}
