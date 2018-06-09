package aut.company;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class MenuBar {

    private JMenuBar jMenuBar;
    private JMenu download;
    private JMenuItem addNewDownload;
    private JMenuItem remove;
    private JMenuItem pause;
    private JMenuItem resume;
    private JMenuItem cancel;
    private JMenuItem setting;
    private JMenuItem exit;
    private JMenu help;
    private JMenuItem about;

    public MenuBar() {
        jMenuBar=new JMenuBar();
        KeyStroke keyStrokeNewDownload= KeyStroke.getKeyStroke(KeyEvent.VK_A,KeyEvent.CTRL_DOWN_MASK);
        KeyStroke keyStrokeRemove= KeyStroke.getKeyStroke(KeyEvent.VK_V,KeyEvent.CTRL_DOWN_MASK);
        KeyStroke keyStrokePause= KeyStroke.getKeyStroke(KeyEvent.VK_P,KeyEvent.CTRL_DOWN_MASK);
        KeyStroke keyStrokeResume= KeyStroke.getKeyStroke(KeyEvent.VK_M,KeyEvent.CTRL_DOWN_MASK);
        KeyStroke keyStrokeCancel= KeyStroke.getKeyStroke(KeyEvent.VK_C,KeyEvent.CTRL_DOWN_MASK);
        KeyStroke keyStrokeSetting= KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_DOWN_MASK);
        KeyStroke keyStrokeExit= KeyStroke.getKeyStroke(KeyEvent.VK_E,KeyEvent.CTRL_DOWN_MASK);

        KeyStroke keyStrokeAbout= KeyStroke.getKeyStroke(KeyEvent.VK_B,KeyEvent.CTRL_DOWN_MASK);

        download=new JMenu("Download");
        download.setMnemonic(KeyEvent.VK_D);

        addNewDownload=new JMenuItem("new download");
        addNewDownload.setMnemonic(KeyEvent.VK_A);
        addNewDownload.setAccelerator(keyStrokeNewDownload);

        remove=new JMenuItem("remove");
        remove.setMnemonic(KeyEvent.VK_V);
        remove.setAccelerator(keyStrokeRemove);

        pause=new JMenuItem("pause");
        pause.setMnemonic(KeyEvent.VK_P);
        pause.setAccelerator(keyStrokePause);

        resume=new JMenuItem("resume");
        resume.setMnemonic(KeyEvent.VK_M);
        resume.setAccelerator(keyStrokeResume);

        cancel=new JMenuItem("cancel");
        cancel.setMnemonic(KeyEvent.VK_C);
        cancel.setAccelerator(keyStrokeCancel);

        setting=new JMenuItem("setting");
        setting.setMnemonic(KeyEvent.VK_S);
        setting.setAccelerator(keyStrokeSetting);

        exit=new JMenuItem("exit");
        exit.setMnemonic(KeyEvent.VK_E);
        exit.setAccelerator(keyStrokeExit);

        download.add(addNewDownload);
        download.add(remove);
        download.add(pause);
        download.add(resume);
        download.add(cancel);
        download.add(setting);
        download.add(exit);

        help=new JMenu("Help");
        help.setMnemonic(KeyEvent.VK_H);
        about=new JMenuItem("about");
        about.setMnemonic(KeyEvent.VK_B);
        about.setAccelerator(keyStrokeAbout);

        help.add(about);

        jMenuBar.add(download);
        jMenuBar.add(help);
    }

    public JMenuItem getRemove() {
        return remove;
    }

    public JMenuItem getPause() {
        return pause;
    }

    public JMenuItem getResume() {
        return resume;
    }

    public JMenuItem getCancel() {
        return cancel;
    }

    public JMenuItem getSetting() {
        return setting;
    }

    public JMenuItem getExit() {
        return exit;
    }

    public JMenuItem getAbout() {
        return about;
    }

    public JMenuItem getAddNewDownload() {
        return addNewDownload;
    }

    public JMenuBar getJMenuBar() {
        return jMenuBar;
    }
}
