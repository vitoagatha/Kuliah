package belajar.java.data;

public class Category {

    private String id;

    private boolean expensive;

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public boolean isExpensive(){
        return this.expensive;
    }

    public void setExpensive(boolean expensive){
        this.expensive = expensive;
    }
}
