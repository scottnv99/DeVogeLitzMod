/*      Copyright 2016 Arizona Board of regents on behalf of
 *                  The University of Arizona
 *                     All Rights Reserved
 *         (USE & RESTRICTION - Please read COPYRIGHT file)
 *
 *  Version    : DEVSJAVA 2.7
 *  Date       : 11-12-2016
 *  Authors	   : Scott DeVoge and Scott Litz
 */

package DeVogeLitzMod;

import java.awt.*;

import GenCol.*;


import model.modeling.*;
import model.simulation.*;

import view.modeling.ViewableAtomic;
import view.modeling.ViewableComponent;
import view.modeling.ViewableDigraph;
import view.simView.*;

public class eventGenerator extends ViewableDigraph{

	public eventGenerator(){
	    super("eg");
	
	    ViewableAtomic ccg = new clientConnectionsGenerator("ccg", 5);
	    ViewableAtomic scg = new systemConfigurationGenerator("scg", 5);
	
	    add(ccg);
	    add(scg);
	
	    addInport("in");
	    addInport("start");
	    addInport("stop");
	    addOutport("out");
	
	    addCoupling(this, "in", ccg, "in");
	    addCoupling(this, "in", scg, "in");
	    addCoupling(this, "start", ccg, "start");
	    addCoupling(this, "start", scg, "start");
	    addCoupling(this, "stop", scg, "stop");
	    addCoupling(this, "stop", ccg, "stop");
	    addCoupling(ccg, "out", this, "out");
	    addCoupling(scg, "out", this, "out");
	}
    
    /**
     * Automatically generated by the SimView program.
     * Do not edit this manually, as such changes will get overwritten.
     */
    public void layoutForSimView()
    {
        preferredSize = new Dimension(275, 150);
        ((ViewableComponent)withName("ccg")).setPreferredLocation(new Point(-5, 22));
        ((ViewableComponent)withName("scg")).setPreferredLocation(new Point(-5, 85));
    }
}

