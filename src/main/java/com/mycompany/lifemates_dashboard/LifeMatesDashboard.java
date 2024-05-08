package com.mycompany.lifemates_dashboard;

import com.mycompany.lifemates_dashboard.igu.WelcomePage;

public class LifeMatesDashboard {

    public static void main(String[] args) {
        //El siguiente código ejecuta la interfaz de bienvenida.
        WelcomePage welcome = new WelcomePage();
        welcome.setVisible(true);
        welcome.setLocationRelativeTo(null);
    }
}
