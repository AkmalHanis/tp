package seedu.duke.command;


import seedu.duke.CompanyList;

public class DeleteCommand extends Command{
    protected int taskNum;
    public DeleteCommand(String commandType, int taskNum){
        super(commandType);
        this.taskNum = taskNum;
    }

    @Override
    public void execute(CompanyList companyList) {
        companyList.deleteCompanyInformation(taskNum);
    }
}
