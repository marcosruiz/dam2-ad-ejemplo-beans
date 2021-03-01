package propiedadesRestringidas;

import java.beans.*;

public class BeanReceptor implements VetoableChangeListener {

  public void vetoableChange(PropertyChangeEvent event) throws PropertyVetoException {
    // comprobación de las condiciones
    // TODO
    // se lanza exceptción si no se aprueba el cambio
    throw new PropertyVetoException("mensaje", event);
  }
}
