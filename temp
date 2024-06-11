# Azure Data Explorer - Security and Configuration Guidelines

This document provides detailed information on security and configuration practices for Azure Data Explorer. Follow the guidelines to ensure a secure and compliant deployment of Azure Data Explorer clusters.

---

## Network Security

### NS-1: Establish Network Segmentation Boundaries

| Feature                        | Supported | Enabled By Default | Configuration Responsibility |
|--------------------------------|-----------|--------------------|------------------------------|
| Virtual Network Integration    | True      | False              | Customer                     |
| Network Security Group Support | True      | False              | Customer                     |

**Configuration Guidance:**

- **Virtual Network Integration**: Deploy Azure Data Explorer cluster into a subnet in your VNet. Implement NSG rules to restrict traffic and connect on-premises network to the Azure Data Explorer cluster's subnet.
  - [Deploy Azure Data Explorer cluster into your Virtual Network](https://docs.microsoft.com/azure/data-explorer/deploy-vnet)
- **Network Security Group Support**: Configure NSG rules when Azure Data Explorer is injected into the customer virtual network. It's recommended to follow a private endpoint-based network security implementation.
  - [Configure Network Security Group rules](https://docs.microsoft.com/azure/data-explorer/nsg)

### NS-2: Secure Cloud Services with Network Controls

| Feature                  | Supported | Enabled By Default | Configuration Responsibility |
|--------------------------|-----------|--------------------|------------------------------|
| Azure Private Link       | True      | False              | Customer                     |
| Disable Public Network Access | True | False              | Customer                     |

**Configuration Guidance:**

- **Azure Private Link**: Use private endpoints to secure network access to your cluster, which simplifies deployment and reduces maintenance overhead.
  - [Private endpoints for Azure Data Explorer](https://docs.microsoft.com/azure/data-explorer/private-endpoints)
- **Disable Public Network Access**: Disable public network access using the service-level IP ACL filtering rule or a toggling switch for public network access.
  - [Restrict public access to your Azure Data Explorer cluster](https://docs.microsoft.com/azure/data-explorer/restrict-public-access)

---

## Identity Management

### IM-1: Use Centralized Identity and Authentication System

| Feature                                | Supported | Enabled By Default | Configuration Responsibility |
|----------------------------------------|-----------|--------------------|------------------------------|
| Azure AD Authentication for Data Plane | True      | False              | Customer                     |
| Local Authentication Methods for Data Plane | False | Not Applicable | Not Applicable |

**Configuration Guidance:**

- Use Azure Active Directory (Azure AD) as the default authentication method to control data plane access.
  - [How to authenticate with Azure Active Directory (Azure AD) for Azure Data Explorer access](https://docs.microsoft.com/azure/data-explorer/azure-ad-authentication)

### IM-3: Manage Application Identities Securely and Automatically

| Feature           | Supported | Enabled By Default | Configuration Responsibility |
|-------------------|-----------|--------------------|------------------------------|
| Managed Identities | True      | True               | Microsoft                    |
| Service Principals | True      | True               | Microsoft                    |

**Feature Notes:**

- Azure Data Explorer supports System and User Managed Identities and can use Managed Identities to authenticate with other services for Ingestion and Query.
- No additional configurations are required as these are enabled by default.
  - [Managed identities overview](https://docs.microsoft.com/azure/active-directory/managed-identities-azure-resources/overview)
  - [Azure Active Directory authentication using an application](https://docs.microsoft.com/azure/data-explorer/azure-ad-authentication)

### IM-7: Restrict Resource Access Based on Conditions

| Feature                         | Supported | Enabled By Default | Configuration Responsibility |
|---------------------------------|-----------|--------------------|------------------------------|
| Conditional Access for Data Plane | True    | False              | Customer                     |

**Configuration Guidance:**

- Define conditions and criteria for Azure AD conditional access to control data plane access based on location, device, or sign-in behavior.
  - [Conditional Access with Azure Data Explorer](https://docs.microsoft.com/azure/data-explorer/conditional-access)

---

## Data Protection

### DP-1: Discover, Classify, and Label Sensitive Data

| Feature                           | Supported | Enabled By Default | Configuration Responsibility |
|-----------------------------------|-----------|--------------------|------------------------------|
| Sensitive Data Discovery and Classification | True | False             | Customer                     |

**Configuration Guidance:**

- Use Microsoft Purview to scan, classify, and label sensitive data in Azure Data Explorer.
  - [Azure Purview](https://docs.microsoft.com/azure/purview/)

### DP-2: Monitor Anomalies and Threats Targeting Sensitive Data

| Feature                         | Supported | Enabled By Default | Configuration Responsibility |
|---------------------------------|-----------|--------------------|------------------------------|
| Data Leakage/Loss Prevention    | True      | False              | Customer                     |

**Configuration Guidance:**

- Control outbound access at the cluster level by defining callout policies to allow access to specified SQL, storage, or other endpoints to mitigate data exfiltration risks.
  - [Restrict outbound access from your Azure Data Explorer cluster](https://docs.microsoft.com/azure/data-explorer/restrict-outbound-access)

### DP-3: Encrypt Sensitive Data in Transit

| Feature                 | Supported | Enabled By Default | Configuration Responsibility |
|-------------------------|-----------|--------------------|------------------------------|
| Data in Transit Encryption | True   | True               | Microsoft                    |

**Configuration Guidance:**

- No additional configurations are required as this feature is enabled by default.
  - [Data Encryption in Azure Data Explorer](https://docs.microsoft.com/azure/data-explorer/data-encryption)

### DP-4: Enable Data at Rest Encryption by Default

| Feature                           | Supported | Enabled By Default | Configuration Responsibility |
|-----------------------------------|-----------|--------------------|------------------------------|
| Data at Rest Encryption Using Platform Keys | True | True             | Microsoft                    |

**Configuration Guidance:**

- No additional configurations are required as this feature is enabled by default.
  - [Data Encryption in Azure Data Explorer](https://docs.microsoft.com/azure/data-explorer/data-encryption)

### DP-5: Use Customer-Managed Key Option in Data at Rest Encryption When Required

| Feature                               | Supported | Enabled By Default | Configuration Responsibility |
|---------------------------------------|-----------|--------------------|------------------------------|
| Data at Rest Encryption Using CMK     | True      | False              | Customer                     |

**Configuration Guidance:**

- Use customer-managed keys to have greater control over encryption keys. Manage encryption at the storage level with your own keys, providing flexibility to create, rotate, disable, and revoke access controls.
  - [Encryption using configure customer-managed keys](https://docs.microsoft.com/azure/data-explorer/customer-managed-keys)

---

## Asset Management

### AM-2: Use Only Approved Services

| Feature           | Supported | Enabled By Default | Configuration Responsibility |
|-------------------|-----------|--------------------|------------------------------|
| Azure Policy Support | True   | False              | Customer                     |

**Configuration Guidance:**

- Use Microsoft Defender for Cloud to configure Azure Policy to audit and enforce configurations of Azure resources. Monitor for configuration deviations and enforce secure configurations using Azure Policy.
  - [Azure Policy Regulatory Compliance controls for Azure Data Explorer](https://docs.microsoft.com/azure/data-explorer/security-compliance)

---

## Logging and Threat Detection

### LT-4: Enable Logging for Security Investigation

| Feature           | Supported | Enabled By Default | Configuration Responsibility |
|-------------------|-----------|--------------------|------------------------------|
| Azure Resource Logs | True   | False              | Customer                     |

**Configuration Guidance:**

- Use Azure Data Explorer's diagnostic logs for insights on ingestion, commands, queries, and tables. Export logs to Azure Storage, Event Hub, or Log Analytics for monitoring and analysis.
  - [Monitor Azure Data Explorer ingestion, commands, queries, and tables using diagnostic logs](https://docs.microsoft.com/azure/data-explorer/diagnostic-logs)

---

For further details, refer to the specific configuration guidelines and references provided under each section.
