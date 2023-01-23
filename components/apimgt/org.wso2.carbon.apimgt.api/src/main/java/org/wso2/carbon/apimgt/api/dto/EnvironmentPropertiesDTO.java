/*
 *  Copyright (c) 2021, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.apimgt.api.dto;

/**
 * model for environment specific API properties.
 */
public class EnvironmentPropertiesDTO {
  
    private String productionEndpoint;

    private String productionCertificate;

    private String sandboxEndpoint;
    private String sandboxEndpointChoreo;

    private String sandBoxCertificate;

    public String getProductionEndpoint() {
        return productionEndpoint;
    }

    public void setProductionEndpoint(String productionEndpoint) {
        this.productionEndpoint = productionEndpoint;
    }

    public String getSandboxEndpoint() {
        return sandboxEndpoint;
    }

    public void setSandboxEndpoint(String sandboxEndpoint) {
        this.sandboxEndpoint = sandboxEndpoint;
    }

    public String getSandboxEndpointChoreo() {
        return sandboxEndpointChoreo;
    }

    public void setSandboxEndpointChoreo(String sandboxEndpointChoreo) {
        this.sandboxEndpointChoreo = sandboxEndpointChoreo;
    }

    public String getProductionCertificate() {
        return productionCertificate;
    }

    public void setProductionCertificate(String productionCertificate) {
        this.productionCertificate = productionCertificate;
    }

    public String getSandBoxCertificate() {
        return sandBoxCertificate;
    }

    public void setSandBoxCertificate(String sandBoxCertificate) {
        this.sandBoxCertificate = sandBoxCertificate;
    }
}

