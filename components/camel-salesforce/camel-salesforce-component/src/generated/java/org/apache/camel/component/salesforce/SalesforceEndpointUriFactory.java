/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.salesforce;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class SalesforceEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":operationName:topicName";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(65);
        props.add("allOrNone");
        props.add("apexMethod");
        props.add("apexQueryParams");
        props.add("apexUrl");
        props.add("apiVersion");
        props.add("backoffIncrement");
        props.add("batchId");
        props.add("bridgeErrorHandler");
        props.add("compositeMethod");
        props.add("contentType");
        props.add("defaultReplayId");
        props.add("exceptionHandler");
        props.add("exchangePattern");
        props.add("fallBackReplayId");
        props.add("format");
        props.add("httpClient");
        props.add("includeDetails");
        props.add("initialReplayIdMap");
        props.add("instanceId");
        props.add("jobId");
        props.add("lazyStartProducer");
        props.add("limit");
        props.add("locator");
        props.add("maxBackoff");
        props.add("maxRecords");
        props.add("notFoundBehaviour");
        props.add("notifyForFields");
        props.add("notifyForOperationCreate");
        props.add("notifyForOperationDelete");
        props.add("notifyForOperationUndelete");
        props.add("notifyForOperationUpdate");
        props.add("notifyForOperations");
        props.add("objectMapper");
        props.add("operationName");
        props.add("pkChunking");
        props.add("pkChunkingChunkSize");
        props.add("pkChunkingParent");
        props.add("pkChunkingStartRow");
        props.add("pubSubBatchSize");
        props.add("pubSubDeserializeType");
        props.add("pubSubPojoClass");
        props.add("pubSubReplayId");
        props.add("queryLocator");
        props.add("rawHttpHeaders");
        props.add("rawMethod");
        props.add("rawPath");
        props.add("rawPayload");
        props.add("rawQueryParameters");
        props.add("replayId");
        props.add("replayPreset");
        props.add("reportId");
        props.add("reportMetadata");
        props.add("resultId");
        props.add("sObjectBlobFieldName");
        props.add("sObjectClass");
        props.add("sObjectFields");
        props.add("sObjectId");
        props.add("sObjectIdName");
        props.add("sObjectIdValue");
        props.add("sObjectName");
        props.add("sObjectQuery");
        props.add("sObjectSearch");
        props.add("streamQueryResult");
        props.add("topicName");
        props.add("updateTopic");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
        MULTI_VALUE_PREFIXES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "salesforce".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "operationName", null, true, copy);
        uri = buildPathParameter(syntax, uri, "topicName", null, false, copy);
        uri = buildQueryParameters(uri, copy, encode);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public Set<String> multiValuePrefixes() {
        return MULTI_VALUE_PREFIXES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

