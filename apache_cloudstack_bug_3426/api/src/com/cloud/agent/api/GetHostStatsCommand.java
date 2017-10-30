// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
package com.cloud.agent.api;

import com.cloud.agent.api.LogLevel.Log4jLevel;

@LogLevel(Log4jLevel.Trace)
public class GetHostStatsCommand extends Command
{
    String hostGuid;
    String hostName;
    long hostId;

    protected GetHostStatsCommand() {
    }

    public GetHostStatsCommand(String hostGuid, String hostName, long hostId) {
        this.hostGuid = hostGuid;
        this.hostName = hostName;
        this.hostId = hostId;
    }

    public String getHostGuid(){
        return this.hostGuid;
    }

    public String getHostName(){
        return this.hostName;
    }

    public long getHostId(){
        return this.hostId;
    }

    @Override
    public boolean executeInSequence() {
        return false;
    }
}
