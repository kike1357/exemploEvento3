package exemploevento3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author epastorizalorenzo
 */
public class ClaseExterna implements ActionListener {
    Ventana obx = new Ventana();

    @Override
    public void actionPerformed(ActionEvent e) {
        // obx.etiqueta.setText("activando etiqueta");
        obx.etiqueta.setText("**********************");
    
    }
}
