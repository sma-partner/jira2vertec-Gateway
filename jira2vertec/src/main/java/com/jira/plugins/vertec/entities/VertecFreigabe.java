/**
 * Copyright 2013 GARAIO AG <www.garaio.com>
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

package com.jira.plugins.vertec.entities;

import com.jira.plugins.vertec.soap.VertecSoapResultDef;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement(name = "Freigabe")
public class VertecFreigabe extends VertecBaseEntity {
    private Date bis;

    public Date getBis() {
        return bis;
    }

    @XmlElement(name="bis")
    public void setBis(Date bis) {
        this.bis = bis;
    }

    public static VertecSoapResultDef createResultDef()
    {
        VertecSoapResultDef resultDef = new VertecSoapResultDef();
        resultDef.getMembers().add("bis");
        return resultDef;
    }
}