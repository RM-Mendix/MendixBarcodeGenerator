// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package barcode.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the Barcode module

	/**
	* default lognode for barcode module
	*/
	public static java.lang.String getLogNode()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("Barcode.LogNode");
	}
}