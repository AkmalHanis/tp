package seedu.duke.Command;


import eventus.company.Company;
import seedu.duke.venue.VenueList;

public class Command {

    protected String commandType;

    public Command(String commandType) {
        this.commandType = commandType;
    }

    public void execute() {}

    public void execute(VenueList venueList) {}
}

