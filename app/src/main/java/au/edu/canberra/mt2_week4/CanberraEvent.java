package au.edu.canberra.mt2_week4; /**
 * Created by MichaelRajchert on 9/03/2017.
 */

import java.util.Date;

class CanberraEvent {
    String title;
    int imageResource;
    Date date;

    public CanberraEvent(String title, int imageResource, Date date) {
        this.title = title;
        this.imageResource = imageResource;
        this.date = date;
    }

    public String getTitle(){
        return this.title;
    }

    public int getImageResource(){
        return this.imageResource;
    }

    public String getDateString(){
        return this.date.toString();
    }

    @Override
    public String toString(){
        return title;
    }
}
