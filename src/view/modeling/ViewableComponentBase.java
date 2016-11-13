/**
 * An object that holds member variables common to the ViewableAtomic and
 * ViewableDigraph classes, so they aren't specified twice.
 *
 * @author  Jeff Mather
 */ 

package view.modeling;

import java.awt.*;
import java.util.List;
import java.util.*;
import util.*;


public class ViewableComponentBase
{
    /**
     * A list of all of this component's test-inputs, for all ports.
     */
    protected List testInputs = new ArrayList();
    
    /**
     * For each of this component's ports, the group of test inputs
     * that may be injected into that port, mapped by port name.
     */
    protected Map testInputsByPortName = new HashMap();

    /**
     * Where this component would like the upper-left corner of its view to be
     * positioned, relative to its parent component.
     */
    protected Point preferredLocation = new Point(50, 50);

    /**
     * A string containing the code that should be inserted for this
     * component's setPreferredLocation call in the layout method
     * automatically generated by the SimView program.
     * The code specifies how to dynamically build this component's
     * name, since for some components the name is not generated
     * until runtime.  If this is left null, this component's normal name
     * will be used, instead.
     */
    protected String layoutName;

    /**
     * Whether this component should be not be displayed because of its being
     * part of a black box or itself-hidden superordinate component.
     */
    protected boolean hidden;
}