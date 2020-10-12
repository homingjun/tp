package seedu.duke;

import seedu.duke.parser.Parser;
import seedu.duke.project.Project;
import seedu.duke.ui.Ui;

import java.util.ArrayList;
import java.util.Scanner;

public class Duke {
    /**
     * Main entry-point for the java.duke.Duke application.
     */

    static Ui ui = new Ui();

    public static void main(String[] args) {
        ArrayList<Project> projectList = new ArrayList<>(10);
        ui.welcomeUser();
        while (true) {
            new Parser().parser(ui, projectList);
        }
    }
}