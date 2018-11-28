package cni.tn.dhe.demo8.utilities;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import cni.tn.dhe.demo8.entities.User;
import cni.tn.dhe.demo8.services.UserServiceLocal;

@Singleton
@Startup
public class DBPopulator {
	@EJB
	private UserServiceLocal userServiceLocal;

	public DBPopulator() {
	}

	@PostConstruct
	public void init() {
		User user = new User("user", "u", "u", "user@bitbox.tn");

		userServiceLocal.update(user);
	}
}
