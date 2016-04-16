package com.example.shadow.howalive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Shadow on 2016/3/19.
 */
public class Jdbc {
    private final String USERNAME = "root";
    private final String PASSWORD = "FzYakN6zlPDA";
    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String URL = "jdbc:mysql://139.129.20.252:3306/ep";
    private Connection mConnection;
    private PreparedStatement mPreparedStatement;
    private ResultSet mResultSet;
    public Connection getConnection(){
        try {
            mConnection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return mConnection;
    }
    public Map<String, Object> findSimpleResult(String sql, List<Object> params)
            throws SQLException {
        Map<String, Object> map = new HashMap<String, Object>();
        int index = 1;
        mPreparedStatement = mConnection.prepareStatement(sql);
        if((params != null) && (!params.isEmpty())) {
            for(int i = 0; i < params.size(); i++) {
                mPreparedStatement.setObject(index++, params.get(i));
            }
        }
        mResultSet = mPreparedStatement.executeQuery();            //返回查询结果
        ResultSetMetaData resultSetMateData = mResultSet.getMetaData();        //获得列的相关信息
        int cols_len = resultSetMateData.getColumnCount();            //获得列的长度
        while(mResultSet.next()) {
            for(int i = 0; i < cols_len; i++) {
                String cols_name = resultSetMateData.getColumnName(i+1) ;
                Object cols_value = mResultSet.getObject(cols_name);
                if(cols_value == null) {
                    cols_value = "";
                }
                map.put(cols_name, cols_value);
            }
        }
        return map;
    }
    public void releaseConnection() {
        if(mResultSet != null) {                //关闭ResultSet对象
            try {
                mResultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(mPreparedStatement != null) {        //关闭PreparedStatement对象
            try {
                mPreparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(mConnection != null) {            //关闭Connection对象
            try {
                mConnection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
