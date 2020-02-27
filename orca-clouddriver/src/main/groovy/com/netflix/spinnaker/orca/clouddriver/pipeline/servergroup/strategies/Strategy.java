/*
 * Copyright 2016 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.spinnaker.orca.clouddriver.pipeline.servergroup.strategies;

import com.netflix.spinnaker.orca.kato.pipeline.Nameable;
import com.netflix.spinnaker.orca.pipeline.model.StageExecutionImpl;
import java.util.Collections;
import java.util.List;

public interface Strategy extends Nameable {
  List<StageExecutionImpl> composeBeforeStages(StageExecutionImpl parent);

  List<StageExecutionImpl> composeAfterStages(StageExecutionImpl parent);

  default List<StageExecutionImpl> composeOnFailureStages(StageExecutionImpl parent) {
    return Collections.emptyList();
  }

  default boolean replacesBasicSteps() {
    return false;
  }
}
