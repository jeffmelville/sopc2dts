/*
sopc2dts - Devicetree generation for Altera systems

Copyright (C) 2012 Walter Goossens <waltergoossens@home.nl>

This library is free software; you can redistribute it and/or
modify it under the terms of the GNU Lesser General Public
License as published by the Free Software Foundation; either
version 2.1 of the License, or (at your option) any later version.

This library is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public
License along with this library; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
*/
package sopc2dts.lib.devicetree;

public class DTPropBool extends DTProperty {

	public DTPropBool(String name) {
		this(name, null, null);
	}
	public DTPropBool(String name, String label, String comment) {
		super(name, label, comment, DTPropType.BOOL);
	}

	@Override
	public String toString(int indent) {
		return indent(indent) + (label != null ? label + ": " : "" ) 
		+ name + (comment != null ? ";\t/* " + comment + "*/\n": ";\n");
	}
	@Override
	protected byte[] getValueBytes() {
		return new byte[0];
	}

}
