import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;


public class MainWindow extends JFrame {

    private JPanel nodeAttributePanel;

    public MainWindow(String title) {
        super(title);
        $$$setupUI$$$();
        getContentPane().add(nodeAttributePanel);
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createUIComponents();
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return nodeAttributePanel;
    }

    private void createUIComponents() {
        nodeAttributePanel = (JPanel) new NodeAttributePanel().$$$getRootComponent$$$();

    }
}