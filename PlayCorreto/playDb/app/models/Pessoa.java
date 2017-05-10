package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class Pessoa extends Model
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9052132527752407992L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	public String nome;
	
	public static Finder<Long, Pessoa> find = new Finder<Long, Pessoa>(Long.class, Pessoa.class);
	
	public static List<Pessoa> listPessoa()
	{
		return find.all();
	}

	public static Pessoa findById(Long idPessoa)
	{
		return find.byId( idPessoa );
	}
}
