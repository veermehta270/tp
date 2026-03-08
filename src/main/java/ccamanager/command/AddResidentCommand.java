package ccamanager.command;

import ccamanager.manager.CcaManager;
import ccamanager.manager.ResidentManager;
import ccamanager.ui.Ui;

/**
Command to add a resident and his CCA
 */
public class AddResidentCommand extends Command{
    private String residentName;
    private String matricNumber;
    private String ccaName;

    public AddResidentCommand(String residentName,String matricNumber,String ccaName){
        this.residentName=residentName;
        this.matricNumber=matricNumber;
        this.ccaName=ccaName;
    }

    public void execute(CcaManager ccaManager, ResidentManager residentManager, Ui ui) {
        ResidentManager.addResident(residentName,matricNumber,ccaName);
        ui.showMessage("CCA added: " + residentName +" "+ matricNumber+ " "+ccaName);
    }


}
