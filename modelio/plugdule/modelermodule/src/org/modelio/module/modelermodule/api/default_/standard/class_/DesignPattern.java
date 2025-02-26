/* 
 * Copyright 2013-2020 Modeliosoft
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ModelerModule v9.3.00

 * This file was generated on 10/8/20 2:50 PM by Modelio Studio.
 */
package org.modelio.module.modelermodule.api.default_.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.modelermodule.api.IModelerModulePeerModule;
import org.modelio.module.modelermodule.api.ModelerModuleProxyFactory;
import org.modelio.module.modelermodule.impl.ModelerModuleModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << design pattern >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("0485dbda-681e-4361-bcdb-4b0adb5be546")
public class DesignPattern {
    @objid ("256bd65f-a74b-4d75-815c-c47d26f02a71")
    public static final String STEREOTYPE_NAME = "design pattern";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("ba1cfd04-7518-4f6c-bd52-e2ebac804f18")
    protected final Class elt;

    /**
     * Tells whether a {@link DesignPattern proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << design pattern >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a391272c-dca4-4c8a-a2ca-ca2cde0a8539")
    public static boolean canInstantiate(MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(IModelerModulePeerModule.MODULE_NAME, DesignPattern.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << design pattern >> then instantiate a {@link DesignPattern} proxy.
     * 
     * @return a {@link DesignPattern} proxy on the created {@link Class}.
     */
    @objid ("7e41e563-0dc4-45b3-8c8d-4231aa7c084a")
    public static DesignPattern create() {
        ModelElement e = (ModelElement)ModelerModuleModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(IModelerModulePeerModule.MODULE_NAME, DesignPattern.STEREOTYPE_NAME);
        return DesignPattern.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link DesignPattern} proxy from a {@link Class} stereotyped << design pattern >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link DesignPattern} proxy or <i>null</i>.
     */
    @objid ("ec2fbeb7-2b2c-419f-8b74-eda7bea081af")
    public static DesignPattern instantiate(Class obj) {
        return DesignPattern.canInstantiate(obj) ? new DesignPattern(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DesignPattern} proxy from a {@link Class} stereotyped << design pattern >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link DesignPattern} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e4859ba6-2159-43a0-b95f-0d9e6e0a226f")
    public static DesignPattern safeInstantiate(Class obj) throws IllegalArgumentException {
        if (DesignPattern.canInstantiate(obj))
        	return new DesignPattern(obj);
        else
        	throw new IllegalArgumentException("DesignPattern: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8b3edf20-6967-4a1a-a8a3-ca2dfbdb2721")
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        DesignPattern other = (DesignPattern) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("c5b98c70-0081-46c9-b91d-dfe5f4356801")
    public Class getElement() {
        return this.elt;
    }

    @objid ("39a6a1a4-36ec-4122-8558-0658e3e6f40a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("b24034f6-1fe3-430c-88e2-236097a12dd3")
    protected  DesignPattern(Class elt) {
        this.elt = elt;
    }

    @objid ("c58585f8-0f0c-4e0b-82c0-d99f524b2dfc")
    public static final class MdaTypes {
        @objid ("5b49cc50-2b71-4a37-a593-0d4487859487")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a3973efc-ab9b-411f-a848-feeabffb96ae")
        private static Stereotype MDAASSOCDEP;

        @objid ("050c3f4b-b783-4b27-9769-e2ad2a507b17")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c7e1056e-31ea-4344-b112-1cd5d7826196")
        public static void init(IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "007006dc-0000-0139-0000-000000000000");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
            
        }

	static {
        		if(ModelerModuleModule.getInstance() != null) {
        			init(ModelerModuleModule.getInstance().getModuleContext());
        		}
        	}
        
    }

}
