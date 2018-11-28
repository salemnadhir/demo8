package cni.tn.dhe.demo8.services;

import javax.ejb.Remote;

import cni.tn.dhe.demo8.entities.User;
import cni.tn.dhe.demo8.utilities.IGenericDAO;

@Remote
public interface UserServiceRemote extends IGenericDAO<User> {

}
