package Model;

import java.util.ArrayList;
import java.util.Date;

public class Image {
    public static int id;
    public static String path;
    public static Date date;
    public static ArrayList<String> tags;


    public Image(Image image){
        this.id = image.getId();
        this.path =image.getPath();
        this.date = image.getDate();
    }

    //constructor voor insert
    public Image (String path, Date date){
        this.path = path;
        this.date = date;

    }






    public static int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public static Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }


}
