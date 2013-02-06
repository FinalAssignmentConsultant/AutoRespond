/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package midlet;

import java.io.IOException;
import java.io.InterruptedIOException;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import javax.wireless.messaging.Message;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.MessageListener;
import org.netbeans.microedition.lcdui.SplashScreen;

/**
 * @author Eko SW
 */
public class AutoRespond extends MIDlet implements CommandListener, MessageListener {

    private boolean midletPaused = false;

    //<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private Form form;
    private TextField txtAutoForward;
    private ChoiceGroup cboTindakan;
    private SplashScreen splashScreen;
    private Command exitCommand;
    private Image image1;
    private Ticker ticker;
    //</editor-fold>//GEN-END:|fields|0|

    /**
     * The AutoRespond constructor.
     */
    public AutoRespond() {
    }

    //<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
    //</editor-fold>//GEN-END:|methods|0|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initilizes the application.
     * It is called only once when the MIDlet is started. The method is called before the <code>startMIDlet</code> method.
     */
    private void initialize() {//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
    }//GEN-BEGIN:|0-initialize|2|
    //</editor-fold>//GEN-END:|0-initialize|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
        switchDisplayable(null, getSplashScreen());//GEN-LINE:|3-startMIDlet|1|3-postAction
    // write post-action user code here
    }//GEN-BEGIN:|3-startMIDlet|2|
    //</editor-fold>//GEN-END:|3-startMIDlet|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
    }//GEN-BEGIN:|4-resumeMIDlet|2|
    //</editor-fold>//GEN-END:|4-resumeMIDlet|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The <code>display</code> instance is taken from <code>getDisplay</code> method. This method is used by all actions in the design for switching displayable.
     * @param alert the Alert which is temporarily set to the display; if <code>null</code>, then <code>nextDisplayable</code> is set immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
        Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
    // write post-switch user code here
    }//GEN-BEGIN:|5-switchDisplayable|2|
    //</editor-fold>//GEN-END:|5-switchDisplayable|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a particular displayable.
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
        if (displayable == form) {//GEN-BEGIN:|7-commandAction|1|22-preAction
            if (command == exitCommand) {//GEN-END:|7-commandAction|1|22-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|2|22-postAction
            // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|3|17-preAction
        } else if (displayable == splashScreen) {
            if (command == SplashScreen.DISMISS_COMMAND) {//GEN-END:|7-commandAction|3|17-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm());//GEN-LINE:|7-commandAction|4|17-postAction
            // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|5|7-postCommandAction
        }//GEN-END:|7-commandAction|5|7-postCommandAction
    // write post-action user code here
    }//GEN-BEGIN:|7-commandAction|6|
    //</editor-fold>//GEN-END:|7-commandAction|6|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: form ">//GEN-BEGIN:|14-getter|0|14-preInit
    /**
     * Returns an initiliazed instance of form component.
     * @return the initialized component instance
     */
    public Form getForm() {
        if (form == null) {//GEN-END:|14-getter|0|14-preInit
            // write pre-init user code here
            form = new Form("Form Tester", new Item[] { getTxtAutoForward(), getCboTindakan() });//GEN-BEGIN:|14-getter|1|14-postInit
            form.setTicker(getTicker());
            form.addCommand(getExitCommand());
            form.setCommandListener(this);//GEN-END:|14-getter|1|14-postInit
        // write post-init user code here
        }//GEN-BEGIN:|14-getter|2|
        return form;
    }
    //</editor-fold>//GEN-END:|14-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: splashScreen ">//GEN-BEGIN:|15-getter|0|15-preInit
    /**
     * Returns an initiliazed instance of splashScreen component.
     * @return the initialized component instance
     */
    public SplashScreen getSplashScreen() {
        if (splashScreen == null) {//GEN-END:|15-getter|0|15-preInit
            // write pre-init user code here
            splashScreen = new SplashScreen(getDisplay());//GEN-BEGIN:|15-getter|1|15-postInit
            splashScreen.setTitle("splashScreen");
            splashScreen.setCommandListener(this);
            splashScreen.setFullScreenMode(true);
            splashScreen.setImage(getImage1());
            splashScreen.setText("SMS Auto Respond");//GEN-END:|15-getter|1|15-postInit
        // write post-init user code here
        }//GEN-BEGIN:|15-getter|2|
        return splashScreen;
    }
    //</editor-fold>//GEN-END:|15-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|21-getter|0|21-preInit
    /**
     * Returns an initiliazed instance of exitCommand component.
     * @return the initialized component instance
     */
    public Command getExitCommand() {
        if (exitCommand == null) {//GEN-END:|21-getter|0|21-preInit
            // write pre-init user code here
            exitCommand = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|21-getter|1|21-postInit
        // write post-init user code here
        }//GEN-BEGIN:|21-getter|2|
        return exitCommand;
    }
    //</editor-fold>//GEN-END:|21-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: image1 ">//GEN-BEGIN:|20-getter|0|20-preInit
    /**
     * Returns an initiliazed instance of image1 component.
     * @return the initialized component instance
     */
    public Image getImage1() {
        if (image1 == null) {//GEN-END:|20-getter|0|20-preInit
            // write pre-init user code here
            try {//GEN-BEGIN:|20-getter|1|20-@java.io.IOException
                image1 = Image.createImage("/swdev.png");
            } catch (java.io.IOException e) {//GEN-END:|20-getter|1|20-@java.io.IOException
                e.printStackTrace();
            }//GEN-LINE:|20-getter|2|20-postInit
        // write post-init user code here
        }//GEN-BEGIN:|20-getter|3|
        return image1;
    }
    //</editor-fold>//GEN-END:|20-getter|3|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: txtAutoForward ">//GEN-BEGIN:|24-getter|0|24-preInit
    /**
     * Returns an initiliazed instance of txtAutoForward component.
     * @return the initialized component instance
     */
    public TextField getTxtAutoForward() {
        if (txtAutoForward == null) {//GEN-END:|24-getter|0|24-preInit
            // write pre-init user code here
            txtAutoForward = new TextField("Nomor HP Auto Forward", null, 32, TextField.ANY);//GEN-LINE:|24-getter|1|24-postInit
        // write post-init user code here
        }//GEN-BEGIN:|24-getter|2|
        return txtAutoForward;
    }
    //</editor-fold>//GEN-END:|24-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: cboTindakan ">//GEN-BEGIN:|25-getter|0|25-preInit
    /**
     * Returns an initiliazed instance of cboTindakan component.
     * @return the initialized component instance
     */
    public ChoiceGroup getCboTindakan() {
        if (cboTindakan == null) {//GEN-END:|25-getter|0|25-preInit
            // write pre-init user code here
            cboTindakan = new ChoiceGroup("Tindakan", Choice.EXCLUSIVE);//GEN-BEGIN:|25-getter|1|25-postInit
            cboTindakan.append("Autoforward semua SMS yang masuk", null);
            cboTindakan.append("Abaikan semua SMS yang masuk, jangan proses", null);
            cboTindakan.append("Autoforward SMS yang masuk, yang diawali dengan kata2 FORWARD", null);
            cboTindakan.setSelectedFlags(new boolean[] { true, false, false });
            cboTindakan.setFont(0, null);
            cboTindakan.setFont(1, null);
            cboTindakan.setFont(2, null);//GEN-END:|25-getter|1|25-postInit
        // write post-init user code here
        }//GEN-BEGIN:|25-getter|2|
        return cboTindakan;
    }
    //</editor-fold>//GEN-END:|25-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: ticker ">//GEN-BEGIN:|27-getter|0|27-preInit
    /**
     * Returns an initiliazed instance of ticker component.
     * @return the initialized component instance
     */
    public Ticker getTicker() {
        if (ticker == null) {//GEN-END:|27-getter|0|27-preInit
            // write pre-init user code here
            ticker = new Ticker("Program ini masih berstatus Percobaan. Perkiraan saya dalam kiriman ke 3 baru bisa running well.");//GEN-LINE:|27-getter|1|27-postInit
        // write post-init user code here
        }//GEN-BEGIN:|27-getter|2|
        return ticker;
    }
    //</editor-fold>//GEN-END:|27-getter|2|

    /**
     * Returns a display instance.
     * @return the display instance.
     */
    public Display getDisplay() {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable(null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started.
     * Checks whether the MIDlet have been already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet();
        } else {
            initialize();
            startMIDlet();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     * @param unconditional if true, then the MIDlet has to be unconditionally terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }

    public void notifyIncomingMessage(MessageConnection mscon) {

        try {
            Message m = mscon.receive();
            if(cboTindakan.getSelectedIndex()==0){
                
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
