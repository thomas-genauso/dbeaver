/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2019 Serge Rider (serge@jkiss.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jkiss.dbeaver.model.navigator.meta;

import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;

/**
 * DBXTreeFolder
 */
public class DBXTreeFolder extends DBXTreeNode
{
    private String type;
    private String label;
    private String description;

    public DBXTreeFolder(AbstractDescriptor source, DBXTreeNode parent, String id, String type, String label, boolean navigable, boolean virtual, String visibleIf)
    {
        super(source, parent, id, navigable, false, virtual, false, visibleIf, null);
        this.type = type;
        this.label = label;
    }

    DBXTreeFolder(AbstractDescriptor source, DBXTreeNode parent, DBXTreeFolder folder)
    {
        super(source, parent, folder);
        this.type = folder.type;
        this.label = folder.label;
        this.description = folder.description;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getNodeType(DBPDataSource dataSource)
    {
        return label;
    }

    @Override
    public String getChildrenType(DBPDataSource dataSource)
    {
        return label;
    }

    @Override
    public String toString() {
        return "Folder " + label;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
}
