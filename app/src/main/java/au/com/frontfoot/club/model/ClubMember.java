package au.com.frontfoot.club.model;

/**
 * Created by gabriel.pereira@publicisfrontfoot.com.au on 23/05/2016.
 */

public class ClubMember {

    private String name;

    private String age;

    //    @Exclude
    //    public String ignoreThisField;

    public ClubMember() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(final String age) {
        this.age = age;
    }
}
