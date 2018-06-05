import java.awt.event.FocusAdapter;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.text.JTextComponent;

public class CursorAtStartFocusListener extends FocusAdapter{
	@Override
    public void focusGained(java.awt.event.FocusEvent evt) {
        Object source = evt.getSource();
        if (source instanceof JTextComponent) {
            JTextComponent comp = (JTextComponent) source;
            comp.setCaretPosition(0);
        } else {
            Logger.getLogger(getClass().getName()).log(Level.INFO,
                    "A text component expected instead of {0}",
                    source.getClass().getName());
        }
    }

}
