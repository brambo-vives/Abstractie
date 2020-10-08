package Model;

public class Label {

    public int id;
    public String tag;
    public String path;
    public int Image_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getImage_id() {
        return Image_id;
    }

    public void setImage_id(int image_id) {
        Image_id = image_id;
    }


    public Label(int id, String tag, String path, int image_id) {
        this.id = id;
        this.tag = tag;
        this.path = path;
        Image_id = image_id;
    }
}
