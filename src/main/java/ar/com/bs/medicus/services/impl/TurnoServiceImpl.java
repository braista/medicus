package ar.com.bs.medicus.services.impl;

import java.util.List;

import javax.jws.WebService;

import ar.com.bs.medicus.dao.impl.TurnoDAOImpl;
import ar.com.bs.medicus.dto.TurnoDTO;
import ar.com.bs.medicus.services.TurnoService;


/**
 * Servicio utilizado para turno.
 *
 */
@WebService(endpointInterface = "ar.com.bs.medicus.services.TurnoService", serviceName= "TurnoService")
public class TurnoServiceImpl implements TurnoService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TurnoDAOImpl turnoDAO;
	@Override
	public List<TurnoDTO> getAll() {
		
		return turnoDAO.getAll();
	}

	@Override
	public TurnoDTO find(TurnoDTO turno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(TurnoDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveOrupdate(TurnoDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(TurnoDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TurnoDTO update(TurnoDTO turno) {
		// TODO Auto-generated method stub
		return null;
	}



}
