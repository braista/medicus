package ar.com.bs.medicus.services;

import java.util.ArrayList;

import org.hibernate.service.Service;

import ar.com.bs.medicus.dto.PrestadorDTO;

public interface PrestadorService extends Service{
	
   /**
    * 
    * @return
    */
	ArrayList<PrestadorDTO> getAll();
}
