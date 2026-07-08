package controller;

import database.Connector;
import java.sql.Connection;

public class BaseController {

    protected Connection connection;

    public BaseController() {
        connection = Connector.getConnection();
    }

}