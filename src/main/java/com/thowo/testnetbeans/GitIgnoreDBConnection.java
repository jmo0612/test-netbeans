/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thowo.testnetbeans;

import com.thowo.jmjavaframework.db.JMConnection;
import com.thowo.jmjavaframework.db.JMDBMySQL;
import java.io.File;

/**
 *
 * @author jimi
 */
public class GitIgnoreDBConnection {
    public static JMConnection mySQLConnection(){
        return new JMConnection(new JMDBMySQL("remotemysql.com","3306","8vbZvACR5B","8vbZvACR5B","N01E4WgIFN"));
    }
    public static JMConnection mySQLiteConnection(){
        return new JMConnection(new File("SQLITE_FILE_PATH"));
    }
}