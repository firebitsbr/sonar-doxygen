/*
 * SonarQube Doxygen Plugin
 * Copyright (C) 2012 SonarSource
 * dev@sonar.codehaus.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sonar.plugins.doxygen;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author jocs
 */
public class DoxygenPluginTest {
  @Test
  public void testGetExtensions() throws Exception {
    DoxygenPlugin plugin = new DoxygenPlugin();
    assertEquals(5, plugin.getExtensions().size());
  }  
}
