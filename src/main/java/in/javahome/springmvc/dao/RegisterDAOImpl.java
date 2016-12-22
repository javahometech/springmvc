package in.javahome.springmvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import in.javahome.springmvc.model.Register;

@Component
public class RegisterDAOImpl implements RegisterDAO {
	@Autowired
	private HibernateTemplate template;

	public void register(Register reg) {
		template.save(reg);
	}
	
	public Register findAccountByMailId(String mailId) {
		List<?> reg = template.find("from Register reg where reg.mail = ? ", mailId);
		return (Register) (reg.size()==0 ? null : reg.get(0));
	}

}
