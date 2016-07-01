package robsonsouza.app.workingwithlistview;

/**
 * Created by ess on 17/08/14.
 */
public class Country {

    private String name;
    private int flagResID;

    public Country(String name, int flagResID) {
        this.name = name;
        this.flagResID = flagResID;
    }

    public String getName() {
        return name;
    }

    public int getFlagResID() {
        return flagResID;
    }

}
