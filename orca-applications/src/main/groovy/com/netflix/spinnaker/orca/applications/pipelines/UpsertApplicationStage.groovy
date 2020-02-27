/*
 * Copyright 2014 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.spinnaker.orca.applications.pipelines

import com.netflix.spinnaker.orca.applications.tasks.UpsertApplicationTask
import com.netflix.spinnaker.orca.pipeline.StageDefinitionBuilder
import com.netflix.spinnaker.orca.pipeline.TaskNode
import com.netflix.spinnaker.orca.pipeline.model.StageExecutionImpl
import groovy.transform.CompileStatic
import org.springframework.stereotype.Component

@Component
@CompileStatic
class UpsertApplicationStage implements StageDefinitionBuilder {
  @Override
  void taskGraph(StageExecutionImpl stage, TaskNode.Builder builder) {
    builder
      .withTask("upsertApplication", UpsertApplicationTask)
  }
}
