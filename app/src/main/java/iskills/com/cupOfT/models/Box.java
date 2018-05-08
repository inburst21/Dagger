package iskills.com.cupOfT.models;

/**
 * lennyhicks
 * 5/7/18
 */
//TODO 4 make a generic holder T update arguments of all methods
//TODO REMOVE_LATER Change T to Object
public class Box<T> {

    private T object;

    public Box(T t){
        this.object = t;
    }

    public void setContent(T content){
        this.object = content;
    }

    public T getContent() {
        return object;
    }


    //TODO 5 make a getName method that returns the generic class simple name
    //BELOW
    public String getName(){
        return object.getClass().getSimpleName();
    }
    //TODO REMOVE_LATER ABOVE
}
