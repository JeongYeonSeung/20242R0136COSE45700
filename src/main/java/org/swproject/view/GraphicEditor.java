package org.swproject.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import org.swproject.controller.Controller;
import org.swproject.view.canvas.CanvasPanel;
import org.swproject.view.menu.EditorMenu;
import org.swproject.view.property.PropertyPanel;

public class GraphicEditor extends JFrame {
    private static final int EDITOR_WIDTH = 800;
    private static final int EDITOR_HEIGHT = 600;

    public GraphicEditor(Controller controller) {
        setTitle("Canvas");
        setSize(EDITOR_WIDTH, EDITOR_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(new EditorMenu(controller), BorderLayout.BEFORE_FIRST_LINE);
        add(new CanvasPanel(controller), BorderLayout.CENTER);
        add(new PropertyPanel(controller), BorderLayout.EAST);
    }
}
