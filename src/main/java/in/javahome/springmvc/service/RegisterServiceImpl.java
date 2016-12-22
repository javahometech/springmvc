package in.javahome.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import in.javahome.springmvc.dao.RegisterDAO;
import in.javahome.springmvc.model.Register;

@Component
public class RegisterServiceImpl implements RegisterService {
	@Autowired
	public RegisterDAO regDao;
	@Transactional
	public void register(Register reg) {
		if(regDao.findAccountByMailId(reg.getMail()) == null){
			// logic to encrypt password
			regDao.register(reg);
		}else{
			throw new RuntimeException("Email Already Exists..");
		}
		
	}

}
