package iskills.com.cupOfT.models;

/**
 * lennyhicks
 * 5/7/18
 */
public class Box<T> {

    private T object;

    public Box(T t){
        this.object = t;
    }

    public void setContent(T content){
        this.object = content;
    }

    public T getContent() {
        if(object == null) {
            try {
                throw new IllegalAccessException();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return object;
    }

    public String getName(){
        return object.getClass().getSimpleName();
    }
}
