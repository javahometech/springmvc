package in.javahome.springmvc.dao;

import in.javahome.springmvc.model.Register;

public interface RegisterDAO {
	public void register(Register reg);
	public Register findAccountByMailId(String  mailId);
}
