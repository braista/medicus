package ar.com.bs.medicus.dao.impl;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.mysql.cj.jdbc.PreparedStatement;

import ar.com.bs.medicus.dao.PracticaDAO;
import ar.com.bs.medicus.pojo.Practica;

public abstract class PracticaDaoImpl implements PracticaDAO {
	private DataSource dataSource;
	
	public PracticaDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }
	
	public List<Practica> findByID (int IdPractica) {
		List<Practica> practicas = new ArrayList<Practica>();
		java.sql.PreparedStatement datasql= null;
		
		String queryString = "SELECIONAR EL ID ?";
		
		try {
			 
            Connection connection = dataSource.getConnection();
 
            datasql = connection.prepareStatement(queryString);
            datasql.setInt(1, IdPractica);
		
		
		return null;
	}

}
