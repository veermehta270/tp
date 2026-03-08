package ccamanager.command;

import ccamanager.manager.CcaManager;
import ccamanager.manager.ResidentManager;
import ccamanager.ui.Ui;

public class DeleteCcaCommand extends Command{
    private String ccaName;

    public DeleteCcaCommand(String ccaName) {
        this.ccaName = ccaName;
    }

    @Override
    public void execute(CcaManager ccaManager, ResidentManager residentManager, Ui ui) {
        try {
            ccaManager.deleteCca(ccaName);
            ui.showMessage("CCA deleted: " + ccaName);
        } catch (Exception e) {
            ui.showMessage(e.getMessage());
        }
    }
}
