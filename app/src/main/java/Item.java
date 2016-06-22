/**
 * Created by andreakim on 6/20/16.
 */
public class Item {

    public void addList (String name, String desc) {
        this.name = name;
        this.desc = desc;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private String desc;



}
