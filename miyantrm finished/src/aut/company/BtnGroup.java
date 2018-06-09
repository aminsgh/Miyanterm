package aut.company;

import javax.swing.*;
import java.awt.*;

public class BtnGroup {
    private JButton newDownland;
    private JButton pause;
    private JButton resume;
    private JButton cancel;
    private JButton remove;
    private JButton settings;

    public BtnGroup() {
        newDownland = new JButton(new ImageIcon("C:\\Users\\amin_\\IdeaProjects\\miyantrm finished\\plus.png"));
        newDownland.setToolTipText("new download");
        remove = new JButton(new ImageIcon("C:\\Users\\amin_\\IdeaProjects\\miyantrm finished\\remove.png"));
        remove.setToolTipText("delete last queue download");
        pause = new JButton(new ImageIcon("C:\\Users\\amin_\\IdeaProjects\\miyantrm finished\\pause.png"));
        pause.setToolTipText("pause downloading");
        resume = new JButton(new ImageIcon("C:\\Users\\amin_\\IdeaProjects\\miyantrm finished\\resume.png"));
        resume.setToolTipText("continue download");
        cancel = new JButton(new ImageIcon("C:\\Users\\amin_\\IdeaProjects\\miyantrm finished\\cancel.png"));
        cancel.setToolTipText("stop  downloading");
        settings = new JButton(new ImageIcon("C:\\Users\\amin_\\IdeaProjects\\miyantrm finished\\setting.png"));
        settings.setToolTipText("setting");

    }

    public JButton getNewDownland() {
        return newDownland;
    }

    public JButton getPause() {
        return pause;
    }

    public JButton getResume() {
        return resume;
    }

    public JButton getCancel() {
        return cancel;
    }

    public JButton getRemove() {
        return remove;
    }

    public JButton getSettings() {
        return settings;
    }
}
