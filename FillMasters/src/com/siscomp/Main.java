package com.siscomp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ResultSet resultSet = null;
        DBConnector myDBConnector = new DBConnector();
        try {
        for (int i = 1; i < 804618; i++) {
            Connection connection = myDBConnector.connectToMysqlDB("temporal", "root", "p3r0t3db17", "192.168.2.2");
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO dtickets (corporativ, empresa, numero, caja, corte) VALUES ('1', '0014', '"+String.valueOf(i)+"', '1', '1')");
            preparedStatement.execute();
            System.out.println("Executing row: " + String.valueOf(i));
        }
            myDBConnector.releaseResources();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
