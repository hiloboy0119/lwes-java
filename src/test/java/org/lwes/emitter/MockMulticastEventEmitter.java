/*======================================================================*
 * Copyright (c) 2010, Frank Maritato All rights reserved.              *
 *                                                                      *
 * Licensed under the New BSD License (the "License"); you may not use  *
 * this file except in compliance with the License.  Unless required    *
 * by applicable law or agreed to in writing, software distributed      *
 * under the License is distributed on an "AS IS" BASIS, WITHOUT        *
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.     *
 * See the License for the specific language governing permissions and  *
 * limitations under the License. See accompanying LICENSE file.        *
 *======================================================================*/

package org.lwes.emitter;
/**
 * @author fmaritato
 */

import java.util.LinkedList;
import java.util.List;

import org.lwes.Event;
import org.lwes.EventSystemException;

public class MockMulticastEventEmitter extends MulticastEventEmitter {

    private LinkedList<Event> events = new LinkedList<Event>();

    @Override
    protected void emit(byte[] bytes) {
        try {
            events.add(getFactory().createEvent(bytes, false));
        }
        catch (EventSystemException e) {
            e.printStackTrace();
        }
    }

    public List<Event> getEvents() {
        List<Event> l = new LinkedList<Event>();
        l.addAll(events);
        return l;
    }
}
