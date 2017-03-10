/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateDocument" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDocumentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A description of the document that was updated.
     * </p>
     */
    private DocumentDescription documentDescription;

    /**
     * <p>
     * A description of the document that was updated.
     * </p>
     * 
     * @param documentDescription
     *        A description of the document that was updated.
     */

    public void setDocumentDescription(DocumentDescription documentDescription) {
        this.documentDescription = documentDescription;
    }

    /**
     * <p>
     * A description of the document that was updated.
     * </p>
     * 
     * @return A description of the document that was updated.
     */

    public DocumentDescription getDocumentDescription() {
        return this.documentDescription;
    }

    /**
     * <p>
     * A description of the document that was updated.
     * </p>
     * 
     * @param documentDescription
     *        A description of the document that was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDocumentResult withDocumentDescription(DocumentDescription documentDescription) {
        setDocumentDescription(documentDescription);
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
        if (getDocumentDescription() != null)
            sb.append("DocumentDescription: ").append(getDocumentDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDocumentResult == false)
            return false;
        UpdateDocumentResult other = (UpdateDocumentResult) obj;
        if (other.getDocumentDescription() == null ^ this.getDocumentDescription() == null)
            return false;
        if (other.getDocumentDescription() != null && other.getDocumentDescription().equals(this.getDocumentDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentDescription() == null) ? 0 : getDocumentDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDocumentResult clone() {
        try {
            return (UpdateDocumentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}