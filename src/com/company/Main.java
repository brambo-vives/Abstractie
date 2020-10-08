package com.company;
import Dao.Database;
import com.company.Filemanger.FileLoader;
import com.company.Filemanger.SaveImage;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        SaveImage test =  new SaveImage();
        test.puk();
        test.databaseCon();
        test.path();

    }




}


