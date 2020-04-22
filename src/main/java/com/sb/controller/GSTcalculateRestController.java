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
	public String calculateAmt(
			@QueryParam("base")double amt,
			@QueryParam("gstp")int  per)
	{
		String message=null;
		if(amt>0.0 && per>0)
		{
			double gstamt= amt*per/100;
			double famt=amt+gstamt;
			message="final amount is"+famt;
		}else{
			message="pleasse enter base cost(base) and gst amount(gstp)";
		}
		return message;
	}

}
