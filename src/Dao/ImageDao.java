package Dao;

import Model.Image;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

public class ImageDao implements Queries{

    private Connection dbConnection;
    private PreparedStatement stmtInsertImage;

    public ImageDao(Connection dbConnection) throws SQLException {
        this.dbConnection = dbConnection;
        stmtInsertImage = dbConnection.prepareStatement(INSERTIMGAGE, Statement.RETURN_GENERATED_KEYS);
    }


    public void createImage(Image image) throws SQLException{
        stmtInsertImage.setInt(1, Image.getId());
        stmtInsertImage.setString(2,Image.getPath());
        stmtInsertImage.setDate(3, (java.sql.Date) Image.getDate());
        stmtInsertImage.executeUpdate();
        ResultSet rs = stmtInsertImage.getGeneratedKeys();
        rs.next();
        Integer Image_id = rs.getInt(1);
        image.setId(Image_id);
    }



}

