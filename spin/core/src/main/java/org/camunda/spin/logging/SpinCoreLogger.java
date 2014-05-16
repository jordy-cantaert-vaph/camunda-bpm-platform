/* Licensed under the Apache License, Version 2.0 (the "License");
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
package org.camunda.spin.logging;

import org.camunda.spin.SpinRuntimeException;


/**
 * The Logger for the core api.
 *
 * @author Daniel Meyer
 * @author Sebastian Menski
 *
 */
public class SpinCoreLogger extends BaseLogger {

  public static SpinCoreLogger LOG = new SpinCoreLogger();

  public SpinCoreLogger() {
    super("SPIN", "org.camunda.spin", "01");
  }

  public IllegalArgumentException parameterIsNullException(String parameterName) {
    return new IllegalArgumentException(prepareExceptionMessage("001", "Parameter '{}' is null", parameterName));
  }

  public SpinRuntimeException unableToInstantiateClass(String className, Exception cause) {
    return new SpinRuntimeException(prepareExceptionMessage("002", "Unable to instantiate class '{}'", className), cause);
  }

}
