/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the data structure of a method's request or response payload.
 * </p>
 * <div class="remarks">
 * <p>
 * A request model defines the data structure of the client-supplied request payload. A response model defines the data
 * structure of the response payload returned by the back end. Although not required, models are useful for mapping
 * payloads between the front end and back end.
 * </p>
 * <p>
 * A model is used for generating an API's SDK, validating the input request body, and creating a skeletal mapping
 * template.
 * </p>
 * </div> <div class="seeAlso"> <a>Method</a>, <a>MethodResponse</a>, <a
 * href="[[AwsDocsUrlPrefix]]/apigateway/latest/developerguide/models-mappings.html">Models and Mappings</a> </div>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetModelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the model resource.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the model. Must be an alphanumeric string.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the model.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The schema for the model. For <code>application/json</code> models, this should be <a href="[[JsonSchemaUrl]]"
     * target="_blank">JSON schema draft 4</a> model. Do not include
     * "\*&#47;" characters in the description of any properties because such "\*&#47;" characters may be interpreted as
     * the closing marker for comments in some languages, such as Java or JavaScript, causing the installation of your
     * API's SDK generated by API Gateway to fail.
     * </p>
     */
    private String schema;
    /**
     * <p>
     * The content-type for the model.
     * </p>
     */
    private String contentType;

    /**
     * <p>
     * The identifier for the model resource.
     * </p>
     * 
     * @param id
     *        The identifier for the model resource.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the model resource.
     * </p>
     * 
     * @return The identifier for the model resource.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier for the model resource.
     * </p>
     * 
     * @param id
     *        The identifier for the model resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the model. Must be an alphanumeric string.
     * </p>
     * 
     * @param name
     *        The name of the model. Must be an alphanumeric string.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the model. Must be an alphanumeric string.
     * </p>
     * 
     * @return The name of the model. Must be an alphanumeric string.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the model. Must be an alphanumeric string.
     * </p>
     * 
     * @param name
     *        The name of the model. Must be an alphanumeric string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the model.
     * </p>
     * 
     * @param description
     *        The description of the model.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the model.
     * </p>
     * 
     * @return The description of the model.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the model.
     * </p>
     * 
     * @param description
     *        The description of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The schema for the model. For <code>application/json</code> models, this should be <a href="[[JsonSchemaUrl]]"
     * target="_blank">JSON schema draft 4</a> model. Do not include
     * "\*&#47;" characters in the description of any properties because such "\*&#47;" characters may be interpreted as
     * the closing marker for comments in some languages, such as Java or JavaScript, causing the installation of your
     * API's SDK generated by API Gateway to fail.
     * </p>
     * 
     * @param schema
     *        The schema for the model. For <code>application/json</code> models, this should be <a
     *        href="[[JsonSchemaUrl]]" target="_blank">JSON schema draft 4</a> model. Do not include
     *        "\*&#47;" characters in the description of any properties because such "\*&#47;" characters may be
     *        interpreted as the closing marker for comments in some languages, such as Java or JavaScript, causing the
     *        installation of your API's SDK generated by API Gateway to fail.
     */

    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * <p>
     * The schema for the model. For <code>application/json</code> models, this should be <a href="[[JsonSchemaUrl]]"
     * target="_blank">JSON schema draft 4</a> model. Do not include
     * "\*&#47;" characters in the description of any properties because such "\*&#47;" characters may be interpreted as
     * the closing marker for comments in some languages, such as Java or JavaScript, causing the installation of your
     * API's SDK generated by API Gateway to fail.
     * </p>
     * 
     * @return The schema for the model. For <code>application/json</code> models, this should be <a
     *         href="[[JsonSchemaUrl]]" target="_blank">JSON schema draft 4</a> model. Do not include
     *         "\*&#47;" characters in the description of any properties because such "\*&#47;" characters may be
     *         interpreted as the closing marker for comments in some languages, such as Java or JavaScript, causing the
     *         installation of your API's SDK generated by API Gateway to fail.
     */

    public String getSchema() {
        return this.schema;
    }

    /**
     * <p>
     * The schema for the model. For <code>application/json</code> models, this should be <a href="[[JsonSchemaUrl]]"
     * target="_blank">JSON schema draft 4</a> model. Do not include
     * "\*&#47;" characters in the description of any properties because such "\*&#47;" characters may be interpreted as
     * the closing marker for comments in some languages, such as Java or JavaScript, causing the installation of your
     * API's SDK generated by API Gateway to fail.
     * </p>
     * 
     * @param schema
     *        The schema for the model. For <code>application/json</code> models, this should be <a
     *        href="[[JsonSchemaUrl]]" target="_blank">JSON schema draft 4</a> model. Do not include
     *        "\*&#47;" characters in the description of any properties because such "\*&#47;" characters may be
     *        interpreted as the closing marker for comments in some languages, such as Java or JavaScript, causing the
     *        installation of your API's SDK generated by API Gateway to fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelResult withSchema(String schema) {
        setSchema(schema);
        return this;
    }

    /**
     * <p>
     * The content-type for the model.
     * </p>
     * 
     * @param contentType
     *        The content-type for the model.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The content-type for the model.
     * </p>
     * 
     * @return The content-type for the model.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The content-type for the model.
     * </p>
     * 
     * @param contentType
     *        The content-type for the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelResult withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSchema() != null)
            sb.append("Schema: ").append(getSchema()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetModelResult == false)
            return false;
        GetModelResult other = (GetModelResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        return hashCode;
    }

    @Override
    public GetModelResult clone() {
        try {
            return (GetModelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
