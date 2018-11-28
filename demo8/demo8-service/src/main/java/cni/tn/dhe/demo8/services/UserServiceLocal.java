package cni.tn.dhe.demo8.services;

import javax.ejb.Local;

import cni.tn.dhe.demo8.entities.User;
import cni.tn.dhe.demo8.utilities.IGenericDAO;

@Local
public interface UserServiceLocal extends IGenericDAO<User> {

	User login(String login, String password);

}
