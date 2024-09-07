package com.example.postgres;

import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Objects;

public class ConnectionClass {
    protected static  String db ="manage";
    protected static  String ip ="192.168.100.42";
    protected static  String port ="5432";
    protected static  String username ="postgres";
    protected static  String password ="promat";

    public Connection Conn()
    {
        Connection conn = null;
        try
        {
            Class.forName("org.postgresql.Driver");
            String connectionString = "jdbc:postgresql://" + ip + ":" + port + "/" +db;
            conn = DriverManager.getConnection(connectionString, username, password);
        }
        catch (Exception e)
        {
            Log.e("Error", Objects.requireNonNull(e.getMessage()));
        }
        return conn;
    }
}
