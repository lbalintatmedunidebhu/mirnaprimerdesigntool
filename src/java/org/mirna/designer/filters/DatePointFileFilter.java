/*
* The miRNA Design Tool is based on the UPL (Universal Probe Library) probes to design primer(s) for microRNA detection. The usergets the best result by two different Tm calculating methods.  The tool designs the miRNA specific sequence of the stem-loop RT primer as well. 
*
* copyright (C) 2009-2012 Astrid Research Ltd. 
* copyright (C) November, 2012 University of Debrecen, Clinical Genomic Center, Medical and Health Science Center, Debrecen, Hungary
*
* The miRNA Design Tool is based on the UPL (Universal Probe Library) probes to design primer(s) for microRNA detection.  The usergets the best result by two different Tm calculating methods.  The tool designs the miRNA specific sequence of the stem-loop RT primer as well. 
*
*    miRNA Design Tool is free software: you can redistribute it and/or modify
*    it under the terms of the GNU General Public License as published by
*    the Free Software Foundation, either version 3 of the License, or
*    (at your option) any later version.
*
*    miRNA Design Tool is distributed in the hope that it will be useful,
*    but WITHOUT ANY WARRANTY; without even the implied warranty of
*    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
*    GNU General Public License for more details.
*
*    You should have received a copy of the GNU General Public License
*    along with miRNA Primer Design Tool.  If not, see <http://www.gnu.org/licenses/>.
*/
package org.mirna.designer.filters;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import org.mirna.designer.controller.DesignerUtil;

/**
 *
 * @author Attila
 */
public class DatePointFileFilter implements FileFilter {
    
    private ArrayList<String> extensions = new ArrayList<String>();
    
    public DatePointFileFilter() {}
    
    public ArrayList<String> getExtensions() {
        return this.extensions;
    }

    @Override
    public boolean accept(File pathname) {
        
        String fileName = pathname.getName();
        String extension = DesignerUtil.getFileExtension( fileName );
        
        boolean valid = (!extension.equals("log")) && (fileName.contains("miRNADesigner"));
        
        if( valid )
            this.extensions.add( extension );
        
        return valid;
    }

}
