/* SAAF: A static analyzer for APK files.
 * Copyright (C) 2013  syssec.rub.de
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.rub.syssec.saaf.application.methods;

import de.rub.syssec.saaf.model.application.CodeLineInterface;

public class Link {
	private CodeLineInterface from = null;
	private CodeLineInterface to = null;

	private String label = null;

	// could be done with integers as well
	// could save label names of targets or whatever
	public Link(CodeLineInterface from, CodeLineInterface to) {
		// super();
		this.from = from;
		this.to = to;
	}

	public Link(CodeLineInterface from, CodeLineInterface to, String label) {
		// super();
		this.from = from;
		this.to = to;
		this.label = label;
	}

	public CodeLineInterface getFrom() {
		return from;
	}

	public CodeLineInterface getTo() {
		return to;
	}

	public String getLabel() {
		return label;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Link other = (Link) obj;
		if (from == null) {
			if (other.from != null)
				return false;
		} else if (!from.equals(other.from))
			return false;
		if (to == null) {
			if (other.to != null)
				return false;
		} else if (!to.equals(other.to))
			return false;
		return true;
	}

}
