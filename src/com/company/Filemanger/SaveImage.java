package com.company.Filemanger;

import Dao.Database;
import Dao.ImageDao;
import Model.Image;

import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Calendar;

public class SaveImage {
    private  Connection dbConnection;

    public  void dbconn() throws SQLException {

        dbConnection = Database.getInstance().getConnection();
    }
//method to get a path
    public void path() throws SQLException {

        String path = "";
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fc.setCurrentDirectory(new java.io.File("C:/Users/bram-/Desktop/Ilvo/project"));
        fc.setDialogTitle("Hello world");
        if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            path = (fc.getSelectedFile().getAbsolutePath());
            System.out.println(path);

            //var voor de image
     java.sql.Date uDate = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            System.out.println(uDate);

           ImageDao imageDao = new ImageDao(dbConnection);
           Image image = new Image
                  (path, uDate);
           imageDao.createImage(image);


        }


    }

    public void puk(){
        System.out.println("x");
    }


    public void databaseCon() throws SQLException {
        dbConnection = Database.getInstance().getConnection();
    }

   public static void VarImage() throws SQLException{
        java.sql.Date uDate = new java.sql.Date(Calendar.getInstance().getTime().getTime());
        System.out.println(uDate);
   }
   public static void insert() throws  SQLException{

   }

}