package Model;

public class Tag {

    public int id;
    public String tag;
    public String description;
    public int image_id;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }

    public Tag(int id, String tag, String description, int image_id) {
        this.id = id;
        this.tag = tag;
        this.description = description;
        this.image_id = image_id;
    }
}
