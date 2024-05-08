package com.mycompany.lifemates_dashboard.persistencia;

import com.mycompany.lifemates_dashboard.logica.Password;
import com.mycompany.lifemates_dashboard.logica.Users;
import com.mycompany.lifemates_dashboard.persistencia.exceptions.PreexistingEntityException;

public class ControladoraPersistencia {
    
    UsersJpaController usersJpa = new UsersJpaController();
    PasswordJpaController passwordJpa = new PasswordJpaController();

    public void guardar(Users users, Password password) throws PreexistingEntityException, Exception {
        usersJpa.create(users);
        passwordJpa.create(password);
    }
}