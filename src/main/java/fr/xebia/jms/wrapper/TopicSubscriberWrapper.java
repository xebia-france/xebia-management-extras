/*
 * Copyright 2008-2009 Xebia and the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fr.xebia.jms.wrapper;


import javax.jms.JMSException;
import javax.jms.Topic;
import javax.jms.TopicSubscriber;


/**
 * 
 * @author <a href="mailto:cyrille@cyrilleleclerc.com">Cyrille Le Clerc</a>
 */
public class TopicSubscriberWrapper extends MessageConsumerWrapper implements TopicSubscriber {

    private final TopicSubscriber delegate;

    public TopicSubscriberWrapper(TopicSubscriber delegate) {
        super(delegate);
        this.delegate = delegate;
    }

    public boolean getNoLocal() throws JMSException {
        return delegate.getNoLocal();
    }

    public Topic getTopic() throws JMSException {
        return delegate.getTopic();
    }

}
