/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.chimesdkmessaging.model.transform;

import com.amazonaws.services.chimesdkmessaging.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ChannelAssociatedWithFlowSummary
 */
class ChannelAssociatedWithFlowSummaryJsonMarshaller {

    public void marshall(ChannelAssociatedWithFlowSummary channelAssociatedWithFlowSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (channelAssociatedWithFlowSummary.getName() != null) {
            String name = channelAssociatedWithFlowSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (channelAssociatedWithFlowSummary.getChannelArn() != null) {
            String channelArn = channelAssociatedWithFlowSummary.getChannelArn();
            jsonWriter.name("ChannelArn");
            jsonWriter.value(channelArn);
        }
        if (channelAssociatedWithFlowSummary.getMode() != null) {
            String mode = channelAssociatedWithFlowSummary.getMode();
            jsonWriter.name("Mode");
            jsonWriter.value(mode);
        }
        if (channelAssociatedWithFlowSummary.getPrivacy() != null) {
            String privacy = channelAssociatedWithFlowSummary.getPrivacy();
            jsonWriter.name("Privacy");
            jsonWriter.value(privacy);
        }
        if (channelAssociatedWithFlowSummary.getMetadata() != null) {
            String metadata = channelAssociatedWithFlowSummary.getMetadata();
            jsonWriter.name("Metadata");
            jsonWriter.value(metadata);
        }
        jsonWriter.endObject();
    }

    private static ChannelAssociatedWithFlowSummaryJsonMarshaller instance;

    public static ChannelAssociatedWithFlowSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ChannelAssociatedWithFlowSummaryJsonMarshaller();
        return instance;
    }
}