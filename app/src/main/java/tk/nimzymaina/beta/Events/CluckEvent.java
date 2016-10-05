package tk.nimzymaina.beta.Events;

/**
 * Created by user on 7/9/2016.
 */
public class CluckEvent {

    private String message;

    public CluckEvent(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
