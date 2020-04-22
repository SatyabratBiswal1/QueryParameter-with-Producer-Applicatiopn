package com.sb.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/*Module: GstService  that is having path : /gst
Operation name: calculateAmt()
Parameters: baseCost and gstPercenatge
Return String output: Final Cost is : ( baseCost + gstAmt)

gstAmt = baseCost * gstPercenatge / 100.0*/

@Path("/gst")
public class GSTcalculateRestController {
	@GET
	public double calculateAmt(@QueryParam("basbasee")int basecost,@QueryParam("gstp")int  gstPercentage)
	{
		double gst=basecost * gstPercentage/ 100.0;
		return gst;
	}

}
