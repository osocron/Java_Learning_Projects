package com.siscomp;

/**
 * Created by osocron on 24/09/15.
 */
import java.sql.*;
import java.util.concurrent.Executors;

public class DBConnector {
    private Connection connect;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public DBConnector() {
    }

    public Connection connectToMysqlDB(String dataBase, String user, String password, String host) throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connect = DriverManager.getConnection("jdbc:mysql://"+host+"/"+dataBase+"?"
                    + "user="+user+"&password="+password);
            this.connect.setNetworkTimeout(Executors.newSingleThreadExecutor(), 20000);
        } catch (ClassNotFoundException var6) {
            var6.getException();
        } catch (Exception var7) {
            var7.getCause();
        }

        return this.connect;
    }

    public ResultSet getResultSet(Connection connection, String sqlQuery) {
        preparedStatement = this.getPreparedStatement(connection, sqlQuery);
        resultSet = null;

        try {
            resultSet = preparedStatement.executeQuery();
        } catch (Exception var6) {
            var6.getCause();
            var6.printStackTrace();
        }

        return resultSet;
    }

    private PreparedStatement getPreparedStatement(Connection connection, String sqlQuery) {
        preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(sqlQuery);
        } catch (Exception var5) {
            var5.getCause();
        }

        return preparedStatement;
    }

    public void releaseResources(){
        if(resultSet != null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(preparedStatement != null){
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(connect != null){
            try {
                connect.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
