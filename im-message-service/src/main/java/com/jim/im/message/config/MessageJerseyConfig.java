/*
 * Copyright 2014 Jim. All Rights Reserved.
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
package com.jim.im.message.config;

import org.springframework.stereotype.Component;

import com.jim.im.config.GenericJerseyConfig;
import com.jim.im.rest.filter.RequestEnvFilter;

/**
 * @version 1.0.0
 */
@Component
public class MessageJerseyConfig extends GenericJerseyConfig {

    public MessageJerseyConfig() {
        register(RequestEnvFilter.class);
        packages("com.jim.im.message.rest");
    }
}
