/*
 * Copyright 2011 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.gwtproject.dom.builder.client;

import org.gwtproject.dom.builder.shared.MapBuilder;
import org.gwtproject.dom.client.MapElement;

/**
 * DOM-based implementation of {@link MapBuilder}.
 */
public class DomMapBuilder extends DomElementBuilderBase<MapBuilder, MapElement> implements
        MapBuilder {

  DomMapBuilder(DomBuilderImpl delegate) {
    super(delegate);
  }

  @Override
  public MapBuilder name(String name) {
    assertCanAddAttribute().setName(name);
    return this;
  }
}
