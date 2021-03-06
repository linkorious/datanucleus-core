/**********************************************************************
Copyright (c) 2013 Andy Jefferson and others. All rights reserved.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

Contributors:
    ...
**********************************************************************/
package org.datanucleus.flush;

import org.datanucleus.metadata.AbstractMemberMetaData;
import org.datanucleus.store.types.scostore.Store;

/**
 * (Queued) operation performed on a backing store.
 */
public interface SCOOperation extends Operation
{
    /**
     * Accessor for the metadata for the member that this operation is for.
     * @return The member metadata
     */
    AbstractMemberMetaData getMemberMetaData();

    /**
     * Accessor for the backing store for this operation.
     * @return The backing store
     */
    Store getStore();
}