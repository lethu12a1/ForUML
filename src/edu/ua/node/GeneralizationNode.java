/*
Copyright (c) 2016, Aziz Nanthaamornphong and Anawat Leathongkum

Redistribution and use in source and binary forms, with or without modification, are 
permitted provided that the following conditions are met:

1. Redistributions of source code must retain the above copyright notice, this list of 
conditions and the following disclaimer.

2. Redistributions in binary form must reproduce the above copyright notice, this list of 
conditions and the following disclaimer in the documentation and/or other materials 
provided with the distribution.

3. Neither the names of the copyright holders nor the names of its contributors may be 
used to endorse or promote products derived from this software without specific prior 
written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY 
EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES 
OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES 
(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; 
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY 
THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING 
NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, 
EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
package edu.ua.node;

import java.util.ArrayList;
import java.util.List;
import org.xml.sax.helpers.AttributesImpl;

public class GeneralizationNode extends UMLNode{
    
     private List nodes = new ArrayList();
     private String id = "";
     
     private String child = "";
     private String parent = "";
    
     
     public void setChildClass(String cls){
         child = cls;
     }
     
     public String getChildClass(){
         return child;
     }
     
     public void setParentClass(String cls){
         parent = cls;
     }
     
     public String getParentClass(){
         return parent;
     }
     
     public GeneralizationNode(){
         id = Long.toString(this.hashCode());
     }
    
    public void addNode(UMLNode node){
        nodes.add(node);
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getId(){
        return  Long.toString(this.hashCode());
    }
    
    @Override
    public String getName() {
        return "UML:Generalization";
    }

    @Override
    public List getChildren() {
        return nodes;
    }

    @Override
    public int getChildCount() {
       return nodes.size();
    }

    @Override
    public org.xml.sax.Attributes getAttributes() {
        AttributesImpl attributes = new AttributesImpl();
         attributes.addAttribute("", "xmi.idref", "", "", id);
        return attributes;
    }
    
}
