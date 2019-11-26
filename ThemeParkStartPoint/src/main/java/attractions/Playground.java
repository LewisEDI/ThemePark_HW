package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity {

    public int maxAge;

    public Playground(String name, int rating, int maxAge) {
        super(name, rating);
        this.maxAge = maxAge;

    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() < this.maxAge) {
            return true;
        }
        return false;
    }

}
